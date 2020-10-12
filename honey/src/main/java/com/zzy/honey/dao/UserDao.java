package com.zzy.honey.dao;


import com.zzy.honey.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Select("SELECT * FROM user WHERE id = #{id}")
    User findUserById(@Param("id")String id);
}
