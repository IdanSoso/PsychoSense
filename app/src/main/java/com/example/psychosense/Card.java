package com.example.psychosense;

import com.google.firebase.database.DatabaseReference;

public class Card {
    private String question;
    private String answer;

    public Card(){
        question = null;
        answer = null;
    }

    public Card(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
