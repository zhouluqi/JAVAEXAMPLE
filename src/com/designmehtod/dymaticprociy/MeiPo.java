package com.designmehtod.dymaticprociy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MeiPo implements InvocationHandler {
     private Persion target;

     //获取被代理人的资料
	public Object getInstance(Persion target){
		this.target = target;
		//利用反射获取接口和类加载器
		Class clazz = target.getClass();
		System.out.println("被代理对象的class是："+clazz);
		return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是媒婆 你的性别是："+this.target.getSex()+"我得给你找个异性");
		System.out.println("开始进行海选。。。");
		System.out.println("--------");
		this.target.findLove();
		System.out.println("--------");
		System.out.println("如果合适的话准备交往。。。");
		return null;
	}
}
