package org.example;

public class MoodAnalyserMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Problem");

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad Mood");

        System.out.println( moodAnalyzer.analyseMood());


    }
}
