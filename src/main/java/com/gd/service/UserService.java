package com.gd.service;

import com.gd.core.BaseService;
import com.gd.model.User;
import com.gd.model.UserLove;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author system
 * @since 2019-04-21
 */
public interface UserService extends BaseService<User> {

    List<User> queryUserList();

    List<UserLove> getUserLoveList();

    void insertUserGuessL();

    void updateUserGuessL();
}
