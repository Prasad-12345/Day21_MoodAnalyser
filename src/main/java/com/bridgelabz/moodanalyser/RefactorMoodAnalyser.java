package com.bridgelabz.moodanalyser;
/*
 *Author: Prasad
 *Handle Exception if User Provides Invalid Mood
 */
public class RefactorMoodAnalyser {
    String message;

    //default constructor
    public RefactorMoodAnalyser() {

    }

    //parametrized constructor
    public RefactorMoodAnalyser(String message) {
        this.message = message;
    }

    /*
     *This method will return happy or sad also handle null pointer exception
     */
    public String analyseMood(){
        try {
            if (message.toLowerCase().contains("sad")) {
                return "sad";
            } else if(message.toLowerCase().contains("happy")){
                return "happy";
            }
        }
        catch(NullPointerException e){
            return  "happy";
        }
        return message;
    }
}
