package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

    public String message;

    public String analyseMood() {
        this.message=message;
        return analyseMood();
    }

    public String analyseMood(String message)
    {
        if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}
