package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoodAnalyserTest {

    @Test
    public void givenSadMessage_shouldReturnSad() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("SAD");
        String result = moodAnalyser.analyseMood("SAD");
        assertEquals("SAD", result);

    }

    @Test
    public void givenAnyMessage_checkForSad_shouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String result = moodAnalyser.analyseMood("Happy");
            assertEquals("Happy", result);


    }

    @Test
    public void givenNullMessage_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("Happy");
        String message = null;
        String result = moodAnalyser.analyseMood(message);
        assertEquals("Happy", result);
    }

    @Test
    public void givenNullMessage_ShouldThrowMoodAnalysisException() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String message = null;
        Exception exception = assertThrows(MoodAnalysisException.class, () -> {
            moodAnalyser.analyseMood(message);
        });
        assertEquals(MoodAnalysisError.NULL_MOOD, ((MoodAnalysisException) exception).getError());
        assertEquals("Mood cannot be null", exception.getMessage());
    }
}