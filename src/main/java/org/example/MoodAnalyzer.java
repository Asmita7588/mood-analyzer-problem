package org.example;

import java.awt.font.TextHitInfo;

public class MoodAnalyzer {
    private String message;

    //Default Constructor
    public MoodAnalyzer(){
        message = "SAD";
        System.out.println(message);
    }
    //parameterized constructor
    public MoodAnalyzer(String message){
        this.message = message;
    }

     public String analyseMood(){

         if(message == null || message.isEmpty())
             return "neutral";

         if(message.toLowerCase().contains("sad"))
             return "SAD";

         if(message.toLowerCase().contains("happy"))
             return "Happy Mood";

         return "Happy";

     }
}