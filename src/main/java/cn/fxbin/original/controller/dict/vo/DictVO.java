package cn.fxbin.original.controller.dict.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * DictVO
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/23 10:51
 */
@ApiModel(value = "字典 VO")
@Data
public class DictVO implements Serializable {

    private Integer id;
}
