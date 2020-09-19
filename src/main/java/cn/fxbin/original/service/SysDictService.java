package cn.fxbin.original.service;

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
public interface SysDictService extends IService<SysDict> {

    /**
     * findByLable
     *
     * @since 2020/9/18 19:32
     * @param lable 根据名称查询
     * @return java.util.List<cn.fxbin.original.model.SysDict>
     */
    List<SysDict> findByLable(String lable);

}
