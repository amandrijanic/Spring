package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings 
	private String[] data = {
			"Beware of the wolf in sheep's cloathing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length); //get random number based on size of array
		
		String theFortune = data[index]; //grab a fortune from the array
		
		return theFortune;
	}

}
