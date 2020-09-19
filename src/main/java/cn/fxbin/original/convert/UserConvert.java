package cn.fxbin.original.convert;

import cn.fxbin.original.controller.user.UserVO;
import cn.fxbin.original.model.SysUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * UserConvert
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/19 14:08
 */
@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserVO convert(SysUser bean);


}
