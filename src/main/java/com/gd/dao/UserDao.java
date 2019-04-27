package com.gd.dao;

import com.gd.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author system
 * @since 2019-04-21
 */
@Repository
public interface UserDao extends BaseDao<User> {

    List<User> queryUserList();

}
