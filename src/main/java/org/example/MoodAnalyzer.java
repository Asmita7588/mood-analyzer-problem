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

     public String analyseMood(String message) {

         if(message == null)
             return "Happy";

         if(message.toLowerCase().contains("sad"))
             return "SAD";

         if(message.toLowerCase().contains("happy"))
             return "Happy";

         return "Happy";

     }



}