package com.practise.springdemo;

public class TrackCoach implements Coach {
	
	public FortuneService fortuneService;
	

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Do the 5K run";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Track Coach:" + fortuneService.getFortune();
	}

}
