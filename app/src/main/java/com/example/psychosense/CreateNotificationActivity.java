package com.example.psychosense;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class CreateNotificationActivity extends AppCompatActivity implements View.OnClickListener{

    TextView timeTV;
    Button createBtn, cancelBtn;
    Intent intent;

    Boolean hasSelecteTime;
    int hour = 0, minute = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_notification);

        createBtn = findViewById(R.id.createBtn);
        createBtn.setOnClickListener(this);

        cancelBtn = findViewById(R.id.cancelBtn);
        cancelBtn.setOnClickListener(this);

        timeTV = findViewById(R.id.timeTV);
    }

    @Override
    public void onClick(View v) {

    }

    /*public void popTimeMaker() {
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int selectedHour, int selectedMinute) {
                hasSelecteTime = true;
                hour = selectedHour;
                minute = selectedMinute;

                if(minute < 10) {
                    timeTV.setText("an alarm has been set for " + hour + ":0" + minute);
                }
                else {
                    timeTV.setText("an alarm has been set for " + hour + ":" + minute);
                }

                createAlarm(CreateNotificationActivity.this, "new");
            }
        };
    }*/

        /*public void createAlarm(Context context, String str) {
        if (str.equals("new")) {
            AlarmManager newAlarm;
            Calendar c = Calendar.getInstance();
            c.set(Calendar.HOUR_OF_DAY, hour);
            c.set(Calendar.MINUTE, minute);
            c.set(Calendar.SECOND, 0);

            newAlarm = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
            Intent intent1  = new Intent(context, AlertReciver.class);

            PandingIntent pandingIntent = PandingIntent.getBroadcast
        }
        }*/
    }
