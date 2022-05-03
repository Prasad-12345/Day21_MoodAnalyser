package com.bridgelabz.moodanalyser;
/*
 *Custom runtime exception
 */
public class MoodAnalyzerException extends RuntimeException {

    //Type of exceptions
    public enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }

    public ExceptionType type;

    //This method contains exception type and message
    public MoodAnalyzerException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
