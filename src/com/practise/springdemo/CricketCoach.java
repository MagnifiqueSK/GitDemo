package com.practise.springdemo;

public class CricketCoach implements Coach {
	
	 FortuneService fortuneService;
	 
	 private String coachName;
	 private String emailId;

	public String getCoachName() {
		return coachName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	// setter injection 
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practise spin bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Great bowling today! Flight the ball";
	}
	
}
