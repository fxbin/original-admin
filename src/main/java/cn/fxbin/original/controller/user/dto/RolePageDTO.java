package cn.fxbin.original.controller.user.dto;

import cn.fxbin.bubble.fireworks.core.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * RoleDTO
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/22 18:31
 */
@ApiModel(value = "角色分页查询 DTO")
@Data
@EqualsAndHashCode(callSuper = true)
public class RolePageDTO extends PageParam {

    @ApiModelProperty(value = "角色名称")
    private String roleName;

}
