package cn.fxbin.original.controller.dept.dto;

import cn.fxbin.original.common.dto.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * DeptCreateDTO
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/21 18:11
 */
@ApiModel(value = "机构创建 DTO")
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class DeptCreateDTO extends BaseDTO {

    @ApiModelProperty(value = "机构编号", required = true)
    private Integer id;

    @ApiModelProperty(value = "机构名称", required = true)
    @NotEmpty(message = "机构名字不能为空")
    @Length(max = 30, message = "机构名字长度最大为 30 位")
    private String name;

    @ApiModelProperty(value = "父级部门编号", required = true)
    @NotNull(message = "父部门不能为空")
    private Integer parentId;

    @ApiModelProperty(value = "排序编号")
    private Integer orderNum;


}
