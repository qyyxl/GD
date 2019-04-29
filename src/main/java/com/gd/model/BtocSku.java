package com.gd.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.math.BigDecimal;

import java.time.LocalDateTime;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author system
 * @since 2019-04-21
 */
@Data
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
