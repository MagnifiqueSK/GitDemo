package com.practise.springdemo;

public class BaseballCoach implements Coach {

	// create a field to create a constructor
	FortuneService fortuneService;
	
	//create a constructor that uses the field above
	public BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Practise batting for 30 mins";	
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "BaseballCoach :" + fortuneService.getFortune();
	}
}
