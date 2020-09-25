package cn.fxbin.original.mapper;

import cn.fxbin.original.common.enums.DelFlag;
import cn.fxbin.original.model.SysDept;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * SysDeptMapper
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 18:42
 */
@Mapper
public interface SysDeptMapper extends BaseMapper<SysDept> {

    default List<SysDept> findAll() {
        return selectList(new QueryWrapper<SysDept>()
                .lambda()
                .eq(SysDept::getDelFlag, DelFlag.N.getValue())
                .orderByAsc(SysDept::getOrderNum)
        );
    }

}
