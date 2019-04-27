package com.gd.core;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gd.dao.BaseDao;

/**
 * 基础service实现
 * @author liuxianqiang
 *
 */
public class BaseServiceImpl<M extends BaseDao<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {

}
