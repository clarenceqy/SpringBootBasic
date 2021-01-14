package com.javadevmap.basic.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "名字不能为空")
	private String name;
	
	@NotNull(message = "年龄不能为空")
	@NotBlank(message = "年龄不能为空")
	@Min(value = 0,message = "输入的年龄小于最小值")
	@Max(value = 150,message = "输入的年龄大于最大值")
	private Integer age;
	
	@Length(min= 7,max = 11,message = "")
	private String phoneNum;
	
	@NotBlank(message = "地址不能为空")
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "name=" + name + ";age=" + age + ";phoneNum=" + phoneNum + ";address" + address;
	}

}
