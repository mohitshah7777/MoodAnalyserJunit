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

    //UC2 -- TC 2.1
    public String analyseMood() throws MoodAnalysisException {
        try {
            if(message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.errorType.EMPTY,"Empty mood");        //UC3 -- TC 3.2
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.errorType.NULL,"Null Mood");              //UC3 -- TC 3.1
        }
    }
}
