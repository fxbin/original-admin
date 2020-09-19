package cn.fxbin.original.service.impl;

import cn.fxbin.original.mapper.SysUserMapper;
import cn.fxbin.original.model.SysUser;
import cn.fxbin.original.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * SysUserServiceImpl
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:06
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public List<SysUser> list() {
        return null;
    }
}
