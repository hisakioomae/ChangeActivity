package jp.app.oomae.hisaki.mychangeactivitysample.model;

import com.google.gson.annotations.SerializedName;

public class Question {

    @SerializedName("question_title")
    public String question_title;
    @SerializedName("answer_a")
    public String answer_a;
    @SerializedName("answer_b")
    public String answer_b;
}
