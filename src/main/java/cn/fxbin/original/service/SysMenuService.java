package cn.fxbin.original.service;

import cn.fxbin.original.controller.menu.dto.MenuCreateDTO;
import cn.fxbin.original.controller.menu.vo.MenuVO;
import cn.fxbin.original.model.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * SysMenuService
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 18:55
 */
public interface SysMenuService {

    /**
     * save
     *
     * @since 2020/9/22 18:50
     * @param createDTO cn.fxbin.original.controller.menu.dto.MenuCreateDTO
     * @return java.lang.Integer
     */
    Integer save(MenuCreateDTO createDTO);

    /**
     * findMenuTree
     *
     * @since 2020/9/22 18:51
     * @return java.util.List<cn.fxbin.original.controller.menu.vo.MenuVO>
     */
    List<MenuVO> findMenuTree();
}
