package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
public class MoodAnalyserTest {

    @Test
    public void givenSadMessage_shouldReturnSad() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String result = moodAnalyser.analyseMood();
        assertEquals("SAD", result);

    }

    @Test
    public void givenAnyMessage_checkForSad_shouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String result = moodAnalyser.analyseMood();
        if(result == "Happy")
            assertEquals("Happy", result);
        else
            assertEquals("SAD", result);

    }
}