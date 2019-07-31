package com.gd.model;

import com.baomidou.mybatisplus.enums.IdType;

import java.time.LocalDateTime;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.gd.core.BaseModel;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 我的收藏夹
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
@Data
public class UserFavorites extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 商品ID
     */
    @TableField("itemId")
    private Integer itemId;
    /**
     * 商品名称
     */
    @TableField("productName")
    private String productName;
    /**
     * 用户ID
     */
    @TableField("userId")
    private Integer userId;
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
        return "UserFavorites{" +
        ", id=" + id +
        ", itemId=" + itemId +
        ", productName=" + productName +
        ", userId=" + userId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
