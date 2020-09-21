package cn.fxbin.original.convert;

import cn.fxbin.original.controller.user.dto.UserCreateDTO;
import cn.fxbin.original.controller.user.vo.UserVO;
import cn.fxbin.original.model.SysUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * UserConvert
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/21 14:27
 */
@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    List<UserVO> convert(List<SysUser> list);

    UserVO convert(SysUser bean);

    SysUser convert(UserCreateDTO bean);

}
