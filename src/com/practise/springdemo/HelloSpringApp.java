package com.practise.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// create spring container- load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//access the methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		// access the methods from the helper object
		System.out.println(theCoach.getDailyFortune());
		
		// access the literal values
		System.out.println(theCoach.getCoachName());
		System.out.println(theCoach.getEmailId());
		
		//close the context
		context.close();
	}

}
