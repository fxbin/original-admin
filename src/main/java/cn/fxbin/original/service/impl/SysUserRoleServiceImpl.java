package cn.fxbin.original.service.impl;

import cn.fxbin.original.controller.user.vo.RoleVO;
import cn.fxbin.original.convert.RoleConvert;
import cn.fxbin.original.mapper.SysRoleMapper;
import cn.fxbin.original.mapper.SysUserRoleMapper;
import cn.fxbin.original.model.SysRole;
import cn.fxbin.original.model.SysUserRole;
import cn.fxbin.original.service.SysUserRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SysUserRoleServiceImpl
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:06
 */
@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

}
