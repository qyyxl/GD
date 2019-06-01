package com.gd.dao;

import com.gd.model.Recommend;
import com.gd.core.BaseDao;
import com.gd.model.RecommendVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 推荐表 Mapper 接口
 * </p>
 *
 * @author system
 * @since 2019-04-30
 */
public interface RecommendDao extends BaseDao<Recommend> {

    public List<RecommendVo> queryRecommendVoByUserId(@Param("userId") Integer userId);

}
