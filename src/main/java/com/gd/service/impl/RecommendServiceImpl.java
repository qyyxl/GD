package com.gd.service.impl;

import com.gd.model.Recommend;
import com.gd.dao.RecommendDao;
import com.gd.model.RecommendVo;
import com.gd.service.RecommendService;
import com.gd.core.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 推荐表 服务实现类
 * </p>
 *
 * @author system
 * @since 2019-04-30
 */
@Service
public class RecommendServiceImpl extends BaseServiceImpl<RecommendDao, Recommend> implements RecommendService {

    @Autowired
    RecommendDao recommendDao;

    @Override
    public List<RecommendVo> queryRecommendVoByUserId(Integer userId) {
        return recommendDao.queryRecommendVoByUserId(userId);
    }
}
