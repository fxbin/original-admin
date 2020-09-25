package cn.fxbin.original.service.impl;

import cn.fxbin.bubble.fireworks.core.model.PageResult;
import cn.fxbin.original.controller.user.dto.RoleCreateDTO;
import cn.fxbin.original.controller.user.dto.RolePageDTO;
import cn.fxbin.original.controller.user.vo.RoleVO;
import cn.fxbin.original.controller.user.vo.UserVO;
import cn.fxbin.original.convert.RoleConvert;
import cn.fxbin.original.convert.UserConvert;
import cn.fxbin.original.mapper.SysRoleMapper;
import cn.fxbin.original.model.SysRole;
import cn.fxbin.original.model.SysUser;
import cn.fxbin.original.service.SysRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * SysRoleServiceImpl
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:05
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {


    /**
     * save
     *
     * @param createDTO cn.fxbin.original.controller.user.dto.RoleCreateDTO
     * @return java.lang.Integer
     * @since 2020/9/22 18:33
     */
    @Override
    public Integer save(RoleCreateDTO createDTO) {
        SysRole sysRole = RoleConvert.INSTANCE.convert(createDTO);
        return this.baseMapper.insert(sysRole);
    }

    /**
     * findPage
     *
     * @param rolePageDTO cn.fxbin.original.controller.user.dto.RolePageDTO
     * @return cn.fxbin.bubble.fireworks.core.model.PageResult<cn.fxbin.original.controller.user.vo.RoleVO>
     * @since 2020/9/22 18:33
     */
    @Override
    public PageResult<RoleVO> findPage(RolePageDTO rolePageDTO) {

        PageResult<RoleVO> pageResult = new PageResult<>();

        QueryWrapper<SysRole> roleQueryWrapper = new QueryWrapper<>();
        roleQueryWrapper.lambda()
                .likeIfPresent(SysRole::getName, rolePageDTO.getRoleName());

        Page<SysRole> sysRolePage = this.baseMapper.selectPage(
                new Page<>(rolePageDTO.getPageNo(), rolePageDTO.getPageSize()),
                roleQueryWrapper);

        return pageResult.setList(RoleConvert.INSTANCE.convert(sysRolePage.getRecords()))
                .setTotal(sysRolePage.getTotal())
                .setTotalPage(sysRolePage.getPages())
                .setPageNo(sysRolePage.getCurrent())
                .setPageSize(sysRolePage.getSize());

    }
}
