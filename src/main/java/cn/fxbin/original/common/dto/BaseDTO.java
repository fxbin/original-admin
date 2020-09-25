package cn.fxbin.original.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * BaseDTO
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/21 18:40
 */
@ApiModel("Base DTO")
public class BaseDTO implements Serializable {

    @ApiModelProperty(value = "创建人", required = true)
    private Integer createBy;

    @ApiModelProperty(value = "修改人", required = true)
    private Integer updateBy;

}
