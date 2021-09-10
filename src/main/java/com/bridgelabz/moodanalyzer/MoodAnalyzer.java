package com.bridgelabz.moodanalyzer;

import com.bridgelabz.moodanalyzer.MoodAnalyzerException.exceptionType;

public class MoodAnalyzer {

	String message;

	public MoodAnalyzer() {

		this.message="This is a happy message";
	}

	public MoodAnalyzer(String message) {

		this.message = message;
	}

	public String analyzeMood() throws MoodAnalyzerException {

		try {
			
			if(message.length()==0)
				throw new MoodAnalyzerException(exceptionType.ENTERED_EMPTY,"Please Enter Proper Message!");
				
			if(message.toLowerCase().contains("sad"))
				return "SAD";
			return "HAPPY";
		}

		catch(NullPointerException e) {
			throw new MoodAnalyzerException(exceptionType.ENTERED_NULL,"Please Enter Proper Message!");
		}

	}
}
