package cn.fxbin.original.controller.menu.dto;

import cn.fxbin.original.common.dto.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * MenuCreateDTO
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/22 18:44
 */
@ApiModel(value = "菜单创建 DTO")
@Data
@EqualsAndHashCode(callSuper = true)
public class MenuCreateDTO extends BaseDTO {

    @ApiModelProperty(value = "菜单名称", required = true)
    private String name;

    @ApiModelProperty(value = "父菜单编号", required = true)
    private Integer parentId;

    @ApiModelProperty(value = "菜单URL,类型：1.普通页面（如用户管理， /sys/user） " +
            "2.嵌套完整外部页面，以http(s)开头的链接 " +
            "3.嵌套服务器页面，使用iframe:前缀+目标URL(如SQL监控， iframe:/druid/login.html, iframe:前缀会替换成服务器地址)")
    private String url;

    @ApiModelProperty(value = "菜单图标")
    private String icon;


    @ApiModelProperty(value = "类型   0：目录   1：菜单   2：按钮", required = true)
    @NotNull(message = "类型不能为空")
    private Integer type;

}
