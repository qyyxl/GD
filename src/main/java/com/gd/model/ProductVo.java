package com.gd.model;

import com.gd.core.BaseModel;
import lombok.Data;

@Data
public class ProductVo extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    private Integer itemId;
    /**
     * 商品编码
     */
    private String productNo;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 销售价格
     */
    private Double originalPrice;
    /**
     * 商品Id
     */
    private Integer skuId;
    /**
     * 规格
     */
    private String norms;

}
