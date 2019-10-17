package com.example.demo.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUserDao;
import com.example.demo.pojo.RoleUser;
import com.example.demo.pojo.Users;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserBiz {
 
	@Autowired
	public IUserDao udao;
	
	public Users queryUserNameWithPWd(String name,String pwd) {
		return udao.queryUserNameWithPWd(name, pwd);
	}
	
	public int addUsers(Users users) {
		return udao.addUsers(users);
	}
	
	public int updateUsersByUsersId(Users users) {
		return udao.updateUsersByUsersId(users);
	}
	
	public int delUsersByUserId(Integer usersid) {
	 return udao.delUsersByUsersId(usersid);
	}
	
	
	public List<Users> queryAllUsers(){	
		return udao.queryAllUsers();
	}
	
	public PageInfo<Users> queryAllUsersByPage(Integer pageNum,Integer pageSize){	
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Users>(udao.queryAllUsers());
	}
	
	
	public List<RoleUser> queryAllRoleUser(){
		return udao.queryAllRoleUser(); 
	}
	
	public Users queryUsersByUserId(Integer userid) {
		return udao.queryUserByUserid(userid);
	}
}
