package com.gd.service;

import com.gd.model.Recommend;
import com.gd.core.BaseService;
import com.gd.model.RecommendVo;

import java.util.List;

/**
 * <p>
 * 推荐表 服务类
 * </p>
 *
 * @author system
 * @since 2019-04-30
 */
public interface RecommendService extends BaseService<Recommend> {

    List<RecommendVo> queryRecommendVoByUserId(Integer userId);

}
