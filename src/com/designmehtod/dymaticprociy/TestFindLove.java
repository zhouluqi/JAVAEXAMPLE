package com.designmehtod.dymaticprociy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFindLove {
	public static void main(String[] args) {
		//new ZhanSan().findLove();
	Persion obj = (Persion) new MeiPo().getInstance(new ZhanSan());
		System.out.println(obj.getClass());
	    obj.findLove();
	    //原理：
		//1.拿到被代理的对象然后获取它的接口
		//2.JDK代理重新生成一个类，同时实现我们给的被代理对象所实现的接口
		//3.把被代理对象的引用也拿到了
		//4.重新动态生成一个class字节码

		//获取字节码内容
		byte[] data = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Persion.class});
		try {
			FileOutputStream os = new FileOutputStream("D:/$Proxy0.class" );
			os.write(data);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
