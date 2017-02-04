package com.wordpress.myulaflaga.inclass_activity_01_martinez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.R.attr.text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgress = (ProgressBar) findViewById(R.id.progress_bar);
        mProgress.setProgress(75);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        requestWindowFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.indicators);
        setProgressBarIndeterminateVisibility(true);
        setProgressBarVisibility(true);
        setProgress(5000);
    }

    public void onDateChanged(){
        final DatePicker date = (DatePicker)findViewById(R.id.DatePicker01);
        date.init(2013, 4, 8);
        new DatePicker.OnDateChangedListener(){
            public void onDateChanged(DatePicker view, int year, int month, int dayOfMonth) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(year, monthOfYear, dayOfMonth, time.getCurrentHour(),
                        time.getCurrentMinute());
                text.setText(calendar.getTime().toString());
            }
        };

    } time.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
        public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calender.DAY_OF_MONTH),
                    hourOfDay, minute);
            text.setText(calendar.getTime().toString);
        }
    }


}
