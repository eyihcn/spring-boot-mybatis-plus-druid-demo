package com.example.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TestUserMapper extends BaseMapper<TestUser> {

    @Update("${statement}")
    void batchSql(@Param("statement") String statement);
}
