package com.gd.service;

import com.gd.model.UserFoot;
import com.gd.core.BaseService;
import com.gd.model.UserFootVo;

import java.util.List;

/**
 * <p>
 * 我的足迹 服务类
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
public interface UserFootService extends BaseService<UserFoot> {

    List<UserFootVo> queryUserFootByUserId(Integer userId);

    boolean insertUserFootGuessL(UserFoot userFoot);
}
