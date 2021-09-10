package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalyzerException.exceptionType;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_WhenNull_ShouldThrowMoodAnalysisException() {

		try {

			MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
			moodAnalyzer.analyzeMood();
		}
		catch(MoodAnalyzerException e) {

			Assert.assertEquals(exceptionType.ENTERED_NULL,e.type);			
		}
	}
	
	@Test
	public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisException() {

		try {

			MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
			moodAnalyzer.analyzeMood();
		}
		catch(MoodAnalyzerException e) {

			Assert.assertEquals(exceptionType.ENTERED_EMPTY,e.type);			
		}
	}
}
