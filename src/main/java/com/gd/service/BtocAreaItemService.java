package com.gd.service;

import com.gd.model.BtocAreaItem;
import com.gd.core.BaseService;
import com.gd.model.ProductVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author system
 * @since 2019-04-29
 */
public interface BtocAreaItemService extends BaseService<BtocAreaItem> {

    List<ProductVo> queryProductForVo (String productName);

}
