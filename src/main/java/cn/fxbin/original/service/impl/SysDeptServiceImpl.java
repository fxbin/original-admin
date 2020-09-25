package cn.fxbin.original.service.impl;

import cn.fxbin.bubble.fireworks.core.util.ObjectUtils;
import cn.fxbin.original.common.constant.SysConstants;
import cn.fxbin.original.controller.dept.dto.DeptCreateDTO;
import cn.fxbin.original.controller.dept.vo.DeptVO;
import cn.fxbin.original.convert.DeptConvert;
import cn.fxbin.original.mapper.SysDeptMapper;
import cn.fxbin.original.model.SysDept;
import cn.fxbin.original.service.SysDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SysDeptServiceImpl
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:04
 */
@Slf4j
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
        List<DeptVO> allDept = DeptConvert.INSTANCE.convert(deptMapper.findAll());

        List<DeptVO> list = allDept.stream()
                .filter(dept -> SysConstants.DEFAULT_DEPT_PARENT_ID.equals(dept.getParentId()))
                .map(dept -> dept.setLevel(0))
                .collect(Collectors.toList());
        log.info("dept list:{}", list);
        findChildren(allDept, list);
        return list;
    }


    private void findChildren(List<DeptVO> allDept, List<DeptVO> list) {
        list.forEach(dept -> {
            List<DeptVO> children = new ArrayList<>();
            allDept.forEach(dbDept -> {
                if (dept.getId().equals(dbDept.getParentId())) {
                    dbDept.setParentName(dept.getName());
                    dbDept.setLevel(dept.getLevel() + 1);
                    children.add(dbDept);
                }
            });
            dept.setChildren(children);
            findChildren(allDept, children);
        });
    }

}
