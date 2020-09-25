package cn.fxbin.original.controller.user.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * UserVO
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/19 15:16
 */
@ApiModel(value = "用户 VO")
@Data
public class UserVO implements Serializable {

    /**
     * 编号
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态  0：禁用   1：正常
     */
    private Integer status;

}
