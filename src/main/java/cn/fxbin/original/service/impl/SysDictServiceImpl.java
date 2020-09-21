package cn.fxbin.original.service.impl;

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
     * findByLable
     *
     * @param lable 根据名称查询
     * @return java.util.List<cn.fxbin.original.model.SysDict>
     * @since 2020/9/18 19:32
     */
    @Override
    public List<SysDict> findByLable(String lable) {
        return null;
    }
}
