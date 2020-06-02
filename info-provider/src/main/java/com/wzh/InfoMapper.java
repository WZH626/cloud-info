package com.wzh;

import com.wzh.model.InfoModel;
import com.wzh.model.TreeModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InfoMapper {
    @Select("select * from tree")
    List<TreeModel> getAllTree();
    @Select("select * from info")
    List<InfoModel> queryInfoList();
    @Delete("delete from info where tid=#{tid}")
    void deleteA(Integer tid);
}
