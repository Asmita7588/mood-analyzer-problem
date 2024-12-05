package org.example;

public class InvalidMoodException extends Exception{
    public InvalidMoodException(String mood){
        super(mood);
    }
}
