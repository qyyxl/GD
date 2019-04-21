package com.gd.service;
import com.gd.model.User;
import com.baomidou.mybatisplus.extension.service.IService;
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
public interface UserService extends IService<User> {

    List<User> queryUserList();

    List<UserLove> getUserLoveList();

    void insertUserGuessL();

    void updateUserGuessL();
}
