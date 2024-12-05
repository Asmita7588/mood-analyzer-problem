package org.example;

public class MoodAnalyserMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Problem");

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        try {
            System.out.println("Mood: " +moodAnalyzer.analyseMood(""));
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getError() + " - " + e.getMessage());
        }


    }
}