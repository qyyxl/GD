package com.gd.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.gd.model.User;
import com.gd.dao.UserDao;
import com.gd.model.UserLove;
import com.gd.service.UserService;
import com.gd.core.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author system
 * @since 2019-05-08
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
    public boolean checkUserForRegistered(String username, String password) {
        int count = userDao.selectCount(new EntityWrapper<User>().eq("username", username).eq("password", password));
        return count > 0 ? true : false;
    }

    @Override
    public User queryUserByUserName(User user) {
        return userDao.selectOne(user);
    }

    @Override
    public boolean insertUserGuessL(User user) {
        int re = userDao.insert(user);
        return re > 0 ? true : false;
    }

    @Override
    public boolean updateUserGuessL(User user) {
        int re = userDao.update(user, new EntityWrapper<User>().eq("id", user.getId()));
        return re > 0 ? true : false;
    }
}
