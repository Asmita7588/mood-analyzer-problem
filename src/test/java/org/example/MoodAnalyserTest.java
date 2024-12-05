package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
public class MoodAnalyserTest {

    @Test
    public void givenSadMessage_shouldReturnSad() throws InvalidMoodException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("SAD");
        String result = moodAnalyser.analyseMood("SAD");
        assertEquals("SAD", result);

    }

    @Test
    public void givenAnyMessage_checkForSad_shouldReturnHappy() throws InvalidMoodException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String result = moodAnalyser.analyseMood("Happy");
            assertEquals("Happy", result);


    }

    @Test
    public void givenNullMessage_ShouldReturnHappy() throws InvalidMoodException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("Happy");
        String message = null;
        String result = moodAnalyser.analyseMood(message);
        assertEquals("Happy", result);
    }
}