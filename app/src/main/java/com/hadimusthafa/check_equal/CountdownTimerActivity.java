package com.hadimusthafa.check_equal;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CountdownTimerActivity extends AppCompatActivity {

    TextView timerT;
    TextView timer;
    TextView yourTimeT;
    EditText minT;
    EditText secT;
    Button startB;

    long minL;
    long secL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown_timer);

        timerT = findViewById(R.id.timerT);
        timer = findViewById(R.id.timer);
        yourTimeT = findViewById(R.id.yourTimeT);
        minT = findViewById(R.id.minT);
        secT = findViewById(R.id.secT);
        startB = findViewById(R.id.startB);

        startB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                minT.setVisibility(View.INVISIBLE);
                secT.setVisibility(View.INVISIBLE);
                startB.setVisibility(View.INVISIBLE);

                timerT.setVisibility(View.VISIBLE);
                yourTimeT.setVisibility(View.VISIBLE);

                minL = Long.parseLong(minT.getText().toString());
                secL = Long.parseLong(secT.getText().toString());

                long minutes = minL;
                long min = minutes * 60000;

                long seconds = secL;
                long sec = seconds * 1000;

                yourTimeT.setText(minL + " Minutes " + secL + " seconds");

                long timeL = min + sec;

                long timeP = 50 * timeL / 100;
//                Log.e("timeL--------","-->"+timeL+"");
//                Log.e("timeP--------","-->"+timeP+"");


                new CountDownTimer(timeL, 1000) {
                    int f=0;
                    public void onTick(long millisUntilFinished) {

//                        Log.e("millisUntilFinished----","---->"+millisUntilFinished);
                        timer.setText(""+millisUntilFinished / 1000);
                        if (timeP > millisUntilFinished) {

                            f++;
                            if (f<=1){
                                timerT.setText("It does not take much time");
//                                Log.e("timeP--------","--eqqqqqqqqqqqqq");
//                                Snackbar.make(v,"aaaaaaaa", BaseTransientBottomBar.LENGTH_SHORT);
                            }

                        }
                    }

                    public void onFinish() {

                        timer.setText("Done");
                    }

                }.start();

            }
        });

    }
}