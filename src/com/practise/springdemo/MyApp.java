package com.practise.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// create object		
		Coach theCoach = new TrackCoach(null);
		// use object
		System.out.println(theCoach.getDailyWorkOut());
	}

}
