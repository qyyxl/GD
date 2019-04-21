package com.gd.service.impl;

import com.gd.model.User;
import com.gd.dao.UserDao;
import com.gd.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author system
 * @since 2019-04-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Override
    public void getUserList() {

    }

    @Override
    public void getUserLoveList() {

    }

    @Override
    public void insertUserGuessL() {

    }

    @Override
    public void updateUserGuessL() {

    }
}
