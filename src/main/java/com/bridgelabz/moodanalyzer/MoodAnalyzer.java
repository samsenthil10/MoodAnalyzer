package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

	String message;

	public MoodAnalyzer() {

		this.message="This is a happy message";
	}

	public MoodAnalyzer(String message) {

		this.message = message;
	}

	public String analyzeMood() {

		try {
			
			if(message.toLowerCase().contains("sad"))
				return "SAD";
			return "HAPPY";
		}

		catch(NullPointerException e) {
			return "HAPPY";
		}

	}
}
