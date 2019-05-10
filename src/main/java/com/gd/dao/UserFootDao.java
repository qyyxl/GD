package com.gd.dao;

import com.gd.model.UserFoot;
import com.gd.core.BaseDao;
import com.gd.model.UserFootVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 我的足迹 Mapper 接口
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
public interface UserFootDao extends BaseDao<UserFoot> {

    public List<UserFootVo> queryUserFootByUserId(@Param("userId") Integer userId);

}
