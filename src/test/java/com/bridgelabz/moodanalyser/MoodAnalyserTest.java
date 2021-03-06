package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    //Repeat TC 1.1
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser= new MoodAnalyser("I am in SAD mood");
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    //Repeat TC 1.2
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in HAPPY mood");
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    //UC3 -- TC 3.1
    @Test
    public void givenNULLMood_ShouldThrowMoodAnalysisException(){
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        try{
            moodAnalyser.analyseMood();
        }catch (MoodAnalysisException e){
            Assert.assertEquals("Null Mood",e.getMessage());
        }
    }
    //UC3 -- TC 3.2
    @Test
    public void givenEMPTYMood_ShouldThrowMoodAnalysisException(){
        MoodAnalyser moodAnalyser=new MoodAnalyser(" ");
        try{
            moodAnalyser.analyseMood();
        }catch (MoodAnalysisException e){
            Assert.assertEquals("Empty Mood",e.getMessage());
        }
    }
}