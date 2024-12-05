package org.example;

public class MoodAnalyzer {

     public String analyseMood( String message){

         if(message == null || message.isEmpty())
             return "neutral";

         if(message.toLowerCase().contains("sad"))
             return "Sad Mood";

         if(message.toLowerCase().contains("happy"))
             return "Happy Mood";

         return "Neutral";

     }
}