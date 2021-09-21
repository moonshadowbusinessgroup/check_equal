package com.hadimusthafa.check_equal;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScrollSubmitActivity extends AppCompatActivity {


    TextView a1r;
    TextView a2r;
    TextView a3r;
    TextView a4r;
    TextView a5r;


    TextView a1a;
    TextView a2a;
    TextView a3a;
    TextView a4a;
    TextView a5a;

    TextView scoreT;

    String scoreS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_submit);

        a1r = findViewById(R.id.a1r);
        a2r = findViewById(R.id.a2r);
        a3r = findViewById(R.id.a3r);
        a4r = findViewById(R.id.a4r);
        a5r = findViewById(R.id.a5r);

        a1a = findViewById(R.id.a1a);
        a2a = findViewById(R.id.a2a);
        a3a = findViewById(R.id.a3a);
        a4a = findViewById(R.id.a4a);
        a5a = findViewById(R.id.a5a);

        scoreT = findViewById(R.id.scoreT);


        a1r.setText(getIntent().getExtras().getString("q1A"));
        a2r.setText(getIntent().getExtras().getString("q2A"));
        a3r.setText(getIntent().getExtras().getString("q3A"));
        a4r.setText(getIntent().getExtras().getString("q4A"));
        a5r.setText(getIntent().getExtras().getString("q5A"));
        scoreS = (getIntent().getExtras().getInt("score")+"");


        a1a.setText("Correct answer is 8 bit.");
        a2a.setText("Correct answer is 64 bit.");
        a3a.setText("Correct answer is 0.");
        a4a.setText("Correct answer is String is immutable.");
        a5a.setText("Correct answer is Dynamic Binding.");

        scoreT.setText("Your score is " +scoreS + "/5");


        

    }
}