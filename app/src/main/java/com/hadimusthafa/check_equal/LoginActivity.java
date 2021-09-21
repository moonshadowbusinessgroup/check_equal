package com.hadimusthafa.check_equal;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    TextView nameT, mobileT, placeT, emailT, dateOfBirthT;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Init();
        nameT.setText(getIntent().getExtras().getString("nameRef"));
        mobileT.setText(getIntent().getExtras().getString("mobileRef"));
        placeT.setText(getIntent().getExtras().getString("placeRef"));
        emailT.setText(getIntent().getExtras().getString("emailRef"));
        dateOfBirthT.setText(getIntent().getExtras().getString("dateOfBirthRef"));
    }

    public void Init(){

        nameT=findViewById(R.id.nameT);
        mobileT=findViewById(R.id.mobileT);
        placeT=findViewById(R.id.placeT);
        emailT=findViewById(R.id.emailT);
        dateOfBirthT=findViewById(R.id.dateOfBirthT);
    }
}