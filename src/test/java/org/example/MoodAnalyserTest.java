package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
public class MoodAnalyserTest {

    @Test
    public void givenSadMessage_shouldReturnSad() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String message = "I am in sad mood";
        String result = moodAnalyser.analyseMood(message);
        assertEquals("SAD", result);

    }
}