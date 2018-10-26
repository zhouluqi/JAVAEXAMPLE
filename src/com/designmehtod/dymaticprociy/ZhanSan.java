package com.designmehtod.dymaticprociy;

public class ZhanSan implements Persion{
	private String name ="张三";
	private String sex = "男";

	@Override
	public void findLove() {
		System.out.println("我叫"+this.name+",性别："+this.sex+"对象要求是：");
		System.out.println("高富帅");
		System.out.println("有房有车");
		System.out.println("身高180cm以上");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
