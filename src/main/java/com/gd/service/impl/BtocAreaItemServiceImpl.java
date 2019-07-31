package com.gd.service.impl;

import com.gd.model.BtocAreaItem;
import com.gd.dao.BtocAreaItemDao;
import com.gd.model.ProductVo;
import com.gd.service.BtocAreaItemService;
import com.gd.core.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author system
 * @since 2019-04-29
 */
@Service
public class BtocAreaItemServiceImpl extends BaseServiceImpl<BtocAreaItemDao, BtocAreaItem> implements BtocAreaItemService {

    @Autowired
    BtocAreaItemDao btocAreaItemDao;

    @Override
    public List<ProductVo> queryProductForVo(String productName, Integer limit) {
        return btocAreaItemDao.queryProductForVo(productName, limit);
    }

    @Override
    public List<ProductVo> queryProductForDetail(Integer id) {
        return btocAreaItemDao.queryProductForDetail(id);
    }
}
