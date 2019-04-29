package com.gd.service.impl;

import com.gd.model.UserLove;
import com.gd.dao.UserLoveDao;
import com.gd.service.UserLoveService;
import com.gd.core.BaseServiceImpl;
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

}
