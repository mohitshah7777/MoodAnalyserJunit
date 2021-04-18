package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    //TC 1.1
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad()
    {
        MoodAnalyser moodAnalyser= new MoodAnalyser("I am in SAD mood");
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    //TC 1.2
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in any mood");
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}