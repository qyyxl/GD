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
     * 图片最大尺寸
     */
    private String mainimg1;
    /**
     * 图片330*330
     */
    private String mainimg2;
    /**
     * 图片120*120
     */
    private String mainimg3;
    /**
     * 图片170*170
     */
    private String mainimg4;
    /**
     *  图片100*100
     */
    private String mainimg5;
    /**
     *  图片50*50
     */
    private String mainimg6;
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
