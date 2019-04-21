package com.gd.dao;

import com.gd.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author system
 * @since 2019-04-21
 */
@Repository
public interface UserDao extends BaseMapper<User> {

    List<User> queryUserList();

}
