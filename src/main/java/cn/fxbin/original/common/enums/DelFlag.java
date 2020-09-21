package cn.fxbin.original.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * DelFlag
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/21 14:36
 */
@AllArgsConstructor
public enum DelFlag {

    /**
     * 已删除
     */
    Y(-1),

    /**
     * 未删除
     */
    N(0);

    @Getter
    final int value;

}
