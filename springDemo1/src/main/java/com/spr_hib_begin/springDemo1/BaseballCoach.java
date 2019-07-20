package com.spr_hib_begin.springDemo1;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting pratice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
