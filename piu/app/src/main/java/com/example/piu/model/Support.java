package com.example.piu.model;

public class Support {
    private String mQuestion;
    private String mAnswer;
    private boolean mExpanded;

    public Support(String question, String answer, boolean expanded) {
        this.mQuestion = question;
        this.mAnswer = answer;
        this.mExpanded = expanded;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        this.mQuestion = question;
    }

    public String getAnswer() {
        return mAnswer;
    }

    public void setAnswer(String answer) {
        this.mAnswer = answer;
    }

    public boolean isExpanded() {
        return mExpanded;
    }

    public void setExpanded(boolean expanded) {
        this.mExpanded = expanded;
    }
}
