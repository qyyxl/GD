package com.gd.service;

import com.gd.model.UserCart;
import com.gd.core.BaseService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 我的购物车 服务类
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
public interface UserCartService extends BaseService<UserCart> {

    List<UserCart> queryUserCartByUserId(Integer userId);

    boolean insertUserCartGuessL(UserCart userCart);
}
