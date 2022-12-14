package com.bridgelabz.MoodAnalyser;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class MoodAnalyserTest {

	@BeforeAll
	static void displayMsg() {
		System.out.println("Welcome Mood Analyzer Problem");
	}

	@AfterEach
	public void afterMsgDisplay() {
		System.out.println("Passed");
	}
	@Test
	public void givenMessage_WhenProper_ShouldReturnSad() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in Sad Mood");
		String result = moodanalyser.analyseMood();
		Assertions.assertEquals(result,"Sad");
	}

	@Test
	public void givenMessage_WhenProper_ShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in happy Mood");
		String result = moodanalyser.analyseMood();
		Assertions.assertEquals(result,"Happy");
	}
	@Test
    public void givenMessage_Null_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        String result = moodanalyser.analyseMood();
        Assertions.assertEquals(result,"Happy");
    }

}
