package com.hadimusthafa.check_equal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button checkEqual = findViewById(R.id.checkEqual);
        Button calculator = findViewById(R.id.calculator);
        Button countdownTimer = findViewById(R.id.countdownTimer);
        Button daysDiffActivity = findViewById(R.id.daysDiffActivity);
        Button logActivity = findViewById(R.id.logActivity);
        Button radiobuttonActivity2 = findViewById(R.id.radiobuttonActivity2);
        Button scrollingActivityOne = findViewById(R.id.scrollingActivityOne);

        checkEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CheckEqualActivity.class);
                startActivity(intent);
            }
        });
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), calculatorActivity.class);
                startActivity(intent);
            }
        });
        countdownTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CountdownTimerActivity.class);
                startActivity(intent);
            }
        });
        daysDiffActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DaysDiffActivity.class);
                startActivity(intent);
            }
        });
        logActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LogActivity.class);
                startActivity(intent);
            }
        });
        radiobuttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), radiobuttonActivity2.class);
                startActivity(intent);
            }
        });
        scrollingActivityOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScrollingActivityOne.class);
                startActivity(intent);
            }
        });

    }
}
