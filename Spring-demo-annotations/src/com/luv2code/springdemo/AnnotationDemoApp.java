package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);   //@Component default tan�mlansayd� 
		                                                                   //ba� harfi k���k bir �ekilde class�n ismi thatSillyCoach yerine yaz�lacakt�
		//TennisCoach tennisCoach = context.getBean("thatSillyCoach", TennisCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
