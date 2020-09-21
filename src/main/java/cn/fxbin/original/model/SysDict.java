package cn.fxbin.original.model;

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
 * @since 2020/09/21 11:31 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysDict implements Serializable {

	private static final long serialVersionUID =  6294795901794517439L;

	/**
	 * 编号
	 */
	@TableId
	private Integer id;

	/**
	 * 数据值
	 */
	private String value;

	/**
	 * 标签名
	 */
	private String label;

	/**
	 * 类型
	 */
	private String type;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 排序（升序）
	 */
	private Integer sort;

	/**
	 * 备注信息
	 */
	private String remarks;

	/**
	 * 是否删除  -1：已删除  0：正常
	 */
	private Integer delFlag;

	/**
	 * 创建人
	 */
	private Integer createBy;

	/**
	 * 创建时间
	 */
	private LocalDateTime createTime;

	/**
	 * 更新人
	 */
	private Integer updateBy;

	/**
	 * 更新时间
	 */
	private LocalDateTime updateTime;

}
