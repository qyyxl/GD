package com.gd.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.gd.core.BaseModel;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class UserFavoritesVo extends BaseModel {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Integer id;
    /**
     * 商品ID
     */
    private Integer itemId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 图片最大尺寸
     */
    private String mainimg1;
    /**
     * 销售价格
     */
    private Double originalPrice;
    /**
     * 用户ID
     */
    private Integer userId;
}
