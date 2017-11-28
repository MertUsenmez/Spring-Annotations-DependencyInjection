package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach alphaCoach = context.getBean("thatSillyCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\\n This objects same objects : " + result);
		System.out.println("\n Location of theCoach : " + theCoach);
		System.out.println("\n Location of alphaCoach : " + alphaCoach);
		
		context.close();

	}

}
