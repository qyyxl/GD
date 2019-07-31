package com.gd.service.impl;

import com.gd.model.UserLove;
import com.gd.dao.UserLoveDao;
import com.gd.service.UserLoveService;
import com.gd.core.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 推荐关系表 服务实现类
 * </p>
 *
 * @author system
 * @since 2019-04-30
 */
@Service
public class UserLoveServiceImpl extends BaseServiceImpl<UserLoveDao, UserLove> implements UserLoveService {

    @Autowired
    UserLoveDao userLoveDao;

    @Override
    public UserLove queryUserLove(UserLove userLove) {
        return userLoveDao.selectOne(userLove);
    }

    @Override
    public boolean insertUserLove(UserLove userLove) {
        Integer re = userLoveDao.insert(userLove);
        return re > 0 ? true : false;
    }


}
