package com.hadimusthafa.check_equal;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Date;

public class DaysDiffActivity extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    TextView resultT;
    EditText date1E, date2E;
    Button date1B, date2B, checkB;


    int day, month, year, hour, minute;
    int myday, myMonth, myYear, myHour, myMinute;

    int day1, month1, year1, hour1, minute1;
    int myday1, myMonth1, myYear1, myHour1, myMinute1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_diff);

        init();
        myClickListener();

    }

    public void init() {

        date1E = findViewById(R.id.date1E);
        date1B = findViewById(R.id.date1B);
        date2E = findViewById(R.id.date2E);
        date2B = findViewById(R.id.date2B);
        checkB = findViewById(R.id.checkB);
        resultT = findViewById(R.id.resultT);

    }

    public void myClickListener() {

        date1B.setOnClickListener(this);
        date2B.setOnClickListener(this);
        checkB.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.date1B) {


            Calendar calendar = Calendar.getInstance();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
            day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(DaysDiffActivity.this,
                    DaysDiffActivity.this, year, month, day);
            datePickerDialog.show();


        } else if (v.getId() == R.id.date2B) {

            Calendar calendar = Calendar.getInstance();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
            day = calendar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datePickerDialog = new DatePickerDialog(DaysDiffActivity.this,
                    DaysDiffActivity.this, year, month, day);
            datePickerDialog.show();


        } else if (v.getId() == R.id.checkB) {

//            printDifference();
        }

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        myYear = year;
        myMonth = month;
        myday = day;
        Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR);
        minute = c.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(DaysDiffActivity.this,
                DaysDiffActivity.this, hour, minute, DateFormat.is24HourFormat(this));
        timePickerDialog.show();


//        Log.e("---------->","myYear---------> : "+myYear);


    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        myHour = hourOfDay;
        myMinute = minute;

    }


    public void printDifference(Date startDate, Date endDate) {

        try {
            //milliseconds
            long different = endDate.getTime() - startDate.getTime();
            Log.e("startDate", "startDate---------> : " + startDate);
            Log.e("endDate", "endDate---------> : " + endDate);
            Log.e("different", "different---------> : " + different);

            long secondsInMilli = 1000;
            long minutesInMilli = secondsInMilli * 60;
            long hoursInMilli = minutesInMilli * 60;
            long daysInMilli = hoursInMilli * 24;

            long elapsedDays = different / daysInMilli;
            different = different % daysInMilli;

            long elapsedHours = different / hoursInMilli - 12;
            different = different % hoursInMilli;

            long elapsedMinutes = different / minutesInMilli;
            different = different % minutesInMilli;

            long elapsedSeconds = different / secondsInMilli;

            Log.e("---------->", "elapsedDays---------> : " + elapsedDays);
            Log.e("---------->", "elapsedHours---------> : " + elapsedHours);
            Log.e("---------->", "elapsedMinutes---------> : " + elapsedMinutes);
            Log.e("---------->", "elapsedSeconds---------> : " + elapsedSeconds);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}




