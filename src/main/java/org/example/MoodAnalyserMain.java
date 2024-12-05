package org.example;

public class MoodAnalyserMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Problem");

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        String mood = moodAnalyzer.analyseMood("Happy");

        System.out.println("I am in " + mood );

    }
}
