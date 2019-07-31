package com.gd.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.gd.core.BaseModel;

/**
 * <p>
 * 
 * </p>
 *
 * @author system
 * @since 2019-04-29
 */
public class BtocItem extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 商品编码
     */
    @TableField("productNo")
    private String productNo;
    /**
     * 商品名称
     */
    @TableField("productName")
    private String productName;
    /**
     * 其他名称
     */
    @TableField("otherName")
    private String otherName;
    /**
     * 商品别名
     */
    @TableField("byName")
    private String byName;
    /**
     * 分类ID
     */
    @TableField("catalogId")
    private Integer catalogId;
    @TableField("catalogName")
    private String catalogName;
    /**
     * 品牌ID
     */
    @TableField("brandId")
    private Integer brandId;
    @TableField("brandName")
    private String brandName;
    @TableField("definitionId")
    private Integer definitionId;
    @TableField("definitionName")
    private String definitionName;
    /**
     * 图片最大尺寸
     */
    @TableField("mainimg1")
    private String mainimg1;
    /**
     * 图片380*380
     */
    @TableField("mainimg2")
    private String mainimg2;
    /**
     * 图片200*200
     */
    @TableField("mainimg3")
    private String mainimg3;
    /**
     * 图片160*160
     */
    @TableField("mainimg4")
    private String mainimg4;
    /**
     * 图片100*100
     */
    @TableField("mainimg5")
    private String mainimg5;
    /**
     * 图片65*65
     */
    @TableField("mainimg6")
    private String mainimg6;
    /**
     * 产品状态(0:停用, 1:启用)
     */
    @TableField("status")
    private Integer status;
    /**
     * 特殊属性 0:普通品,2系列品从品，3系列品主品
     */
    @TableField("specialStatus")
    private Integer specialStatus;
    /**
     * 属性字符串 attr_name1: XXX, value: value1; attr_name2: XXX, value: value2
     */
    @TableField("attributes")
    private String attributes;
    /**
     * 产品类型 产品ZSP 赠品ZZP 套餐TCP
     */
    @TableField("materialtype")
    private String materialtype;
    /**
     * 商家编码
     */
    @TableField("venderId")
    private String venderId;
    /**
     * 销售类型 1.备货 2. 寄售 3.预定 4.代售 5.聚单
     */
    @TableField("sellType")
    private Integer sellType;
    /**
     * 代售佣金
     */
    @TableField("commission")
    private Double commission;
    /**
     * 销售量
     */
    @TableField("salesCount")
    private Integer salesCount;
    /**
     * 用户评价量
     */
    @TableField("userGradecount")
    private Integer userGradecount;
    /**
     * 用户评分
     */
    @TableField("userGrade")
    private Double userGrade;
    /**
     * 综合评分
     */
    @TableField("subtotalScore")
    private Double subtotalScore;
    /**
     * 推荐排序字段
     */
    @TableField("priority")
    private Integer priority;
    /**
     * 销售税率
     */
    @TableField("taxrate")
    private Double taxrate;
    /**
     * 是否强制开发票 0:强制开 1:可不开
     */
    @TableField("invoice")
    private Integer invoice;
    @TableField("inputer")
    private String inputer;
    @TableField("inputDate")
    private Date inputDate;
    @TableField("updater")
    private String updater;
    @TableField("updateTime")
    private Date updateTime;
    /**
     * 0:不可上架;1:可以上架
     */
    @TableField("qualityStatus")
    private String qualityStatus;
    @TableField("skuId")
    private Integer skuId;
    @TableField("saleSchemeId")
    private Integer saleSchemeId;
    @TableField("tags")
    private String tags;
    @TableField("storeSchemeId")
    private Integer storeSchemeId;
    @TableField("exChangedDay")
    private Integer exChangedDay;
    /**
     * 用药提醒类型（1：慢性病药品 2：其他）
     */
    @TableField("remindType")
    private Integer remindType;
    @TableField("specialAttributes")
    private String specialAttributes;
    @TableField("drugStatus")
    private Integer drugStatus;
    @TableField("frightTemplateId")
    private Integer frightTemplateId;
    @TableField("itemGroupId")
    private Integer itemGroupId;
    /**
     * 供应商商品编码
     */
    @TableField("supplierProductCode")
    private String supplierProductCode;
    /**
     * 是否海淘商品(0:否, 1:是)
     */
    @TableField("isHaiTao")
    private Integer isHaiTao;
    /**
     * 海淘运输类型 (1:报税仓发货, 2:海外直邮发货)
     */
    @TableField("haiTaoTransport")
    private Integer haiTaoTransport;
    /**
     * 海淘品牌国
     */
    @TableField("haiTaoCountry")
    private String haiTaoCountry;
    /**
     * 是否卖家承担海淘税费 0：否,1：是
     */
    @TableField("isVenderPayTax")
    private Integer isVenderPayTax;
    /**
     * 第三方产品编号
     */
    @TableField("outerSkuId")
    private String outerSkuId;
    /**
     * 第三方商品编号
     */
    @TableField("outerItemId")
    private String outerItemId;
    /**
     * 第三方商品编码
     */
    @TableField("outerItemNo")
    private String outerItemNo;
    /**
     * 好评数(评分>=4)
     */
    @TableField("haoCommentCount")
    private Integer haoCommentCount;
    /**
     * 问答数
     */
    @TableField("questionCount")
    private Integer questionCount;
    /**
     * 卖点
     */
    @TableField("sellPoint")
    private String sellPoint;
    /**
     * 0:仅在1药网销售-----默认为0;-1:在1起健康,1药网都可销售;2:仅在1起健康销售;3:1起健康/1药网都不销售(销售状态:0可销售 3不可销售)
     */
    @TableField("isHealthy")
    private Integer isHealthy;
    /**
     * 药城是否可售(0:否, 1:是)
     */
    @TableField("isBtob")
    private Integer isBtob;
    @TableField("syncItemStatus")
    private Integer syncItemStatus;
    @TableField("syncTime")
    private Date syncTime;
    /**
     * 药品等级：1:无，2:双轨普通，3:单轨高危，4:单轨普通)
     */
    @TableField("drugLevel")
    private Integer drugLevel;
    /**
     * 备注
     */
    @TableField("remark")
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getByName() {
        return byName;
    }

    public void setByName(String byName) {
        this.byName = byName;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getDefinitionId() {
        return definitionId;
    }

    public void setDefinitionId(Integer definitionId) {
        this.definitionId = definitionId;
    }

    public String getDefinitionName() {
        return definitionName;
    }

    public void setDefinitionName(String definitionName) {
        this.definitionName = definitionName;
    }

    public String getMainimg1() {
        return mainimg1;
    }

    public void setMainimg1(String mainimg1) {
        this.mainimg1 = mainimg1;
    }

    public String getMainimg2() {
        return mainimg2;
    }

    public void setMainimg2(String mainimg2) {
        this.mainimg2 = mainimg2;
    }

    public String getMainimg3() {
        return mainimg3;
    }

    public void setMainimg3(String mainimg3) {
        this.mainimg3 = mainimg3;
    }

    public String getMainimg4() {
        return mainimg4;
    }

    public void setMainimg4(String mainimg4) {
        this.mainimg4 = mainimg4;
    }

    public String getMainimg5() {
        return mainimg5;
    }

    public void setMainimg5(String mainimg5) {
        this.mainimg5 = mainimg5;
    }

    public String getMainimg6() {
        return mainimg6;
    }

    public void setMainimg6(String mainimg6) {
        this.mainimg6 = mainimg6;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSpecialStatus() {
        return specialStatus;
    }

    public void setSpecialStatus(Integer specialStatus) {
        this.specialStatus = specialStatus;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getMaterialtype() {
        return materialtype;
    }

    public void setMaterialtype(String materialtype) {
        this.materialtype = materialtype;
    }

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public Integer getSellType() {
        return sellType;
    }

    public void setSellType(Integer sellType) {
        this.sellType = sellType;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Integer getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(Integer salesCount) {
        this.salesCount = salesCount;
    }

    public Integer getUserGradecount() {
        return userGradecount;
    }

    public void setUserGradecount(Integer userGradecount) {
        this.userGradecount = userGradecount;
    }

    public Double getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(Double userGrade) {
        this.userGrade = userGrade;
    }

    public Double getSubtotalScore() {
        return subtotalScore;
    }

    public void setSubtotalScore(Double subtotalScore) {
        this.subtotalScore = subtotalScore;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Double getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Double taxrate) {
        this.taxrate = taxrate;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public String getInputer() {
        return inputer;
    }

    public void setInputer(String inputer) {
        this.inputer = inputer;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getQualityStatus() {
        return qualityStatus;
    }

    public void setQualityStatus(String qualityStatus) {
        this.qualityStatus = qualityStatus;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSaleSchemeId() {
        return saleSchemeId;
    }

    public void setSaleSchemeId(Integer saleSchemeId) {
        this.saleSchemeId = saleSchemeId;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getStoreSchemeId() {
        return storeSchemeId;
    }

    public void setStoreSchemeId(Integer storeSchemeId) {
        this.storeSchemeId = storeSchemeId;
    }

    public Integer getExChangedDay() {
        return exChangedDay;
    }

    public void setExChangedDay(Integer exChangedDay) {
        this.exChangedDay = exChangedDay;
    }

    public Integer getRemindType() {
        return remindType;
    }

    public void setRemindType(Integer remindType) {
        this.remindType = remindType;
    }

    public String getSpecialAttributes() {
        return specialAttributes;
    }

    public void setSpecialAttributes(String specialAttributes) {
        this.specialAttributes = specialAttributes;
    }

    public Integer getDrugStatus() {
        return drugStatus;
    }

    public void setDrugStatus(Integer drugStatus) {
        this.drugStatus = drugStatus;
    }

    public Integer getFrightTemplateId() {
        return frightTemplateId;
    }

    public void setFrightTemplateId(Integer frightTemplateId) {
        this.frightTemplateId = frightTemplateId;
    }

    public Integer getItemGroupId() {
        return itemGroupId;
    }

    public void setItemGroupId(Integer itemGroupId) {
        this.itemGroupId = itemGroupId;
    }

    public String getSupplierProductCode() {
        return supplierProductCode;
    }

    public void setSupplierProductCode(String supplierProductCode) {
        this.supplierProductCode = supplierProductCode;
    }

    public Integer getIsHaiTao() {
        return isHaiTao;
    }

    public void setIsHaiTao(Integer isHaiTao) {
        this.isHaiTao = isHaiTao;
    }

    public Integer getHaiTaoTransport() {
        return haiTaoTransport;
    }

    public void setHaiTaoTransport(Integer haiTaoTransport) {
        this.haiTaoTransport = haiTaoTransport;
    }

    public String getHaiTaoCountry() {
        return haiTaoCountry;
    }

    public void setHaiTaoCountry(String haiTaoCountry) {
        this.haiTaoCountry = haiTaoCountry;
    }

    public Integer getIsVenderPayTax() {
        return isVenderPayTax;
    }

    public void setIsVenderPayTax(Integer isVenderPayTax) {
        this.isVenderPayTax = isVenderPayTax;
    }

    public String getOuterSkuId() {
        return outerSkuId;
    }

    public void setOuterSkuId(String outerSkuId) {
        this.outerSkuId = outerSkuId;
    }

    public String getOuterItemId() {
        return outerItemId;
    }

    public void setOuterItemId(String outerItemId) {
        this.outerItemId = outerItemId;
    }

    public String getOuterItemNo() {
        return outerItemNo;
    }

    public void setOuterItemNo(String outerItemNo) {
        this.outerItemNo = outerItemNo;
    }

    public Integer getHaoCommentCount() {
        return haoCommentCount;
    }

    public void setHaoCommentCount(Integer haoCommentCount) {
        this.haoCommentCount = haoCommentCount;
    }

    public Integer getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public Integer getIsHealthy() {
        return isHealthy;
    }

    public void setIsHealthy(Integer isHealthy) {
        this.isHealthy = isHealthy;
    }

    public Integer getIsBtob() {
        return isBtob;
    }

    public void setIsBtob(Integer isBtob) {
        this.isBtob = isBtob;
    }

    public Integer getSyncItemStatus() {
        return syncItemStatus;
    }

    public void setSyncItemStatus(Integer syncItemStatus) {
        this.syncItemStatus = syncItemStatus;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    public Integer getDrugLevel() {
        return drugLevel;
    }

    public void setDrugLevel(Integer drugLevel) {
        this.drugLevel = drugLevel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "BtocItem{" +
        ", id=" + id +
        ", productNo=" + productNo +
        ", productName=" + productName +
        ", otherName=" + otherName +
        ", byName=" + byName +
        ", catalogId=" + catalogId +
        ", catalogName=" + catalogName +
        ", brandId=" + brandId +
        ", brandName=" + brandName +
        ", definitionId=" + definitionId +
        ", definitionName=" + definitionName +
        ", mainimg1=" + mainimg1 +
        ", mainimg2=" + mainimg2 +
        ", mainimg3=" + mainimg3 +
        ", mainimg4=" + mainimg4 +
        ", mainimg5=" + mainimg5 +
        ", mainimg6=" + mainimg6 +
        ", status=" + status +
        ", specialStatus=" + specialStatus +
        ", attributes=" + attributes +
        ", materialtype=" + materialtype +
        ", venderId=" + venderId +
        ", sellType=" + sellType +
        ", commission=" + commission +
        ", salesCount=" + salesCount +
        ", userGradecount=" + userGradecount +
        ", userGrade=" + userGrade +
        ", subtotalScore=" + subtotalScore +
        ", priority=" + priority +
        ", taxrate=" + taxrate +
        ", invoice=" + invoice +
        ", inputer=" + inputer +
        ", inputDate=" + inputDate +
        ", updater=" + updater +
        ", updateTime=" + updateTime +
        ", qualityStatus=" + qualityStatus +
        ", skuId=" + skuId +
        ", saleSchemeId=" + saleSchemeId +
        ", tags=" + tags +
        ", storeSchemeId=" + storeSchemeId +
        ", exChangedDay=" + exChangedDay +
        ", remindType=" + remindType +
        ", specialAttributes=" + specialAttributes +
        ", drugStatus=" + drugStatus +
        ", frightTemplateId=" + frightTemplateId +
        ", itemGroupId=" + itemGroupId +
        ", supplierProductCode=" + supplierProductCode +
        ", isHaiTao=" + isHaiTao +
        ", haiTaoTransport=" + haiTaoTransport +
        ", haiTaoCountry=" + haiTaoCountry +
        ", isVenderPayTax=" + isVenderPayTax +
        ", outerSkuId=" + outerSkuId +
        ", outerItemId=" + outerItemId +
        ", outerItemNo=" + outerItemNo +
        ", haoCommentCount=" + haoCommentCount +
        ", questionCount=" + questionCount +
        ", sellPoint=" + sellPoint +
        ", isHealthy=" + isHealthy +
        ", isBtob=" + isBtob +
        ", syncItemStatus=" + syncItemStatus +
        ", syncTime=" + syncTime +
        ", drugLevel=" + drugLevel +
        ", remark=" + remark +
        "}";
    }
}
