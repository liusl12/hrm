package com.liusl.hrm.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * created by l1 on 2017/12/26.
 */
@Mapper
public interface UserMapper {
    public Map selectUser(Integer id);
}
