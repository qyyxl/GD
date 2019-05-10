package com.gd.dao;

import com.gd.model.UserOrder;
import com.gd.core.BaseDao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 我的订单 Mapper 接口
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
public interface UserOrderDao extends BaseDao<UserOrder> {

    public List<UserOrder> queryUserOrderByUserId(@Param("userId") Integer userId);
}
