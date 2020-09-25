package cn.fxbin.original.service.impl;

import cn.fxbin.original.controller.dict.dto.DictCreateDTO;
import cn.fxbin.original.controller.dict.vo.DictVO;
import cn.fxbin.original.convert.DictConvert;
import cn.fxbin.original.mapper.SysDictMapper;
import cn.fxbin.original.model.SysDict;
import cn.fxbin.original.service.SysDictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * SysDictServiceImpl
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:04
 */
@Service
public class SysDictServiceImpl extends ServiceImpl<SysDictMapper, SysDict> implements SysDictService {

    /**
     * save
     *
     * @param createDTO cn.fxbin.original.controller.dict.dto.DictCreateDTO
     * @return java.lang.Integer
     * @since 2020/9/23 11:27
     */
    @Override
    public Integer save(DictCreateDTO createDTO) {
        SysDict sysDict = DictConvert.INSTANCE.convert(createDTO);
        return this.baseMapper.insert(sysDict);
    }

    /**
     * findByLabel
     *
     * @param label 根据名称查询
     * @return java.util.List<cn.fxbin.original.controller.dict.vo.DictVO>
     * @since 2020/9/18 19:32
     */
    @Override
    public List<DictVO> findByLabel(String label) {
        List<SysDict> list = this.baseMapper.findByLabel(label);
        return DictConvert.INSTANCE.convert(list);
    }
}
