package com.gd.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.gd.model.UserLove;
import com.gd.model.UserOrder;
import com.gd.dao.UserOrderDao;
import com.gd.service.UserLoveService;
import com.gd.service.UserOrderService;
import com.gd.core.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 我的订单 服务实现类
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
@Service
public class UserOrderServiceImpl extends BaseServiceImpl<UserOrderDao, UserOrder> implements UserOrderService {

    private static final Logger logger = LoggerFactory.getLogger(UserOrderServiceImpl.class);

    @Autowired
    UserOrderDao userOrderDao;
    @Autowired
    UserLoveService userLoveService;

    @Override
    public List<UserOrder> queryUserOrderByUserId(Integer userId) {
        return userOrderDao.selectList(new EntityWrapper<UserOrder>().eq("userId", userId));
    }

    @Override
    public boolean insertUserOrderGuessL(UserOrder userOrder) {
        Integer re = userOrderDao.insert(userOrder);
        if (re > 0) {
            logger.info("re:{}", re);
            UserLove userLove = new UserLove();
            userLove.setItemId(userOrder.getItemId());
            userLove.setUserId(userOrder.getUserId());
            userLove.setSource("alipay");
            UserLove userLoveR = userLoveService.queryUserLove(userLove);
            if (StringUtils.isEmpty(userLoveR)) {
                boolean lo = userLoveService.insertUserLove(userLove);
                logger.info("我的订单lo:{}", re, lo);
                if (lo == true) {
                    return true;
                }
            }
        }
        return false;
    }
}
