package com.hadimusthafa.check_equal;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class radioLogActivity extends AppCompatActivity {

    TextView yourGenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_log);

        yourGenter =findViewById(R.id.yourGenter);
        yourGenter.setText(getIntent().getExtras().getString("genderRef"));
    }
}