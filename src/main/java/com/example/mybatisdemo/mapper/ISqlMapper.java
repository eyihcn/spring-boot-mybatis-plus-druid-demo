package com.example.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * <pre>
 * Description:
 * </pre>
 *
 * @author chenyi
 * @date 2020/1/6
 */
@Mapper
public interface ISqlMapper {


    @Update("${statement}")
    void batchSql(@Param("statement") String statement);
}
