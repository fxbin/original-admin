package cn.fxbin.original.mapper;

import cn.fxbin.original.model.SysUser;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * SysUserMapper
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 18:45
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    default SysUser findByUsername(String username) {
        return selectOne(new QueryWrapper<SysUser>().lambda().eq(SysUser::getUsername, username));
    }
}
