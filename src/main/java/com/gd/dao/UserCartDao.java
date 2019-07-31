package com.gd.dao;

import com.gd.model.UserCart;
import com.gd.core.BaseDao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 我的购物车 Mapper 接口
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
public interface UserCartDao extends BaseDao<UserCart> {

    public List<UserCart> queryUserCartByUserId(@Param("userId") Integer userId);
}
