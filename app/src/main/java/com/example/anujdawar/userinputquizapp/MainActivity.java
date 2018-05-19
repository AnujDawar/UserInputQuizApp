package com.example.anujdawar.userinputquizapp;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;
    int radioButtonId;
    View radioButton;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score = 0;
    }

    public void submitButton(View view)
    {
        RadioGroup ques1 = (RadioGroup) findViewById(R.id.ques1);
        RadioGroup ques2 = (RadioGroup) findViewById(R.id.ques2);
        RadioGroup ques3 = (RadioGroup) findViewById(R.id.ques3);
        RadioGroup ques4 = (RadioGroup) findViewById(R.id.ques4);
        RadioGroup ques5 = (RadioGroup) findViewById(R.id.ques5);
        RadioGroup ques6 = (RadioGroup) findViewById(R.id.ques6);
        RadioGroup ques7 = (RadioGroup) findViewById(R.id.ques7);
        RadioGroup ques8 = (RadioGroup) findViewById(R.id.ques8);
        RadioGroup ques9 = (RadioGroup) findViewById(R.id.ques9);
        RadioGroup ques10 = (RadioGroup) findViewById(R.id.ques10);

        radioButtonId = ques1.getCheckedRadioButtonId();
        radioButton = ques1.findViewById(radioButtonId);
        index = ques1.indexOfChild(radioButton);

        if(index == 1)
            score++;

        radioButtonId = ques2.getCheckedRadioButtonId();
        radioButton = ques2.findViewById(radioButtonId);
        index = ques2.indexOfChild(radioButton);

        if(index == 1)
            score++;

        radioButtonId = ques3.getCheckedRadioButtonId();
        radioButton = ques3.findViewById(radioButtonId);
        index = ques3.indexOfChild(radioButton);

        if(index == 1)
            score++;

        radioButtonId = ques4.getCheckedRadioButtonId();
        radioButton = ques4.findViewById(radioButtonId);
        index = ques4.indexOfChild(radioButton);

        if(index == 1)
            score++;

        radioButtonId = ques5.getCheckedRadioButtonId();
        radioButton = ques5.findViewById(radioButtonId);
        index = ques5.indexOfChild(radioButton);

        if(index == 1)
            score++;

        radioButtonId = ques6.getCheckedRadioButtonId();
        radioButton = ques6.findViewById(radioButtonId);
        index = ques6.indexOfChild(radioButton);

        if(index == 1)
            score++;

        radioButtonId = ques7.getCheckedRadioButtonId();
        radioButton = ques7.findViewById(radioButtonId);
        index = ques7.indexOfChild(radioButton);

        if(index == 1)
            score++;

        radioButtonId = ques8.getCheckedRadioButtonId();
        radioButton = ques8.findViewById(radioButtonId);
        index = ques8.indexOfChild(radioButton);

        if(index == 1)
            score++;

        radioButtonId = ques9.getCheckedRadioButtonId();
        radioButton = ques9.findViewById(radioButtonId);
        index = ques9.indexOfChild(radioButton);

        if(index == 1)
            score++;

        radioButtonId = ques10.getCheckedRadioButtonId();
        radioButton = ques10.findViewById(radioButtonId);
        index = ques10.indexOfChild(radioButton);

        if(index == 1)
            score++;

        Toast.makeText(this, "Score : " + String.valueOf(score), Toast.LENGTH_SHORT).show();

        score = 0;
    }
}