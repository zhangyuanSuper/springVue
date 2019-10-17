package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.RoleUser;
import com.example.demo.pojo.Users;

public interface IUserDao {
	
	public Users queryUserNameWithPWd(@Param("name")String name,@Param("pwd")String pwd);
    
	int addUsers(Users users);
	
	int updateUsersByUsersId(Users users);
	
	int delUsersByUsersId(Integer userid);
	
	Users queryUserByUserid(Integer userid);
	
	List<Users> queryAllUsers();
	
	List<RoleUser> queryAllRoleUser();

}
