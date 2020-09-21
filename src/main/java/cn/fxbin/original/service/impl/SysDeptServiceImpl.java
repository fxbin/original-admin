package cn.fxbin.original.service.impl;

import cn.fxbin.bubble.fireworks.core.util.ObjectUtils;
import cn.fxbin.original.controller.dept.dto.DeptCreateDTO;
import cn.fxbin.original.controller.dept.vo.DeptVO;
import cn.fxbin.original.convert.DeptConvert;
import cn.fxbin.original.mapper.SysDeptMapper;
import cn.fxbin.original.model.SysDept;
import cn.fxbin.original.service.SysDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * SysDeptServiceImpl
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:04
 */
@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Resource
    private SysDeptMapper deptMapper;

    /**
     * save
     *
     * @param createDTO cn.fxbin.original.controller.dept.dto.DeptCreateDTO
     * @return java.lang.Integer
     * @since 2020/9/21 18:38
     */
    @Override
    public Integer save(DeptCreateDTO createDTO) {
        SysDept sysDept = DeptConvert.INSTANCE.convert(createDTO);
        if (ObjectUtils.isEmpty(sysDept.getId())) {
            return deptMapper.insert(sysDept);
        } else {
            return deptMapper.updateById(sysDept);
        }
    }

    /**
     * findDeptTree
     *
     * @return java.util.List<cn.fxbin.original.controller.dept.vo.DeptVO>
     * @since 2020/9/21 18:46
     */
    @Override
    public List<DeptVO> findDeptTree() {
        return null;
    }
}
