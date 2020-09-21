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
public class SysLoginLog implements Serializable {

	private static final long serialVersionUID =  220661609431185102L;

	/**
	 * 编号
	 */
	@TableId
	private Integer id;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 登录状态（online:在线，登录初始状态，方便统计在线人数；login:退出登录后将online置为login；logout:退出登录）
	 */
	private String status;

	/**
	 * IP地址
	 */
	private String ip;

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
