package cn.fxbin.original.service;

import cn.fxbin.bubble.fireworks.core.model.PageResult;
import cn.fxbin.original.controller.user.dto.RoleCreateDTO;
import cn.fxbin.original.controller.user.dto.RolePageDTO;
import cn.fxbin.original.controller.user.vo.RoleVO;

/**
 * SysRoleService
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 18:55
 */
public interface SysRoleService {

    /**
     * save
     *
     * @since 2020/9/22 18:33
     * @param createDTO cn.fxbin.original.controller.user.dto.RoleCreateDTO
     * @return java.lang.Integer
     */
    Integer save(RoleCreateDTO createDTO);

    /**
     * findPage
     *
     * @since 2020/9/22 18:33
     * @param rolePageDTO cn.fxbin.original.controller.user.dto.RolePageDTO
     * @return cn.fxbin.bubble.fireworks.core.model.PageResult<cn.fxbin.original.controller.user.vo.RoleVO>
     */
    PageResult<RoleVO> findPage(RolePageDTO rolePageDTO);
}
