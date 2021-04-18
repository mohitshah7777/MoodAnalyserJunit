package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    //TC 1.1
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad()
    {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood=moodAnalyser.analyseMood("I am in SAD mood");
        Assert.assertEquals("SAD",mood);
    }

    //TC 1.2
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.analyseMood("I am in any mood");
        Assert.assertEquals("HAPPY",mood);
    }
}