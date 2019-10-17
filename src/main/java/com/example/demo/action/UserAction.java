package com.example.demo.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.biz.UserBiz;
import com.example.demo.pojo.RoleUser;
import com.example.demo.pojo.Users;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/users")
public class UserAction {

	@Autowired
	private UserBiz biz;
	
	@GetMapping("{name}/{pwd}")
	public Map<String,Object> queryUserNameWithPwd(@PathVariable String name,@PathVariable String pwd,HttpSession session){
		Map<String,Object> msg=new HashMap<String,Object>();
		Users users=biz.queryUserNameWithPWd(name, pwd);
		if(users!=null) {
			msg.put("code111", "200");
			msg.put("msg", "ok");
			msg.put("USERS", users);
			msg.put("token", session.getId());
		}else {
			msg.put("code", "300");
			msg.put("msg", "no");
		}
		return msg;
	}
	
	@GetMapping("/queryAllUsers/{p}/{s}")
	public PageInfo<Users> queryAllUsers(@PathVariable Integer p,@PathVariable Integer s){
		return biz.queryAllUsersByPage(p, s);
	}
	
	@PostMapping("/addUsers")
	public Map<String,Object> addUsers(@RequestBody Users users) {
		Map<String,Object> msg=new HashMap<String,Object>();
		int count=biz.addUsers(users);
		if(count>0) {
			msg.put("code", "200");
			msg.put("msg", "ok");
		}else {
			msg.put("code", "300");
			msg.put("msg", "no");
		}
		return msg;
	}
	
	@GetMapping("/queryByUserId/{userid}")
	public Users queryByUserId(@PathVariable Integer userid) {
		return biz.queryUsersByUserId(userid);
	}
	
	@PostMapping("/updateUsersByUserId")
	public Map<String,Object> updateUsers(@RequestBody Users users) {
		Map<String,Object> msg=new HashMap<String,Object>();
		int count=biz.updateUsersByUsersId(users);
		if(count>0) {
			msg.put("code", "200");
			msg.put("msg", "ok");
		}else {
			msg.put("code", "300");
			msg.put("msg", "no");
		}
		return msg;
	}
	
	@GetMapping("/delUsersByUserId/{userid}")
	public Map<String,Object> delUsers(@PathVariable Integer userid) {
		Map<String,Object> msg=new HashMap<String,Object>();
		int count=biz.delUsersByUserId(userid);
		if(count>0) {
			msg.put("code", "200");
			msg.put("msg", "ok");
		}else {
			msg.put("code", "300");
			msg.put("msg", "no");
		}
		return msg;
	}
	
	@GetMapping("/queryRoleUser")
	public List<RoleUser> queryRoleUser(){
		System.out.println(biz.queryAllRoleUser());
		return biz.queryAllRoleUser();
	}
}
