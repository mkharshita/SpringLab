package com.cg.labbook1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.labbook1.config.JavaConfig;
import com.cg.labbook1.service.IService;
import com.cg.labbook1.service.ServiceImp;

public class MainClass 
{
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		ServiceImp service=context.getBean(ServiceImp.class);
		service.display();
	}
}
