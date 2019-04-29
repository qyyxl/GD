package com.gd.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
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
public class BtocAreaItem extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 商品ID
     */
    @TableField("itemId")
    private Integer itemId;
    /**
     * 市场价
     */
    @TableField("recommendPrice")
    private Double recommendPrice;
    /**
     * 销售价格
     */
    @TableField("originalPrice")
    private Double originalPrice;
    /**
     * 进价
     */
    @TableField("bid")
    private BigDecimal bid;
    /**
     * 移动平均价
     */
    @TableField("avgPrice")
    private BigDecimal avgPrice;
    /**
     * 不含税平均价
     */
    @TableField("avgPriceWithoutTax")
    private BigDecimal avgPriceWithoutTax;
    /**
     * 状态 0禁用 4下架 8上架
     */
    @TableField("status")
    private Integer status;
    /**
     * 销售区域，每个商家有自己的销售区域 1.北京 2.上海 3.广州
     */
    @TableField("saleArea")
    private Integer saleArea;
    /**
     * 销售类型 1.团购 2.抢购
     */
    @TableField("saleType")
    private Integer saleType;
    /**
     * 促销时的原价
     */
    @TableField("price")
    private Double price;
    /**
     * 促销语
     */
    @TableField("gift")
    private String gift;
    /**
     * 拦截数量
     */
    @TableField("interceptCount")
    private Integer interceptCount;
    /**
     * 限购数量(0代表不限制购买数量，1代表同一个id、手机、电话只能购买一件，以此类推)
     */
    @TableField("limitCount")
    private Integer limitCount;
    /**
     * 角标：'促销':1, '独家':2,'惊爆价':3, '进口':4,'预售':5,'抢购':6,'热卖':7,'清仓':8,'人气':9,'有赠品':10,'新品':11,'特价':12,'首发':13,'团购':14,'超值':15
     */
    @TableField("showPic")
    private Integer showPic;
    /**
     * 小图标（直降：4，赠品：2，积分：1）
     */
    @TableField("littlePic")
    private Integer littlePic;
    /**
     * 录入人
     */
    @TableField("inputer")
    private String inputer;
    /**
     * 录入时间
     */
    @TableField("inputDate")
    private Date inputDate;
    /**
     * 更新人
     */
    @TableField("updater")
    private String updater;
    @TableField("updateTime")
    private Date updateTime;
    @TableField("mobilePrice")
    private Double mobilePrice;
    /**
     * 手机专享价状态:0禁用，1启用
     */
    @TableField("mobilePriceStatus")
    private String mobilePriceStatus;
    /**
     * 一起健康价格
     */
    @TableField("xPrice")
    private Double xPrice;
    /**
     * 跳转文案
     */
    @TableField("giftLinkTxt")
    private String giftLinkTxt;
    /**
     * pc跳转链接
     */
    @TableField("pcGitLink")
    private String pcGitLink;
    /**
     * 无线跳转链接
     */
    @TableField("h5GitLink")
    private String h5GitLink;
    /**
     * 同步状态
     */
    @TableField("syncItemStatus")
    private Integer syncItemStatus;
    /**
     * 同步时间
     */
    @TableField("syncTime")
    private Date syncTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Double getRecommendPrice() {
        return recommendPrice;
    }

    public void setRecommendPrice(Double recommendPrice) {
        this.recommendPrice = recommendPrice;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public BigDecimal getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(BigDecimal avgPrice) {
        this.avgPrice = avgPrice;
    }

    public BigDecimal getAvgPriceWithoutTax() {
        return avgPriceWithoutTax;
    }

    public void setAvgPriceWithoutTax(BigDecimal avgPriceWithoutTax) {
        this.avgPriceWithoutTax = avgPriceWithoutTax;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSaleArea() {
        return saleArea;
    }

    public void setSaleArea(Integer saleArea) {
        this.saleArea = saleArea;
    }

    public Integer getSaleType() {
        return saleType;
    }

    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public Integer getInterceptCount() {
        return interceptCount;
    }

    public void setInterceptCount(Integer interceptCount) {
        this.interceptCount = interceptCount;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public Integer getShowPic() {
        return showPic;
    }

    public void setShowPic(Integer showPic) {
        this.showPic = showPic;
    }

    public Integer getLittlePic() {
        return littlePic;
    }

    public void setLittlePic(Integer littlePic) {
        this.littlePic = littlePic;
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

    public Double getMobilePrice() {
        return mobilePrice;
    }

    public void setMobilePrice(Double mobilePrice) {
        this.mobilePrice = mobilePrice;
    }

    public String getMobilePriceStatus() {
        return mobilePriceStatus;
    }

    public void setMobilePriceStatus(String mobilePriceStatus) {
        this.mobilePriceStatus = mobilePriceStatus;
    }

    public Double getxPrice() {
        return xPrice;
    }

    public void setxPrice(Double xPrice) {
        this.xPrice = xPrice;
    }

    public String getGiftLinkTxt() {
        return giftLinkTxt;
    }

    public void setGiftLinkTxt(String giftLinkTxt) {
        this.giftLinkTxt = giftLinkTxt;
    }

    public String getPcGitLink() {
        return pcGitLink;
    }

    public void setPcGitLink(String pcGitLink) {
        this.pcGitLink = pcGitLink;
    }

    public String getH5GitLink() {
        return h5GitLink;
    }

    public void setH5GitLink(String h5GitLink) {
        this.h5GitLink = h5GitLink;
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

    @Override
    public String toString() {
        return "BtocAreaItem{" +
        ", id=" + id +
        ", itemId=" + itemId +
        ", recommendPrice=" + recommendPrice +
        ", originalPrice=" + originalPrice +
        ", bid=" + bid +
        ", avgPrice=" + avgPrice +
        ", avgPriceWithoutTax=" + avgPriceWithoutTax +
        ", status=" + status +
        ", saleArea=" + saleArea +
        ", saleType=" + saleType +
        ", price=" + price +
        ", gift=" + gift +
        ", interceptCount=" + interceptCount +
        ", limitCount=" + limitCount +
        ", showPic=" + showPic +
        ", littlePic=" + littlePic +
        ", inputer=" + inputer +
        ", inputDate=" + inputDate +
        ", updater=" + updater +
        ", updateTime=" + updateTime +
        ", mobilePrice=" + mobilePrice +
        ", mobilePriceStatus=" + mobilePriceStatus +
        ", xPrice=" + xPrice +
        ", giftLinkTxt=" + giftLinkTxt +
        ", pcGitLink=" + pcGitLink +
        ", h5GitLink=" + h5GitLink +
        ", syncItemStatus=" + syncItemStatus +
        ", syncTime=" + syncTime +
        "}";
    }
}
