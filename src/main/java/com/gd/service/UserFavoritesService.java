package com.gd.service;

import com.gd.model.UserFavorites;
import com.gd.core.BaseService;
import com.gd.model.UserFavoritesVo;

import java.util.List;

/**
 * <p>
 * 我的收藏夹 服务类
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
public interface UserFavoritesService extends BaseService<UserFavorites> {

    List<UserFavoritesVo> queryUserFavoritesByUserId(Integer userId);

    boolean insertUserFavoritesGuessL(UserFavorites userFavorites);

}
