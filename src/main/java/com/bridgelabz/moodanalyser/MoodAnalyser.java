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

    public String analyseMood(String message) throws MoodAnalysisException{
        return analyseMood();
    }

    //UC2
    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e){
            throw new MoodAnalysisException("Please Enter correct message");
        }
    }
}
