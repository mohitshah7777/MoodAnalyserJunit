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
    //UC2
    @Test
    public void givenNullMood_ShouldThrowException() {
        MoodAnalyser moodAnalyzer=new MoodAnalyser(null);
        try{
            moodAnalyzer.analyseMood();
        }catch (MoodAnalysisException e){
            Assert.assertEquals("Please Enter correct message",e.getMessage());
        }
    }



}