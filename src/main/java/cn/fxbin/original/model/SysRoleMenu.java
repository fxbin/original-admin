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
public class SysRoleMenu implements Serializable {

	private static final long serialVersionUID =  41798395540605054L;

	/**
	 * 编号
	 */
	@TableId
	private Integer id;

	/**
	 * 角色ID
	 */
	private Integer roleId;

	/**
	 * 菜单ID
	 */
	private Integer menuId;

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
