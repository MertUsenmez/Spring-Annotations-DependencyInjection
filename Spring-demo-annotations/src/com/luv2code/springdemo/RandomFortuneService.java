package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
	
	private String[] data = {"Oracle", "IBM", "Amazon"};

	//random fortune generator
	private Random random = new Random(); 
	
	@Override
	public String getFortune() {
		
		int index = random.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
