package org.alanhou.mapper;

import org.alanhou.model.User;
import org.alanhou.model.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int getUserCount();
    void addUser(@Param("id") Integer id, @Param("name") String name, @Param("sex") String sex, @Param("age") Integer age );
    void updateUser(@Param("id") Integer id, @Param("name") String name, @Param("age") Integer age );
    void deleteUser(@Param("id") Integer id);

}