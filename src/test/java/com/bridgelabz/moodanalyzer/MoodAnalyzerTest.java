package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {

		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		assertEquals("SAD", moodAnalyzer.analyzeMood("This is a sad message"));
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {

		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		assertEquals("HAPPY", moodAnalyzer.analyzeMood("This is a happy message"));
	}
}
