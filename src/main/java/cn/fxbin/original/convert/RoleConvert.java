package cn.fxbin.original.convert;

import cn.fxbin.original.controller.user.dto.RoleCreateDTO;
import cn.fxbin.original.controller.user.vo.RoleVO;
import cn.fxbin.original.model.SysRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * UserRoleConvert
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/21 14:15
 */
@Mapper
public interface RoleConvert {

    RoleConvert INSTANCE = Mappers.getMapper(RoleConvert.class);

    @Mappings({
            @Mapping(source = "id", target = "roleId"),
            @Mapping(source = "name", target = "roleName")
    })
    RoleVO convert(SysRole bean);

    SysRole convert(RoleCreateDTO bean);

    List<RoleVO> convert(List<SysRole> list);

}
