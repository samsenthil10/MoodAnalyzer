package com.bridgelabz.moodanalyzer;

@SuppressWarnings("serial")
public class MoodAnalyzerException extends Exception {

	enum exceptionType {

		ENTERED_NULL, ENTERED_EMPTY		
	}

	exceptionType type;

	public MoodAnalyzerException(exceptionType type, String message) {

		super(message);
		this.type = type;
	}
}
