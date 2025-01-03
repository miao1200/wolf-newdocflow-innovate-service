package com.ndocflow.wolf.innocation.business.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ndocflow.wolf.innocation.business.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}