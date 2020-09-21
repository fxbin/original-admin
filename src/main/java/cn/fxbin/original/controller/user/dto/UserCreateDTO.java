package cn.fxbin.original.controller.user.dto;

import cn.fxbin.original.common.dto.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * UserCreateRequest
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/21 11:35
 */
@ApiModel(value = "用户创建 DTO")
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class UserCreateDTO extends BaseDTO {


    @ApiModelProperty(value = "真实名字", required = true, example = "小王")
    @NotEmpty(message = "真实名字不能为空")
    @Length(max = 10, message = "真实名字长度最大为 10 位")
    private String name;

    @ApiModelProperty(value = "部门编号", required = true, example = "1")
    @NotNull(message = "部门不能为空")
    private Integer deptId;

    @ApiModelProperty(value = "角色编号", required = true, example = "1")
    @NotNull(message = "角色不能为空")
    private Integer roleId;


    @ApiModelProperty(value = "登陆账号", required = true, example = "15601691300")
    @NotEmpty(message = "登陆账号不能为空")
    @Length(min = 5, max = 16, message = "账号长度为 5-16 位")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "账号格式为数字以及字母")
    private String username;

    @ApiModelProperty(value = "密码", required = true, example = "buzhidao")
    @NotEmpty(message = "密码不能为空")
    @Length(min = 4, max = 16, message = "密码长度为 4-16 位")
    private String password;



}
