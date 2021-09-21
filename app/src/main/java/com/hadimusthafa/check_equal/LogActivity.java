package com.hadimusthafa.check_equal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nameE, mobileE, placeE, emailE, txtDate;
    Button logB;
    RadioGroup radioGroup;
    RadioButton btnR1, btnR2;

    private int mYear, mMonth, mDay;


    String nameS;
    String mobileS;
    String placeS;
    String emailS;
    String dateOfBirth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        Init();
        myonClickListener();

        radioGroup = findViewById(R.id.radioGroup);
        btnR1 = findViewById(R.id.btnR1);
        btnR2 = findViewById(R.id.btnR2);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.btnR1) {

                    String male = "male";

                    Intent intent = new Intent(LogActivity.this, LoginActivity.class);
                    intent.putExtra("maleRef", male);

                } else if (checkedId == R.id.btnR2) {

                    String female = "female";

                    Intent intent = new Intent(LogActivity.this, LoginActivity.class);
                    intent.putExtra("femaleRef", female);

                }

            }
        });

    }

    public void Init() {
        nameE = findViewById(R.id.b1);
        mobileE = findViewById(R.id.b2);
        placeE = findViewById(R.id.b3);
        emailE = findViewById(R.id.b7);
        logB = findViewById(R.id.b7);

        txtDate = findViewById(R.id.b8);


    }


    private void myonClickListener() {
        logB.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        if (v.getId() == R.id.b7) {
            if (nameE.length() > 0) {
                if (mobileE.length() >= 10) {
                    if (placeE.length() > 0) {
                        if (emailE.length() > 0) {

                            nameS = nameE.getText().toString();
                            mobileS = mobileE.getText().toString();
                            placeS = placeE.getText().toString();
                            emailS = emailE.getText().toString();
                            dateOfBirth = txtDate.getText().toString();

                            if (dateOfBirth.length() > 0) {


                                Intent intent = new Intent(LogActivity.this, LoginActivity.class);
                                intent.putExtra("nameRef", nameS);
                                intent.putExtra("mobileRef", mobileS);
                                intent.putExtra("placeRef", placeS);
                                intent.putExtra("emailRef", emailS);
                                intent.putExtra("dateOfBirthRef", dateOfBirth);

                                startActivity(intent);

                            } else {
                                Toast.makeText(this, "Enter valid date of birth", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(this, "Enter valid email", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(this, "Enter valid place name", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(this, "Enter valid  mobile number", Toast.LENGTH_SHORT).show();
                }

            } else {
                Toast.makeText(this, "Enter valid Name", Toast.LENGTH_SHORT).show();
            }


        }

    }
}