package cn.fxbin.original.mapper;

import cn.fxbin.original.model.SysDict;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * SysDictMapper
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 18:42
 */
@Mapper
public interface SysDictMapper extends BaseMapper<SysDict> {

    /**
     * findByLabel
     *
     * @since 2020/9/23 11:11
     * @param label label
     * @return java.util.List<cn.fxbin.original.model.SysDict>
     */
    default List<SysDict> findByLabel(String label) {
        return selectList(new QueryWrapper<SysDict>()
                .lambda()
                .likeIfPresent(SysDict::getLabel, label)
        );
    }
}
