package org.example;

public class MoodAnalyserMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Problem");

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        try {
            moodAnalyzer.analyseMood(null);
        }catch (InvalidMoodException e){
            System.out.println("Exception: " + e.getMessage());

        }


    }
}