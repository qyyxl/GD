package com.gd.dao;

import com.gd.model.BtocAreaItem;
import com.gd.core.BaseDao;
import com.gd.model.ProductVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author system
 * @since 2019-04-29
 */
public interface BtocAreaItemDao extends BaseDao<BtocAreaItem> {

    public List<ProductVo> queryProductForVo(@Param("productName") String productName, @Param("limit") Integer limit);

    public List<ProductVo> queryProductForDetail(@Param("id") Integer id);


}
