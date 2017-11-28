package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component                                  //@Component default olarak tanýmlanýrsa bean id= classýn baþ harfi küçük olarak ismidir. 
@Component("thatSillyCoach")                  //thatSillyCoach is bean id.   //This bean will create automatically.
@Scope("prototype")                           //@Scope default olursa singleton u uygular böylece olusturulan nesneler ayný olur.
public class TennisCoach implements Coach{
	
	//field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/* for the take value from a file
	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
    */
	
	public TennisCoach() 
	{
		System.out.println(">> Non-arg constructor of TennisCoach.");
	}
	
	//define my init method
	@PostConstruct
	public void myStartInit()
	{
		System.out.println(">> Starting myStartInit() method.");
	}
	
	//define my destroy method
	@PreDestroy
	public void myStopDestroy()
	{
		System.out.println(">> Stoping myStopDestroy() method.");
	}
	
	
	/*Setter injection
	
	@Autowired
	public void setFortuneService((@Qualifier("randomFortuneService") FortuneService fortuneService) 
	{
		System.out.println(">> Setter method of TennisCoach.");
		this.fortuneService = fortuneService;
	}
    */
	
	/*Constructor injection
	
	@Autowired
	public TennisCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}*/
	
	
	@Override
	public String getDailyWorkout()
	{
		return "Practice holley 20 min.";
	}

	@Override
	public String getDailyFortune() 
	{	
		return fortuneService.getFortune();
	}

}
