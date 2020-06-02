package com.wzh;

import com.wzh.model.InfoModel;

public interface InfoModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoModel record);

    int insertSelective(InfoModel record);

    InfoModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InfoModel record);

    int updateByPrimaryKey(InfoModel record);
}