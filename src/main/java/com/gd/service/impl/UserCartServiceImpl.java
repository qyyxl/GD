package com.gd.service.impl;

import com.gd.model.UserCart;
import com.gd.dao.UserCartDao;
import com.gd.model.UserLove;
import com.gd.service.UserCartService;
import com.gd.core.BaseServiceImpl;
import com.gd.service.UserLoveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 我的购物车 服务实现类
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
@Service
public class UserCartServiceImpl extends BaseServiceImpl<UserCartDao, UserCart> implements UserCartService {

    private static final Logger logger = LoggerFactory.getLogger(UserCartServiceImpl.class);
    @Autowired
    UserCartDao userCartDao;
    @Autowired
    UserLoveService userLoveService;

    @Override
    public List<UserCart> queryUserCartByUserId(Integer userId) {
        return userCartDao.queryUserCartByUserId(userId);
    }

    @Override
    public boolean insertUserCartGuessL(UserCart userCart) {
        Integer re = userCartDao.insert(userCart);
        if (re > 0) {
            UserLove userLove = new UserLove();
            userLove.setItemId(userCart.getItemId());
            userLove.setUserId(userCart.getUserId());
            userLove.setSource("cart");
            UserLove userLoveR = userLoveService.queryUserLove(userLove);
            if (StringUtils.isEmpty(userLoveR)) {
                boolean lo = userLoveService.insertUserLove(userLove);
                logger.info("购物车re:{},lo:{}", re, lo);
                if (lo == true) {
                    return true;
                }
            }
        }
        return false;
    }
}
