package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		   A atemp =(A) context.getBean("aref");
		
		System.out.println(atemp.getX());
		
        System.out.println(atemp.getObj().getY());
		
		System.out.println(atemp);
		
	}

}
