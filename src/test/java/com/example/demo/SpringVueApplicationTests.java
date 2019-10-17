package com.example.demo;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.biz.UserBiz;
import com.example.demo.dao.IUserDao;
import com.example.demo.pojo.Users;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringVueApplicationTests {

	@Autowired
	public IUserDao udao;
	
	@Autowired
	public UserBiz biz;
	
	@Test
	public void contextLoads() {
		System.out.println(udao.queryUserNameWithPWd("admin", "123"));
	}
	
	@Test
	public void add() {
		Users users=new Users("jack","123123",1);
		int count =udao.addUsers(users);
		if(count>0) {
			System.out.println("成功！");
		}else {
		System.out.println("失败！");
		}
	}
	
	@Test
	public void update() {
		Users users=new Users("jack9999","123123",9,1);
		int count =udao.updateUsersByUsersId(users);
		if(count>0) {
			System.out.println("成功！");
		}else {
		System.out.println("失败！");
		}
	}
	
	@Test
	public void del() {
		int count=udao.delUsersByUsersId(9);
		if(count>0) {
			System.out.println("成功！");
		}else {
		System.out.println("失败！");
		}
	}
	
	@Test
	public void queryByPage() {
		List<Users> list=biz.queryAllUsers();
		System.out.println(list.get(0).getRname());
	}

}
