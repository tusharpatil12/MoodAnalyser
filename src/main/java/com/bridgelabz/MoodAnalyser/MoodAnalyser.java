package com.bridgelabz.MoodAnalyser;

public class MoodAnalyser {
	
	public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("happy")) {
            return "Happy";
        }
        return null;
    }

	public static void main(String[] args) {
		System.out.println("welcome to mood analyser program");
		
		 String mood = MoodAnalyser.analyseMood("User is Happy");
	        System.out.println(mood);
	        mood = MoodAnalyser.analyseMood("User is Sad");
	        System.out.println(mood);

	}

}
