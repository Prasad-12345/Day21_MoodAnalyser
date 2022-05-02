package com.bridgelabz.moodanalyser;
/*
 *Author: Prasad
 *Given a message, ability to analyse and respond happy or sad mood
 */
public class MoodAnalyser {
    public String analyseMood(String message){
        if(message.toLowerCase().contains("happy")){
            return "happy";
        }
        else {
            return "sad";
        }
    }
}
