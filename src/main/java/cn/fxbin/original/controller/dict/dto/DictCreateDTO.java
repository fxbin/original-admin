package cn.fxbin.original.controller.dict.dto;

import cn.fxbin.original.common.dto.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DictDTO
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/23 11:16
 */
@ApiModel(value = "创建字典 DTO")
@Data
@EqualsAndHashCode(callSuper = true)
public class DictCreateDTO extends BaseDTO {

    @ApiModelProperty(value = "标签名", required = true)
    private String label;

    @ApiModelProperty(value = "数据值", required = true)
    private String value;

    @ApiModelProperty(value = "类型", required = true)
    private String type;

}
