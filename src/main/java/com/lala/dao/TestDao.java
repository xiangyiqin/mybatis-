package com.lala.dao;

import com.lala.pojo.Goods;

import java.util.List;

public interface TestDao {
    List<Goods> selectAll();
    int isnertObject(Goods goods);
}
