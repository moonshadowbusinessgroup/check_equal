package com.hadimusthafa.check_equal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class radiobuttonActivity2 extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton btnR1,btnR2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton2);

        radioGroup=findViewById(R.id.radioGroup);
        btnR1=findViewById(R.id.btnR1);
        btnR2=findViewById(R.id.btnR2);



        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId== R.id.btnR1){

                    String male = "male";

                    Intent intent = new Intent(radiobuttonActivity2.this, radioLogActivity.class);
                    intent.putExtra("genderRef", male);
                    startActivity(intent);

                }else if (checkedId== R.id.btnR2){

                    String female = "female";

                    Intent intent = new Intent(radiobuttonActivity2.this, radioLogActivity.class);
                    intent.putExtra("genderRef", female);
                    startActivity(intent);

                }

            }
        });



    }
}