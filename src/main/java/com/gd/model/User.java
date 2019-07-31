package com.gd.model;

import com.baomidou.mybatisplus.enums.IdType;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.gd.core.BaseModel;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author system
 * @since 2019-05-08
 */

@Data
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    @TableField("username")
    private String username;
    /**
     * 密码
     */
    @TableField("password")
    private String password;
    /**
     * 性别
     */
    @TableField("gender")
    private Integer gender;
    /**
     * 邮箱
     */
    @TableField("email")
    private String email;
    /**
     * 手机号
     */
    @TableField("tell")
    private String tell;
    /**
     * 创建时间
     */
    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", gender=" + gender +
        ", email=" + email +
        ", tell=" + tell +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
