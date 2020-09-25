package cn.fxbin.original.controller.dept.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * DeptVO
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/21 18:44
 */
@ApiModel(value = "机构 VO")
@Data
@Accessors(chain = true)
public class DeptVO implements Serializable {

    @ApiModelProperty(value = "机构编号", required = true)
    private Integer id;

    @ApiModelProperty(value = "机构名称", required = true)
    private String name;

    @ApiModelProperty(value = "父级机构编号", required = true)
    private Integer parentId;

    @ApiModelProperty(value = "父级机构名称", required = true)
    private String parentName;

    @ApiModelProperty(value = "机构等级", required = true)
    private Integer level;

    @ApiModelProperty(value = "下级机构集")
    private List<DeptVO> children;

}
