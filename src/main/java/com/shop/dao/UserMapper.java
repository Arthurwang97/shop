package com.shop.dao;

import org.apache.ibatis.annotations.Param;

import com.shop.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	int checkUser(String username);
	int checkEmail(String email);
	User selectLogin(@Param("username")String username, @Param("password")String password);

	String selectquestion(String user);
	int selectanswer(@Param("username") String username,@Param("question")String question,@Param("answer")String answer);
	int updatenewp(@Param("username") String username,@Param("passwordnew")String password);
}