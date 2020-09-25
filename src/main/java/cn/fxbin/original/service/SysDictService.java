package cn.fxbin.original.service;

import cn.fxbin.original.controller.dict.dto.DictCreateDTO;
import cn.fxbin.original.controller.dict.vo.DictVO;
import cn.fxbin.original.model.SysDict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * SysDictService
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 18:55
 */
public interface SysDictService {

    /**
     * save
     *
     * @since 2020/9/23 11:27
     * @param createDTO cn.fxbin.original.controller.dict.dto.DictCreateDTO
     * @return java.lang.Integer
     */
    Integer save(DictCreateDTO createDTO);

    /**
     * findByLabel
     *
     * @since 2020/9/18 19:32
     * @param label 根据名称查询
     * @return java.util.List<cn.fxbin.original.controller.dict.vo.DictVO>
     */
    List<DictVO> findByLabel(String label);

}
