package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

    public String message;

    //Refractored the code to take the mood message in the constructor
    public MoodAnalyser() {
        this.message=message;
    }

    public MoodAnalyser(String message) {
        this.message=message;
    }

    public String analyseMood(String message) {
        return analyseMood();
    }

    public String analyseMood()
    {
        if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}
