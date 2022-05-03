package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalyzerException;
import com.bridgelabz.moodanalyser.RefactorMoodAnalyser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser;

    //Before method
    @Before
    public void before(){
        moodAnalyser = new MoodAnalyser();
    }

    /*
     *When given happy message then it should return happy
     */
    @Test
    public void givenMessage_IAmInHappyMood_ShouldReturnHappy(){
        String mood = moodAnalyser.analyseMood("This is a happy message");
        Assert.assertEquals("happy", mood);
    }

    /*
     *When given sad message then it should return sad
     */
    @Test
    public void givenMessage_IAmInSadMood_ShouldReturnSad(){
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("sad", mood);
    }

    /*
     *When given happy message then it should return happy
     */
    @Test
    public void givenMessage_InHappyMood_ShouldReturnHappy(){
        RefactorMoodAnalyser moodAnalyser1 = new RefactorMoodAnalyser("I am in happy mood");
        String mood = moodAnalyser1.analyseMood();
        Assert.assertEquals("happy", mood);
    }

    /*
     *When given sad message then it should return sad
     */
    @Test
    public void givenMessage_SadMood_ShouldReturnHappy(){
        RefactorMoodAnalyser moodAnalyser1 = new RefactorMoodAnalyser("I am in sad mood");
        String mood = moodAnalyser1.analyseMood();
        Assert.assertEquals("sad", mood);
    }

    /*
     *When given invalid message then it should return happy
     */
//    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy(){
        RefactorMoodAnalyser moodAnalyser1 = new RefactorMoodAnalyser(null);
        String mood = moodAnalyser1.analyseMood();
        Assert.assertEquals("happy", mood);
    }

    /*
     *Null pointer exception
     */
    @Test
    public void givenMessage_WhenNull_ShouldThrowMoodAnalysisNullException() {

        RefactorMoodAnalyser moodAnalyzer1 = new RefactorMoodAnalyser(null);
        try {
            moodAnalyzer1.analyseMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

     /*
      *Empty exception
     */
    @Test
    public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisEmptyException() {

        RefactorMoodAnalyser moodAnalyzer = new RefactorMoodAnalyser("");
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
