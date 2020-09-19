package cn.fxbin.original.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author fxbin
 * @version 1.0v
 * @since 2020/09/18 18:23 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysDept implements Serializable {

	private static final long serialVersionUID =  4541557954998852901L;

	/**
	 * 编号
	 */
	@TableId
	private Integer id;

	/**
	 * 机构名称
	 */
	private String name;

	/**
	 * 上级机构ID，一级机构为0
	 */
	private Integer parentId;

	/**
	 * 排序
	 */
	private Integer orderNum;

	/**
	 * 是否删除  -1：已删除  0：正常
	 */
	private Integer delFlag;

	/**
	 * 创建人
	 */
	private String createBy;

	/**
	 * 创建时间
	 */
	private LocalDateTime createTime;

	/**
	 * 更新人
	 */
	private String updateBy;

	/**
	 * 更新时间
	 */
	private LocalDateTime updateTime;

}
