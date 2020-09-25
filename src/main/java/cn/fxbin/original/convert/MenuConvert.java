package cn.fxbin.original.convert;

import cn.fxbin.original.controller.menu.dto.MenuCreateDTO;
import cn.fxbin.original.controller.menu.vo.MenuVO;
import cn.fxbin.original.model.SysMenu;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.awt.*;
import java.util.List;

/**
 * MenuConvert
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/22 19:37
 */
@Mapper
public interface MenuConvert {

    MenuConvert INSTANCE = Mappers.getMapper(MenuConvert.class);

    SysMenu convert(MenuCreateDTO bean);

    MenuVO convert(SysMenu bean);

    List<MenuVO> convert(List<SysMenu> list);

}
