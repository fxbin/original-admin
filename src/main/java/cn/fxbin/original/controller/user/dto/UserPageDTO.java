package cn.fxbin.original.controller.user.dto;

import cn.fxbin.bubble.fireworks.core.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * UserPageDTO
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/21 14:50
 */
@ApiModel("用户分页查询 DTO")
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class UserPageDTO extends PageParam {

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "真实名字，模糊匹配", example = "小王")
    private String name;

    @ApiModelProperty(value = "部门编号")
    private Integer deptId;


}
