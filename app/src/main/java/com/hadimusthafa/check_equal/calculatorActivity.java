package com.hadimusthafa.check_equal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class calculatorActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnEqual, btnD, btnClear, btnAdd, btnSub, btnMul, btnDiv;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    EditText resultT;


    String mValueOne;
    String mValueTwo;


    boolean addBool, subBool, mulBool, divBool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        init();
        myClickListener();
    }

    private void myClickListener() {

        btnEqual.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }

    private void init() {

        resultT = findViewById(R.id.resultT);


        btnD = findViewById(R.id.btnD);
        btnEqual = findViewById(R.id.btnEqual);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnClear = findViewById(R.id.btnClear);


        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn0) {

            resultT.setText(resultT.getText() + "0");

        } else if (v.getId() == R.id.btn1) {

            resultT.setText(resultT.getText() + "1");

        } else if (v.getId() == R.id.btn2) {

            resultT.setText(resultT.getText() + "2");

        } else if (v.getId() == R.id.btn3) {

            resultT.setText(resultT.getText() + "3");

        } else if (v.getId() == R.id.btn4) {

            resultT.setText(resultT.getText() + "4");

        } else if (v.getId() == R.id.btn5) {

            resultT.setText(resultT.getText() + "5");

        } else if (v.getId() == R.id.btn6) {

            resultT.setText(resultT.getText() + "6");

        } else if (v.getId() == R.id.btn7) {

            resultT.setText(resultT.getText() + "7");

        } else if (v.getId() == R.id.btn8) {

            resultT.setText(resultT.getText() + "8");

        } else if (v.getId() == R.id.btn9) {

            resultT.setText(resultT.getText() + "9");

        } else if (v.getId() == R.id.btnClear) {

            resultT.setText("");
        } else if (v.getId() == R.id.btnD) {

            resultT.setText(resultT.getText() + ".");

        } else if (v.getId() == R.id.btnAdd) {
            if (resultT.length() > 0) {
                mValueOne = (resultT.getText() + "");
                addBool = true;
                resultT.setText(null);
            } else {
                resultT.setText("");
            }
        } else if (v.getId() == R.id.btnSub) {
            if (resultT.length() > 0) {
                mValueOne = (resultT.getText() + "");
                subBool = true;
                resultT.setText(null);
            } else {
                resultT.setText("");
            }
        } else if (v.getId() == R.id.btnMul) {
            if (resultT.length() > 0) {
                mValueOne = (resultT.getText() + "");
                mulBool = true;
                resultT.setText(null);
            } else {
                resultT.setText("");
            }
        } else if (v.getId() == R.id.btnDiv) {
            if (resultT.length() > 0) {
                mValueOne = (resultT.getText() + "");
                divBool = true;
                resultT.setText(null);
            } else {
                resultT.setText("");
            }
        } else if (v.getId() == R.id.btnEqual) {

            if (resultT.length() > 0) {

                mValueTwo = (resultT.getText() + "");

                if (addBool == true) {

                    try {
                        Float.parseFloat(mValueOne);
                        resultT.setText(Integer.parseInt(mValueOne) + Integer.parseInt(mValueTwo) + "");
                        addBool = false;
                        mValueOne = null;
                        mValueTwo = null;
                    } catch (NumberFormatException e) {
                        resultT.setText(Float.parseFloat(mValueOne) + Float.parseFloat(mValueTwo) + "");
                        addBool = false;
                        mValueOne = null;
                        mValueTwo = null;

                    }
                }
                if (subBool == true) {
                    try {
                        Float.parseFloat(mValueOne);
                        resultT.setText(Integer.parseInt(mValueOne) - Integer.parseInt(mValueTwo) + "");
                        subBool = false;
                        mValueOne = null;
                        mValueTwo = null;
                    } catch (NumberFormatException e) {
                        resultT.setText(Float.parseFloat(mValueOne) - Float.parseFloat(mValueTwo) + "");
                        subBool = false;
                        mValueOne = null;
                        mValueTwo = null;

                    }

                }
                if (mulBool == true) {
                    try {
                        Float.parseFloat(mValueOne);
                        resultT.setText(Integer.parseInt(mValueOne) * Integer.parseInt(mValueTwo) + "");
                        mulBool = false;
                        mValueOne = null;
                        mValueTwo = null;
                    } catch (NumberFormatException e) {
                        resultT.setText(Float.parseFloat(mValueOne) * Float.parseFloat(mValueTwo) + "");
                        mulBool = false;
                        mValueOne = null;
                        mValueTwo = null;

                    }

                }
                if (divBool) {
                    try {
                        Float.parseFloat(mValueOne);
                        resultT.setText(Integer.parseInt(mValueOne) / Integer.parseInt(mValueTwo) + "");
                        divBool = false;
                        mValueOne = null;
                        mValueTwo = null;
                    } catch (NumberFormatException e) {
                        resultT.setText(Float.parseFloat(mValueOne) / Float.parseFloat(mValueTwo) + "");
                        divBool = false;
                        mValueOne = null;
                        mValueTwo = null;

                    }

                }


            } else {
                resultT.setText("");
            }
            mValueOne = null;
            mValueTwo = null;
        }
    }
}