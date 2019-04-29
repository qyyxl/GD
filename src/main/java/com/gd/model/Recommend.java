package com.gd.model;


import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

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
public class Recommend implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private String skuNo;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;



    @Override
    public String toString() {
        return "Recommend{" +
        "id=" + id +
        ", userId=" + userId +
        ", skuNo=" + skuNo +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
