package cn.fxbin.original.convert;

import cn.fxbin.original.controller.dict.dto.DictCreateDTO;
import cn.fxbin.original.controller.dict.vo.DictVO;
import cn.fxbin.original.model.SysDict;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * DictConvert
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/23 11:12
 */
@Mapper
public interface DictConvert {

    DictConvert INSTANCE = Mappers.getMapper(DictConvert.class);

    DictVO convert(SysDict bean);

    List<DictVO> convert(List<SysDict> list);

    SysDict convert(DictCreateDTO bean);
}
