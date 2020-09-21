package cn.fxbin.original.controller.dept.dto;

import cn.fxbin.original.common.dto.BaseDTO;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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

    private Integer id;

    private String name;

    private Integer parentId;

    private Integer orderNum;

}
