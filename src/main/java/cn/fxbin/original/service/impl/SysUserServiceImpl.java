package cn.fxbin.original.service.impl;

import cn.fxbin.bubble.fireworks.core.model.PageResult;
import cn.fxbin.bubble.fireworks.core.util.CollectionUtils;
import cn.fxbin.original.controller.user.dto.UserCreateDTO;
import cn.fxbin.original.controller.user.dto.UserPageDTO;
import cn.fxbin.original.controller.user.vo.RoleVO;
import cn.fxbin.original.controller.user.vo.UserVO;
import cn.fxbin.original.convert.RoleConvert;
import cn.fxbin.original.convert.UserConvert;
import cn.fxbin.original.mapper.SysRoleMapper;
import cn.fxbin.original.mapper.SysUserMapper;
import cn.fxbin.original.mapper.SysUserRoleMapper;
import cn.fxbin.original.model.SysRole;
import cn.fxbin.original.model.SysUser;
import cn.fxbin.original.model.SysUserRole;
import cn.fxbin.original.service.SysUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SysUserServiceImpl
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:06
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper userMapper;

    @Resource
    private SysUserRoleMapper userRoleMapper;

    @Resource
    private SysRoleMapper roleMapper;

    /**
     * save
     *
     * @param createDTO cn.fxbin.original.controller.user.dto.UserCreateDTO
     * @return java.lang.Integer
     * @since 2020/9/21 13:57
     */
    @Override
    public Integer save(UserCreateDTO createDTO) {
        SysUser user = UserConvert.INSTANCE.convert(createDTO);
        return userMapper.insert(user);
    }

    /**
     * findPage
     *
     * @param userPageDTO cn.fxbin.original.controller.user.dto.UserPageDTO
     * @return cn.fxbin.bubble.fireworks.core.model.PageResult<cn.fxbin.original.controller.user.vo.UserVO>
     * @since 2020/9/21 15:29
     */
    @Override
    public PageResult<UserVO> findPage(UserPageDTO userPageDTO) {
        PageResult<UserVO> pageResult = new PageResult<>();

        QueryWrapper<SysUser> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.lambda()
                .likeLeftIfPresent(SysUser::getUsername, userPageDTO.getUsername())
                .likeIfPresent(SysUser::getName, userPageDTO.getName())
                .eqIfPresent(SysUser::getDeptId, userPageDTO.getDeptId());

        Page<SysUser> sysUserPage = userMapper.selectPage(
                new Page<>(userPageDTO.getPageNo(), userPageDTO.getPageSize()),
                userQueryWrapper);

        return pageResult.setList(UserConvert.INSTANCE.convert(sysUserPage.getRecords()))
                .setTotal(sysUserPage.getTotal())
                .setTotalPage(sysUserPage.getPages())
                .setPageNo(sysUserPage.getCurrent())
                .setPageSize(sysUserPage.getSize());
    }

    /**
     * findByUsername
     *
     * @param username username
     * @return cn.fxbin.original.controller.user.vo.UserVO
     * @since 2020/9/21 17:25
     */
    @Override
    public UserVO findByUsername(String username) {
        return UserConvert.INSTANCE.convert(userMapper.findByUsername(username));
    }

    /**
     * findUserRoles
     *
     * @param userId userId
     * @return java.util.List<cn.fxbin.original.controller.user.vo.RoleVO>
     * @since 2020/9/21 17:29
     */
    @Override
    public List<RoleVO> findUserRoles(Integer userId) {
        QueryWrapper<SysUserRole> userRoleQueryWrapper = new QueryWrapper<>();
        userRoleQueryWrapper.lambda()
                .select(SysUserRole::getRoleId)
                .eq(SysUserRole::getUserId, userId)
                .orderByAsc(SysUserRole::getRoleId);

        List<Integer> roleIdList = userRoleMapper.selectList(userRoleQueryWrapper)
                .stream()
                .map(SysUserRole::getRoleId)
                .collect(Collectors.toList());

        List<SysRole> roleList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(roleIdList)) {
            roleList = roleMapper.selectBatchIds(roleIdList);
        }

        return RoleConvert.INSTANCE.convert(roleList);
    }

}
