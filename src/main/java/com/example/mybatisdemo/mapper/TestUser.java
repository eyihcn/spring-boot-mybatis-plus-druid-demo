package com.example.mybatisdemo.mapper;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName
public class TestUser {

	@TableId(type = IdType.AUTO)
	private Integer id;
	private String uname;
	private String pwd;
	private String testFiled;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getTestFiled() {
		return testFiled;
	}

	public void setTestFiled(String testFiled) {
		this.testFiled = testFiled;
	}
}
