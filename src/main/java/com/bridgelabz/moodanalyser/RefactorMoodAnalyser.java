package com.bridgelabz.moodanalyser;
/*
 *Author: Prasad
 *Handle Exception if User Provides Invalid Moodgi
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
    public String analyseMood() throws MoodAnalyzerException{
        try {
     //       if(message.length() == 0){
       //         throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
         //   }
            if (message.toLowerCase().contains("sad")) {
                return "sad";
            }
            else if(message.toLowerCase().contains("happy")){
                return "happy";
            }
        }
        catch(NullPointerException e){
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
        }
        catch (MoodAnalyzerException e){
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, "Enter proper message. Empty not allowed");
        }
        return message;
    }
}
