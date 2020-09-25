package cn.fxbin.original.convert;

import cn.fxbin.original.controller.dept.dto.DeptCreateDTO;
import cn.fxbin.original.controller.dept.vo.DeptVO;
import cn.fxbin.original.model.SysDept;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * DeptConvert
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/21 18:48
 */
@Mapper
public interface DeptConvert {

    DeptConvert INSTANCE = Mappers.getMapper(DeptConvert.class);

    SysDept convert(DeptCreateDTO bean);

    DeptVO convert(SysDept bean);

    List<DeptVO> convert(List<SysDept> list);

}
