package com.gd.filter;

/**
 * 猜你喜欢
 * created by yinxunling
 *
 * @param <k>
 * @param <v>
 */
public interface IFilter<k, v> {
    //数据库读取数据到内存
    void readData();

    //处理数据并入库
    void processData();
}
