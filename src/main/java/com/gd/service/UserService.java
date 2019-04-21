package com.gd.service;
import com.gd.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author system
 * @since 2019-04-21
 */
public interface UserService extends IService<User> {
    void getUserList();

    void getUserLoveList();

    void insertUserGuessL();

    void updateUserGuessL();
}
