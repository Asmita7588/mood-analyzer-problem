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

     public String analyseMood(String message) throws MoodAnalysisException {
         try {
             if (message == null)
                 throw new MoodAnalysisException(MoodAnalysisError.NULL_MOOD, "Mood cannot be null");
             if (message.isEmpty())
                 throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MOOD, "Mood cannot be empty");

             if (message.toLowerCase().contains("sad"))
                 return "SAD";

             if (message.toLowerCase().contains("happy"))
                 return "Happy";
         }catch (NullPointerException | MoodAnalysisException e) {
             throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MOOD, "Mood cannot be empty");
         }

         return "Happy";

     }



}