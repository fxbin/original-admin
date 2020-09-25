package cn.fxbin.original.controller.menu.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * MenuVO
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/22 18:49
 */
@ApiModel(value = "菜单 VO")
@Data
public class MenuVO implements Serializable {

    @ApiModelProperty(value = "菜单编号")
    private Integer id;

    @ApiModelProperty(value = "菜单名称")
    private String name;

    @ApiModelProperty(value = "父菜单编号")
    private Integer parentId;

    @ApiModelProperty(value = "菜单URL,类型：1.普通页面（如用户管理， /sys/user） " +
            "2.嵌套完整外部页面，以http(s)开头的链接 " +
            "3.嵌套服务器页面，使用iframe:前缀+目标URL(如SQL监控， iframe:/druid/login.html, iframe:前缀会替换成服务器地址)")
    private String url;

    @ApiModelProperty(value = "菜单图标")
    private String icon;

    @ApiModelProperty(value = "子菜单列表")
    private List<MenuVO> children;

}
