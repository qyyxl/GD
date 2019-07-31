package com.gd.service.impl;

import com.gd.model.UserFavorites;
import com.gd.dao.UserFavoritesDao;
import com.gd.model.UserFavoritesVo;
import com.gd.model.UserLove;
import com.gd.service.UserFavoritesService;
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
 * 我的收藏夹 服务实现类
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
@Service
public class UserFavoritesServiceImpl extends BaseServiceImpl<UserFavoritesDao, UserFavorites> implements UserFavoritesService {
    private static final Logger logger = LoggerFactory.getLogger(UserFavoritesServiceImpl.class);
    @Autowired
    UserFavoritesDao userFavoritesDao;
    @Autowired
    UserLoveService userLoveService;

    @Override
    public List<UserFavoritesVo> queryUserFavoritesByUserId(Integer userId) {
        return userFavoritesDao.queryUserFavoritesByUserId(userId);
    }

    @Override
    public boolean insertUserFavoritesGuessL(UserFavorites userFavorites) {
        Integer re = userFavoritesDao.insert(userFavorites);
        if (re > 0) {
            UserLove userLove = new UserLove();
            userLove.setItemId(userFavorites.getItemId());
            userLove.setUserId(userFavorites.getUserId());
            userLove.setSource("collect");
            UserLove userLoveR = userLoveService.queryUserLove(userLove);
            if (StringUtils.isEmpty(userLoveR)) {
                boolean lo = userLoveService.insertUserLove(userLove);
                logger.info("收藏夹re:{},lo:{}", re, lo);
                if (lo == true) {
                    return true;
                }
            }
        }
        return false;
    }
}
