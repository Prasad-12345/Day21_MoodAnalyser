package com.bridgelabz.moodanalyser;
/*
 *Author: Prasad
 *Refactor the code to take the mood message in Constructor
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
     *This method will return happy or sad
     */
    public String analyseMood(){
        if(message.toLowerCase().contains("happy")){
            return "happy";
        }
        else {
            return "sad";
        }
    }
}
