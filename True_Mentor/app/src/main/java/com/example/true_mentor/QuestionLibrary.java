package com.example.true_mentor;

public class QuestionLibrary {

    private  String mQuestions [] = {
            "Q1.",
            "Q2.",
            "Q3.",
            "Q4.",
            "Q5."
    };

    private  String mChoices [] [] = {
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"}
    };

    private String mCorrectAnswers[] = {"1","2","3","4","1"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
