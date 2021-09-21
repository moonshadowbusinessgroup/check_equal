package com.hadimusthafa.check_equal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CheckEqualActivity extends AppCompatActivity implements View.OnClickListener {

    EditText firstText, seconText;
    Button checkBtn;
    TextView textView;

    String string1;
    String string2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_equal);

        init();
        onClickListener();


    }

    public void init() {
        firstText = findViewById(R.id.firstTxt);
        seconText = findViewById(R.id.secondTxt);
        checkBtn = findViewById(R.id.checkButton);
        textView = findViewById(R.id.textView);
    }

    public void onClickListener() {
        checkBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.checkButton) {

            string1 = (firstText.getText().toString());

            string2 = (seconText.getText().toString());

            if (string1.equals(string2)) {
                textView.setText("Two values are equal");
            } else {
                textView.setText("Two values are not equal");
            }
        }

    }
}

