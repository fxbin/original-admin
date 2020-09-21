package cn.fxbin.original.controller.user.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * RoleVO
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/21 14:07
 */
@ApiModel(value = "角色 VO")
@Data
@Accessors(chain = true)
public class RoleVO implements Serializable {

    @ApiModelProperty(value = "角色编号", required = true, example = "1")
    private Integer roleId;

    @ApiModelProperty(value = "角色名称", required = true, example = "管理员")
    private String roleName;

}
