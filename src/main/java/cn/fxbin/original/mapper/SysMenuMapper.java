package cn.fxbin.original.mapper;

import cn.fxbin.original.common.enums.MenuType;
import cn.fxbin.original.model.SysMenu;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * SysMenuMapper
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 18:43
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    /**
     * findAllMenu
     *
     * @since 2020/9/22 19:54
     * @return java.util.List<cn.fxbin.original.model.SysMenu>
     */
    default List<SysMenu>  findAllMenu(){
        return selectList(new QueryWrapper<SysMenu>().lambda().eq(SysMenu::getType, MenuType.MENU.getValue()));
    }

}
