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
 * 推荐关系表
 * </p>
 *
 * @author system
 * @since 2019-04-29
 */

@Data
public class UserLove extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户ID
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 商品编码
     */
    @TableField("sku_no")
    private String skuNo;
    /**
     * 用户动作
     */
    @TableField("source")
    private String source;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("create_time")
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @Override
    public String toString() {
        return "UserLove{" +
        ", id=" + id +
        ", userId=" + userId +
        ", skuNo=" + skuNo +
        ", source=" + source +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
