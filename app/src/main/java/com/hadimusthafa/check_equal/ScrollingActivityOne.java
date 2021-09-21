package com.hadimusthafa.check_equal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class ScrollingActivityOne extends AppCompatActivity {

    Button submitB;

    TextView q1T;
    RadioGroup rg1;
    RadioButton q1rb1;
    RadioButton q1rb2;
    RadioButton q1rb3;
    RadioButton q1rb4;

    TextView q2T;
    RadioGroup rg2;
    RadioButton q2rb1;
    RadioButton q2rb2;
    RadioButton q2rb3;
    RadioButton q2rb4;

    TextView q3T;
    RadioGroup rg3;
    RadioButton q3rb1;
    RadioButton q3rb2;
    RadioButton q3rb3;
    RadioButton q3rb4;

    TextView q4T;
    RadioGroup rg4;
    RadioButton q4rb1;
    RadioButton q4rb2;
    RadioButton q4rb3;
    RadioButton q4rb4;

    TextView q5T;
    RadioGroup rg5;
    RadioButton q5rb1;
    RadioButton q5rb2;
    RadioButton q5rb3;
    RadioButton q5rb4;

    String q1A;
    String q2A;
    String q3A;
    String q4A;
    String q5A;

    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score4 = 0;
    int score5 = 0;

    int score = 0;

    int q1;
    int q2;
    int q3;
    int q4;
    int q5;

    CollapsingToolbarLayout toolBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_one);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle("Questions");

        submitB = findViewById(R.id.submitB);

        q1T = findViewById(R.id.q1T);
        rg1 = findViewById(R.id.rg1);
        q1rb1 = findViewById(R.id.q1rb1);
        q1rb2 = findViewById(R.id.q1rb2);
        q1rb3 = findViewById(R.id.q1rb3);
        q1rb4 = findViewById(R.id.q1rb4);


        q2T = findViewById(R.id.q2T);
        rg2 = findViewById(R.id.rg2);
        q2rb1 = findViewById(R.id.q2rb1);
        q2rb2 = findViewById(R.id.q2rb2);
        q2rb3 = findViewById(R.id.q2rb3);
        q2rb4 = findViewById(R.id.q2rb4);


        q3T = findViewById(R.id.q3T);
        rg3 = findViewById(R.id.rg3);
        q3rb1 = findViewById(R.id.q3rb1);
        q3rb2 = findViewById(R.id.q3rb2);
        q3rb3 = findViewById(R.id.q3rb3);
        q3rb4 = findViewById(R.id.q3rb4);


        q4T = findViewById(R.id.q4T);
        rg4 = findViewById(R.id.rg4);
        q4rb1 = findViewById(R.id.q4rb1);
        q4rb2 = findViewById(R.id.q4rb2);
        q4rb3 = findViewById(R.id.q4rb3);
        q4rb4 = findViewById(R.id.q4rb4);


        q5T = findViewById(R.id.q5T);
        rg5 = findViewById(R.id.rg5);
        q5rb1 = findViewById(R.id.q5rb1);
        q5rb2 = findViewById(R.id.q5rb2);
        q5rb3 = findViewById(R.id.q5rb3);
        q5rb4 = findViewById(R.id.q5rb4);


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                q1=1;
                score1 = 0;

                if (checkedId == R.id.q1rb1) {
                    q1A = "1.True Answer";
                    score1++;
                } else {
                    q1A = "1.False Answer";
                    score1--;
                }

            }


        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                q2=1;
                score2 = 0;

                if (checkedId == R.id.q2rb4) {
                    q2A = "2.True Answer";
                    score2++;
                } else {
                    q2A = "2.False Answer";
                    score2--;
                }

            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                q3=1;
                score3 = 0;

                if (checkedId == R.id.q3rb1) {
                    q3A = "3.True Answer";
                    score3++;
                } else {
                    q3A = "3.False Answer";
                    score3--;
                }

            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                q4=1;
                score4 = 0;

                if (checkedId == R.id.q4rb2) {
                    q4A = "4.True Answer";
                    score4++;
                } else {
                    q4A = "4.False Answer";
                    score4--;
                }

            }
        });

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                q5=1;
                score5 = 0;

                if (checkedId == R.id.q5rb2) {
                    q5A = "5.True Answer";
                    score5++;
                } else {
                    q5A = "5.False Answer";
                    score5--;
                }


            }
        });


        submitB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                int fullq = q1+q2+q3+q4+q5;

                if(fullq==5){

                    if (score1 != 1) {
                        score1 = 0;
                    }

                    if (score2 != 1) {
                        score2 = 0;
                    }

                    if (score3 != 1) {
                        score3 = 0;
                    }
                    if (score4 != 1) {
                        score4 = 0;
                    }

                    if (score5 != 1) {
                        score5 = 0;
                    }

                    score = score1 + score2 + score3 + score4 + score5;

                    Intent intent = new Intent(ScrollingActivityOne.this, ScrollSubmitActivity.class);
                    intent.putExtra("q1A", q1A);
                    intent.putExtra("q2A", q2A);
                    intent.putExtra("q3A", q3A);
                    intent.putExtra("q4A", q4A);
                    intent.putExtra("q5A", q5A);

                    Toast.makeText(ScrollingActivityOne.this, score + "", Toast.LENGTH_SHORT).show();

                    intent.putExtra("score", score);
                    startActivity(intent);

                }else {
                    Toast.makeText(ScrollingActivityOne.this,"please attend full questions", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }


}