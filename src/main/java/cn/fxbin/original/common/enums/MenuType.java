package cn.fxbin.original.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * MenuType
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/22 19:43
 */
@Getter
@AllArgsConstructor
public enum MenuType {

    /**
     * 目录
     */
    DIRECTORY(0),

    /**
     * 菜单
     */
    MENU(1),

    /**
     * 按钮
     */
    BUTTON(2);

    @Getter
    final int value;
}
