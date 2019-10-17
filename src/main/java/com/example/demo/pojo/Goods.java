package com.example.demo.pojo;

public class Goods {
	
	private int pid;
	private String pname;
	private String ptype;
	private double pprice;
	private String pimg;
	private String pflag;
	private String pproduce;
	

	public Goods() {}
	
	public Goods(int pid,String pname,String ptype,double pprice,String pimg,String pflag,String pproduce) {
		this.pid=pid;
		this.pname=pname;
		this.ptype=ptype;
		this.pprice=pprice;
		this.pimg=pimg;
		this.pflag=pflag;
		this.pproduce=pproduce;
	}
	
	public String getPproduce() {
		return pproduce;
	}

	public void setPproduce(String pproduce) {
		this.pproduce = pproduce;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public String getPflag() {
		return pflag;
	}
	public void setPflag(String pflag) {
		this.pflag = pflag;
	}
}
