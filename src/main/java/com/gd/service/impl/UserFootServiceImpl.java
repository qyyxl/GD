package com.gd.service.impl;

import com.gd.model.UserFoot;
import com.gd.dao.UserFootDao;
import com.gd.model.UserFootVo;
import com.gd.model.UserLove;
import com.gd.service.UserFootService;
import com.gd.core.BaseServiceImpl;
import com.gd.service.UserLoveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 我的足迹 服务实现类
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
@Service
public class UserFootServiceImpl extends BaseServiceImpl<UserFootDao, UserFoot> implements UserFootService {

    private static final Logger logger = LoggerFactory.getLogger(UserFootServiceImpl.class);

    @Autowired
    UserFootDao userFootDao;
    @Autowired
    UserLoveService userLoveService;

    @Override
    public List<UserFootVo> queryUserFootByUserId(Integer userId) {
        return userFootDao.queryUserFootByUserId(userId);
    }

    @Override
    public boolean insertUserFootGuessL(UserFoot userFoot) {
        Integer re = userFootDao.insert(userFoot);
        if (re > 0) {
            UserLove userLove = new UserLove();
            userLove.setItemId(userFoot.getItemId());
            userLove.setUserId(userFoot.getUserId());
            userLove.setSource("click");
            UserLove userLoveR = userLoveService.queryUserLove(userLove);
            if (StringUtils.isEmpty(userLoveR)) {
                boolean lo = userLoveService.insertUserLove(userLove);
                logger.info("足迹re:{},lo:{}", re, lo);
                if (lo == true) {
                    return true;
                }
            }
        }
        return false;
    }
}
