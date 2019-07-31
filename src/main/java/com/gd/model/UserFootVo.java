package com.gd.model;

import com.gd.core.BaseModel;
import lombok.Data;

@Data
public class UserFootVo extends BaseModel {
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
