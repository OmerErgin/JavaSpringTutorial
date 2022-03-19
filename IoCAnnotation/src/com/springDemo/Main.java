package com.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IoCConfig.class);
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		
		customerService.add();
				
	}

}