package com.gd.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author system
 * @since 2019-04-21
 */
public class BtocSku implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("skuNo")
    private String skuNo;

    private Integer definitionid;

    private String definitionname;

    private Integer brandid;

    private String brandname;

    private Integer catalogid;

    private String catalogname;

    /**
     * 重量
     */
    private Double weight;

    /**
     * 净重 由WMS维护
     */
    @TableField("neightWeight")
    private BigDecimal neightWeight;

    /**
     * 长度
     */
    private Double length;

    private LocalDateTime inputdate;

    private String inputer;

    /**
     * 报表用更新时间
     */
    private LocalDateTime updatetime;

    private String updater;

    private String productarea;

    private Integer detail;

    @TableField("drugType")
    private String drugType;

    @TableField("qualityPeriod")
    private Integer qualityPeriod;

    /**
     * 生产厂商ID
     */
    private Integer manufacturerid;

    private String manufacturer;

    @TableField("boxBoard")
    private String boxBoard;

    /**
     * 产品类型(1:普通商品, 2:普通食品, 9:中药饮片, 10:保健食品, 12:医疗器械, 13:OTC, 15:宠物商品, 16:处方药，17:隐形眼镜)
     */
    private Integer prescription;

    private String barcode;

    private String approvalnum;

    @TableField("storageTemp")
    private Double storageTemp;

    @TableField("storageRequire")
    private String storageRequire;

    private String norms;

    @TableField("marketTime")
    private LocalDateTime marketTime;

    /**
     * 宽度
     */
    private Double width;

    /**
     * 高度
     */
    private Double height;

    @TableField("skuName")
    private String skuName;

    /**
     * 药房品 (0:非药房特有品, 1:药房特有品)
     */
    @TableField("isYaoFang")
    private Integer isYaoFang;

    private String size;

    private String degree;

    private String color;

    /**
     * 税收分类编码
     */
    @TableField("taxCatalogNo")
    private String taxCatalogNo;

    /**
     * 产品简称(不带品牌规格)
     */
    @TableField("shortName")
    private String shortName;

    /**
     * 体积(cm3)
     */
    private BigDecimal volume;

    /**
     * 计量单位(包, 罐)
     */
    private String unit;

    /**
     * 易碎品(0:不是, 1:是)
     */
    @TableField("isFragile")
    private Integer isFragile;

    /**
     * 向上(0:不是, 1:是)
     */
    @TableField("putOnDirection")
    private Integer putOnDirection;

    /**
     * 贵重品(0:不是, 1:是)
     */
    @TableField("isValuables")
    private Integer isValuables;

    /**
     * 液体(0:不是, 1:是)
     */
    @TableField("isLiquid")
    private Integer isLiquid;

    /**
     * 防交叉污染(0:不是, 1:是)
     */
    @TableField("isCrossContamination")
    private Integer isCrossContamination;

    /**
     * 湿度范围
     */
    @TableField("storageHumidity")
    private String storageHumidity;

    /**
     * 销售税率
     */
    @TableField("productTaxRate")
    private BigDecimal productTaxRate;

    /**
     * 是否已同步到金博系统(0:否, 1:是)
     */
    @TableField("syncKingbo")
    private Integer syncKingbo;

    /**
     * 药品类型(1:生化药品, 2:化学药制剂, 3:中药材, 4:中药饮片, 5:中成药, 6:生物制品, 7:抗生素制剂, 8:化学原料药, 9:抗生素原料药, 10:一类医疗器械, 11:二类医疗器械, 12:三类医疗器械, 13:诊断试剂, 14:药食同源中药, 15:食品, 16:保健食品, 17:乳制品(含婴幼儿配方乳粉), 18:化妆品, 19:日用消毒制品, 20:蛋白同化制剂, 21:肽类激素, 22:日常用品, 23:赠品)
     */
    @TableField("medicineType")
    private Integer medicineType;

    /**
     * 生码渠道(1:自营,2:MP新品,3:MP新品转自营)
     */
    @TableField("codeType")
    private Integer codeType;

    /**
     * 审核状态(1:待审核,2:审核通过,3:审核不通过)
     */
    @TableField("auditStatus")
    private Integer auditStatus;

    /**
     * 批文效期
     */
    @TableField("approvalExpireDate")
    private LocalDateTime approvalExpireDate;

    /**
     * 药品本位码
     */
    @TableField("medicineNo")
    private String medicineNo;

    /**
     * 序列号控制标记(0否1是)
     */
    @TableField("snCtrlInd")
    private Integer snCtrlInd;

    /**
     * 是否需要批次控制(0否1是)
     */
    @TableField("needBatchCtrl")
    private Integer needBatchCtrl;

    /**
     * 药品注册批件(0: 无 1：有)
     */
    @TableField("drugApproval")
    private Integer drugApproval;

    /**
     * 药品质量标准(0: 无 1：有)
     */
    @TableField("drugStandard")
    private Integer drugStandard;

    /**
     * 标签(0: 无 1：有)
     */
    private Integer label;

    /**
     * 说明书(0: 无 1：有)
     */
    @TableField("mainInfo")
    private Integer mainInfo;

    /**
     * 省局规格
     */
    @TableField("provinceNorms")
    private String provinceNorms;

    /**
     * 市局规格
     */
    @TableField("cityNorms")
    private String cityNorms;

    /**
     * 质管审核人
     */
    private String auditor;

    /**
     * 审核时间
     */
    @TableField("auditDate")
    private LocalDateTime auditDate;

    /**
     * 财务审核状态(1:待审核 2:审核成功 3:审核失败)
     */
    @TableField("financeAuditStatus")
    private Integer financeAuditStatus;

    /**
     * 同步状态
     */
    @TableField("syncStatus")
    private Integer syncStatus;

    /**
     * 同步时间
     */
    @TableField("syncTime")
    private LocalDateTime syncTime;

    /**
     * 内服外用(1内服、2外用、0其他，默认为其他)
     */
    @TableField("adUsIntOrAdUsExt")
    private Integer adUsIntOrAdUsExt;

    /**
     * 生产许可证号
     */
    @TableField("productionLicense")
    private String productionLicense;

    /**
     * 是否支持空运(0 否 1 是)
     */
    @TableField("isAirLift")
    private Integer isAirLift;

    /**
     * 适用症状，各症状间用英文逗号分隔
     */
    private String symptom;

    /**
     * 是否管家管控药（0:否，1:是）
     */
    @TableField("stateControlled")
    private Integer stateControlled;

    /**
     * SPU(标品)编号
     */
    @TableField("spuInfoId")
    private Long spuInfoId;

    /**
     * SPU(标品)默认(0:未知, 1:是, 2:否)
     */
    @TableField("spuInfoDefault")
    private Integer spuInfoDefault;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkuNo() {
        return skuNo;
    }

    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    public Integer getDefinitionid() {
        return definitionid;
    }

    public void setDefinitionid(Integer definitionid) {
        this.definitionid = definitionid;
    }

    public String getDefinitionname() {
        return definitionname;
    }

    public void setDefinitionname(String definitionname) {
        this.definitionname = definitionname;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public Integer getCatalogid() {
        return catalogid;
    }

    public void setCatalogid(Integer catalogid) {
        this.catalogid = catalogid;
    }

    public String getCatalogname() {
        return catalogname;
    }

    public void setCatalogname(String catalogname) {
        this.catalogname = catalogname;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public BigDecimal getNeightWeight() {
        return neightWeight;
    }

    public void setNeightWeight(BigDecimal neightWeight) {
        this.neightWeight = neightWeight;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public LocalDateTime getInputdate() {
        return inputdate;
    }

    public void setInputdate(LocalDateTime inputdate) {
        this.inputdate = inputdate;
    }

    public String getInputer() {
        return inputer;
    }

    public void setInputer(String inputer) {
        this.inputer = inputer;
    }

    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getProductarea() {
        return productarea;
    }

    public void setProductarea(String productarea) {
        this.productarea = productarea;
    }

    public Integer getDetail() {
        return detail;
    }

    public void setDetail(Integer detail) {
        this.detail = detail;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public Integer getQualityPeriod() {
        return qualityPeriod;
    }

    public void setQualityPeriod(Integer qualityPeriod) {
        this.qualityPeriod = qualityPeriod;
    }

    public Integer getManufacturerid() {
        return manufacturerid;
    }

    public void setManufacturerid(Integer manufacturerid) {
        this.manufacturerid = manufacturerid;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBoxBoard() {
        return boxBoard;
    }

    public void setBoxBoard(String boxBoard) {
        this.boxBoard = boxBoard;
    }

    public Integer getPrescription() {
        return prescription;
    }

    public void setPrescription(Integer prescription) {
        this.prescription = prescription;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getApprovalnum() {
        return approvalnum;
    }

    public void setApprovalnum(String approvalnum) {
        this.approvalnum = approvalnum;
    }

    public Double getStorageTemp() {
        return storageTemp;
    }

    public void setStorageTemp(Double storageTemp) {
        this.storageTemp = storageTemp;
    }

    public String getStorageRequire() {
        return storageRequire;
    }

    public void setStorageRequire(String storageRequire) {
        this.storageRequire = storageRequire;
    }

    public String getNorms() {
        return norms;
    }

    public void setNorms(String norms) {
        this.norms = norms;
    }

    public LocalDateTime getMarketTime() {
        return marketTime;
    }

    public void setMarketTime(LocalDateTime marketTime) {
        this.marketTime = marketTime;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getIsYaoFang() {
        return isYaoFang;
    }

    public void setIsYaoFang(Integer isYaoFang) {
        this.isYaoFang = isYaoFang;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaxCatalogNo() {
        return taxCatalogNo;
    }

    public void setTaxCatalogNo(String taxCatalogNo) {
        this.taxCatalogNo = taxCatalogNo;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getIsFragile() {
        return isFragile;
    }

    public void setIsFragile(Integer isFragile) {
        this.isFragile = isFragile;
    }

    public Integer getPutOnDirection() {
        return putOnDirection;
    }

    public void setPutOnDirection(Integer putOnDirection) {
        this.putOnDirection = putOnDirection;
    }

    public Integer getIsValuables() {
        return isValuables;
    }

    public void setIsValuables(Integer isValuables) {
        this.isValuables = isValuables;
    }

    public Integer getIsLiquid() {
        return isLiquid;
    }

    public void setIsLiquid(Integer isLiquid) {
        this.isLiquid = isLiquid;
    }

    public Integer getIsCrossContamination() {
        return isCrossContamination;
    }

    public void setIsCrossContamination(Integer isCrossContamination) {
        this.isCrossContamination = isCrossContamination;
    }

    public String getStorageHumidity() {
        return storageHumidity;
    }

    public void setStorageHumidity(String storageHumidity) {
        this.storageHumidity = storageHumidity;
    }

    public BigDecimal getProductTaxRate() {
        return productTaxRate;
    }

    public void setProductTaxRate(BigDecimal productTaxRate) {
        this.productTaxRate = productTaxRate;
    }

    public Integer getSyncKingbo() {
        return syncKingbo;
    }

    public void setSyncKingbo(Integer syncKingbo) {
        this.syncKingbo = syncKingbo;
    }

    public Integer getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(Integer medicineType) {
        this.medicineType = medicineType;
    }

    public Integer getCodeType() {
        return codeType;
    }

    public void setCodeType(Integer codeType) {
        this.codeType = codeType;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public LocalDateTime getApprovalExpireDate() {
        return approvalExpireDate;
    }

    public void setApprovalExpireDate(LocalDateTime approvalExpireDate) {
        this.approvalExpireDate = approvalExpireDate;
    }

    public String getMedicineNo() {
        return medicineNo;
    }

    public void setMedicineNo(String medicineNo) {
        this.medicineNo = medicineNo;
    }

    public Integer getSnCtrlInd() {
        return snCtrlInd;
    }

    public void setSnCtrlInd(Integer snCtrlInd) {
        this.snCtrlInd = snCtrlInd;
    }

    public Integer getNeedBatchCtrl() {
        return needBatchCtrl;
    }

    public void setNeedBatchCtrl(Integer needBatchCtrl) {
        this.needBatchCtrl = needBatchCtrl;
    }

    public Integer getDrugApproval() {
        return drugApproval;
    }

    public void setDrugApproval(Integer drugApproval) {
        this.drugApproval = drugApproval;
    }

    public Integer getDrugStandard() {
        return drugStandard;
    }

    public void setDrugStandard(Integer drugStandard) {
        this.drugStandard = drugStandard;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public Integer getMainInfo() {
        return mainInfo;
    }

    public void setMainInfo(Integer mainInfo) {
        this.mainInfo = mainInfo;
    }

    public String getProvinceNorms() {
        return provinceNorms;
    }

    public void setProvinceNorms(String provinceNorms) {
        this.provinceNorms = provinceNorms;
    }

    public String getCityNorms() {
        return cityNorms;
    }

    public void setCityNorms(String cityNorms) {
        this.cityNorms = cityNorms;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public LocalDateTime getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(LocalDateTime auditDate) {
        this.auditDate = auditDate;
    }

    public Integer getFinanceAuditStatus() {
        return financeAuditStatus;
    }

    public void setFinanceAuditStatus(Integer financeAuditStatus) {
        this.financeAuditStatus = financeAuditStatus;
    }

    public Integer getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(Integer syncStatus) {
        this.syncStatus = syncStatus;
    }

    public LocalDateTime getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(LocalDateTime syncTime) {
        this.syncTime = syncTime;
    }

    public Integer getAdUsIntOrAdUsExt() {
        return adUsIntOrAdUsExt;
    }

    public void setAdUsIntOrAdUsExt(Integer adUsIntOrAdUsExt) {
        this.adUsIntOrAdUsExt = adUsIntOrAdUsExt;
    }

    public String getProductionLicense() {
        return productionLicense;
    }

    public void setProductionLicense(String productionLicense) {
        this.productionLicense = productionLicense;
    }

    public Integer getIsAirLift() {
        return isAirLift;
    }

    public void setIsAirLift(Integer isAirLift) {
        this.isAirLift = isAirLift;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public Integer getStateControlled() {
        return stateControlled;
    }

    public void setStateControlled(Integer stateControlled) {
        this.stateControlled = stateControlled;
    }

    public Long getSpuInfoId() {
        return spuInfoId;
    }

    public void setSpuInfoId(Long spuInfoId) {
        this.spuInfoId = spuInfoId;
    }

    public Integer getSpuInfoDefault() {
        return spuInfoDefault;
    }

    public void setSpuInfoDefault(Integer spuInfoDefault) {
        this.spuInfoDefault = spuInfoDefault;
    }

    @Override
    public String toString() {
        return "BtocSku{" +
        "id=" + id +
        ", skuNo=" + skuNo +
        ", definitionid=" + definitionid +
        ", definitionname=" + definitionname +
        ", brandid=" + brandid +
        ", brandname=" + brandname +
        ", catalogid=" + catalogid +
        ", catalogname=" + catalogname +
        ", weight=" + weight +
        ", neightWeight=" + neightWeight +
        ", length=" + length +
        ", inputdate=" + inputdate +
        ", inputer=" + inputer +
        ", updatetime=" + updatetime +
        ", updater=" + updater +
        ", productarea=" + productarea +
        ", detail=" + detail +
        ", drugType=" + drugType +
        ", qualityPeriod=" + qualityPeriod +
        ", manufacturerid=" + manufacturerid +
        ", manufacturer=" + manufacturer +
        ", boxBoard=" + boxBoard +
        ", prescription=" + prescription +
        ", barcode=" + barcode +
        ", approvalnum=" + approvalnum +
        ", storageTemp=" + storageTemp +
        ", storageRequire=" + storageRequire +
        ", norms=" + norms +
        ", marketTime=" + marketTime +
        ", width=" + width +
        ", height=" + height +
        ", skuName=" + skuName +
        ", isYaoFang=" + isYaoFang +
        ", size=" + size +
        ", degree=" + degree +
        ", color=" + color +
        ", taxCatalogNo=" + taxCatalogNo +
        ", shortName=" + shortName +
        ", volume=" + volume +
        ", unit=" + unit +
        ", isFragile=" + isFragile +
        ", putOnDirection=" + putOnDirection +
        ", isValuables=" + isValuables +
        ", isLiquid=" + isLiquid +
        ", isCrossContamination=" + isCrossContamination +
        ", storageHumidity=" + storageHumidity +
        ", productTaxRate=" + productTaxRate +
        ", syncKingbo=" + syncKingbo +
        ", medicineType=" + medicineType +
        ", codeType=" + codeType +
        ", auditStatus=" + auditStatus +
        ", approvalExpireDate=" + approvalExpireDate +
        ", medicineNo=" + medicineNo +
        ", snCtrlInd=" + snCtrlInd +
        ", needBatchCtrl=" + needBatchCtrl +
        ", drugApproval=" + drugApproval +
        ", drugStandard=" + drugStandard +
        ", label=" + label +
        ", mainInfo=" + mainInfo +
        ", provinceNorms=" + provinceNorms +
        ", cityNorms=" + cityNorms +
        ", auditor=" + auditor +
        ", auditDate=" + auditDate +
        ", financeAuditStatus=" + financeAuditStatus +
        ", syncStatus=" + syncStatus +
        ", syncTime=" + syncTime +
        ", adUsIntOrAdUsExt=" + adUsIntOrAdUsExt +
        ", productionLicense=" + productionLicense +
        ", isAirLift=" + isAirLift +
        ", symptom=" + symptom +
        ", stateControlled=" + stateControlled +
        ", spuInfoId=" + spuInfoId +
        ", spuInfoDefault=" + spuInfoDefault +
        "}";
    }
}
