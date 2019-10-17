package com.example.demo.pojo;

import java.util.List;

public class Users {
	
	private String username;
	private String userpwd;
	
	private Integer userid;
	private Integer rid;
	private Integer status;
	
	private String rname;
	
	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Users() {
		
	}
	
	public Users(String username, String userpwd) {
		super();
		this.username = username;
		this.userpwd = userpwd;
	}

	public Users(String username, String userpwd, Integer userid, Integer rid) {
		super();
		this.username = username;
		this.userpwd = userpwd;
		this.rid = rid;
		this.userid = userid;
	}

	public Users(String username, String userpwd, Integer rid) {
		super();
		this.username = username;
		this.userpwd = userpwd;
		this.rid = rid;
	}
	
	

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
}
