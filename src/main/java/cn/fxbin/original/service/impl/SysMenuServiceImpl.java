package cn.fxbin.original.service.impl;

import cn.fxbin.original.common.constant.SysConstants;
import cn.fxbin.original.controller.dept.vo.DeptVO;
import cn.fxbin.original.controller.menu.dto.MenuCreateDTO;
import cn.fxbin.original.controller.menu.vo.MenuVO;
import cn.fxbin.original.convert.MenuConvert;
import cn.fxbin.original.mapper.SysMenuMapper;
import cn.fxbin.original.model.SysMenu;
import cn.fxbin.original.service.SysMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SysMenuServiceImpl
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:05
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {
    /**
     * save
     *
     * @param createDTO cn.fxbin.original.controller.menu.dto.MenuCreateDTO
     * @return java.lang.Integer
     * @since 2020/9/22 18:50
     */
    @Override
    public Integer save(MenuCreateDTO createDTO) {
        SysMenu sysMenu = MenuConvert.INSTANCE.convert(createDTO);
        return this.baseMapper.insert(sysMenu);
    }

    /**
     * findMenuTree
     *
     * @return java.util.List<cn.fxbin.original.controller.menu.vo.MenuVO>
     * @since 2020/9/22 18:51
     */
    @Override
    public List<MenuVO> findMenuTree() {
        List<MenuVO> allMenu = MenuConvert.INSTANCE.convert(this.baseMapper.findAllMenu());

        List<MenuVO> list = allMenu.stream()
                .filter(menu -> SysConstants.DEFAULT_MENU_PARENT_ID.equals(menu.getParentId()))
                .collect(Collectors.toList());
        findChildren(allMenu, list);
        return list;
    }

    private void findChildren(List<MenuVO> allMenu, List<MenuVO> list) {
        list.forEach(menu -> {
            List<MenuVO> children = new ArrayList<>();
            allMenu.forEach(dbMenu -> {
                if (menu.getId().equals(dbMenu.getParentId())) {
                    children.add(dbMenu);
                }
            });
            menu.setChildren(children);
            findChildren(allMenu, children);
        });
    }
}
