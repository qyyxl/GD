package com.gd.service.impl;

import com.gd.core.BaseServiceImpl;
import com.gd.dao.UserDao;
import com.gd.model.User;
import com.gd.model.UserLove;
import com.gd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author system
 * @since 2019-04-21
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> queryUserList() {
        return userDao.queryUserList();
    }

    @Override
    public List<UserLove> getUserLoveList() {
        return null;
    }

    @Override
    public void insertUserGuessL() {

    }

    @Override
    public void updateUserGuessL() {

    }
}
