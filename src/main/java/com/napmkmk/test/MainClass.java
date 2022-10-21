package com.napmkmk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Pencil pencil = ctx.getBean("pencil", Pencil.class); //부모로 만든 펜슬
		
		pencil.use();
		
		ctx.close();
		
		
	}

}
