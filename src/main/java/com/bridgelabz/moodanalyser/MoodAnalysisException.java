package com.bridgelabz.moodanalyser;

//UC2 Handle Exception
public class MoodAnalysisException extends Exception {

    //UC3 Inform user if entered Invalid Mood
    public enum errorType {
        NULL,EMPTY;
    }
    public errorType type;

    public MoodAnalysisException(String message)
    {
        super(message);
        this.type=type;
    }
}

