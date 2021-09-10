package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	
	String message;
	
	public MoodAnalyzer() {
		
		this.message="This is a sad message";
	}
	
	public MoodAnalyzer(String message) {
		
		this.message = message;
	}
	
	public String analyzeMood() {

		if(message.toLowerCase().contains("sad"))
			return "SAD";
		return "HAPPY";
	}
}
