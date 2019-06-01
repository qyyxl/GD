package com.gd.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.gd.core.BaseModel;
import lombok.Data;

/**
 * <p>
 * 推荐表
 * </p>
 *
 * @author system
 * @since 2019-04-30
 */
@Data
public class Recommend extends BaseModel {

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
     * 商品ID
     */
    @TableField("item_id")
    private Integer itemId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;

    @Override
    public String toString() {
        return "Recommend{" +
        ", id=" + id +
        ", userId=" + userId +
        ", itemId=" + itemId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
