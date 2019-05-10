package com.gd.dao;

import com.gd.model.UserFavorites;
import com.gd.core.BaseDao;
import com.gd.model.UserFavoritesVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 我的收藏夹 Mapper 接口
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
public interface UserFavoritesDao extends BaseDao<UserFavorites> {

    public List<UserFavoritesVo> queryUserFavoritesByUserId(@Param("userId") Integer userId);
}
