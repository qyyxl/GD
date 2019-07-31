package com.gd.service;

import com.gd.model.UserOrder;
import com.gd.core.BaseService;

import java.util.List;

/**
 * <p>
 * 我的订单 服务类
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
public interface UserOrderService extends BaseService<UserOrder> {

    List<UserOrder> queryUserOrderByUserId(Integer userId);

    boolean insertUserOrderGuessL(UserOrder userOrder);
}
