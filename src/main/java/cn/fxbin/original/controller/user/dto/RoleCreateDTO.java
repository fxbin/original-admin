package cn.fxbin.original.controller.user.dto;

import cn.fxbin.original.common.dto.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * RoleCreateDTO
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/22 18:00
 */
@ApiModel(value = "角色创建 DTO")
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class RoleCreateDTO extends BaseDTO {

    @ApiModelProperty(value = "角色名字", required = true, example = "ADMIN")
    @NotEmpty(message = "角色名字不能为空")
    @Length(max = 20, message = "角色名字长度最大为 20 位")
    private String role;

}
