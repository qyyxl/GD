package com.gd.dao;

import com.gd.model.User;
import com.gd.core.BaseDao;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author system
 * @since 2019-05-08
 */
public interface UserDao extends BaseDao<User> {

    List<User> queryUserList();
}
