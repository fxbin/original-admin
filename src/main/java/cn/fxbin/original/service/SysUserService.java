package cn.fxbin.original.service;

import cn.fxbin.bubble.fireworks.core.model.PageResult;
import cn.fxbin.original.controller.user.dto.UserPageDTO;
import cn.fxbin.original.controller.user.vo.RoleVO;
import cn.fxbin.original.controller.user.vo.UserVO;
import cn.fxbin.original.model.SysUser;
import cn.fxbin.original.controller.user.dto.UserCreateDTO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * SysUserService
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 18:56
 */
public interface SysUserService {

    /**
     * save
     *
     * @since 2020/9/21 13:57
     * @param createDTO cn.fxbin.original.controller.user.dto.UserCreateDTO
     * @return java.lang.Integer
     */
    Integer save(UserCreateDTO createDTO);

    /**
     * findPage
     *
     * @since 2020/9/21 15:29
     * @param userPageDTO cn.fxbin.original.controller.user.dto.UserPageDTO
     * @return cn.fxbin.bubble.fireworks.core.model.PageResult<cn.fxbin.original.controller.user.vo.UserVO>
     */
    PageResult<UserVO> findPage(UserPageDTO userPageDTO);

    /**
     * findByUsername
     *
     * @since 2020/9/21 17:25
     * @param username username
     * @return cn.fxbin.original.controller.user.vo.UserVO
     */
    UserVO findByUsername(String username);

    /**
     * findUserRoles
     *
     * @since 2020/9/21 17:29
     * @param userId userId
     * @return java.util.List<cn.fxbin.original.controller.user.vo.RoleVO>
     */
    List<RoleVO> findUserRoles(Integer userId);

}
