package com.example.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatis.entity.User;

@Mapper
public interface UserRepository {
  User getUser(String userId);
}
