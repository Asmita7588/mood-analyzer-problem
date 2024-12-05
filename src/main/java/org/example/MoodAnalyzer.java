package org.example;

import java.awt.font.TextHitInfo;

public class MoodAnalyzer {
    private String message;

    //Default Constructor
    public MoodAnalyzer(){
        message = "Happy";
    }
    //parameterized constructor
    public MoodAnalyzer(String message){
        this.message = message;
    }

     public String analyseMood(String message) throws InvalidMoodException {

         if(message == null || message.isEmpty()) {
             throw new InvalidMoodException("Invalid Mood ,please enter valid mood");
         }

         if(message.toLowerCase().contains("sad"))
             return "SAD";

         if(message.toLowerCase().contains("happy"))
             return "Happy";

         return "Happy";

     }
}