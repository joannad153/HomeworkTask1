package com.example.homeworktask1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.content.DialogInterface.OnClickListener;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // identifying each city in the main activity
    public ConstraintLayout Paris;
    public ConstraintLayout London;
    public ConstraintLayout Sydney;
    public ConstraintLayout NewYork;
    public ConstraintLayout Amsterdam;
    public ConstraintLayout Dublin;

    // identifying the text fields within each city
    public TextView city1;
    public TextView time1;
    public TextView city2;
    public TextView time2;
    public TextView city3;
    public TextView time3;
    public TextView city4;
    public TextView time4;
    public TextView city5;
    public TextView time5;
    public TextView city6;
    public TextView time6;

    //image holders for each city
    public ImageView parisPic;
    public ImageView londonPic;
    public ImageView sydneyPic;
    public ImageView newYorkPic;
    public ImageView amsterdamPic;
    public ImageView dublinPic;

    public Button button12;
    public Button button24;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load12HourTimeZones();
        button12 = (Button) findViewById(R.id.Button12);
        button12.setOnClickListener(this);
        button24 = (Button) findViewById(R.id.Button24);
        button24.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        if (v == button12) {
            setContentView(R.layout.activity_main);
            load12HourTimeZones();
        } else if (v == button24) {
            setContentView(R.layout.activity_main);
            load24HourTimeZones();
        }
        return;
    }

    protected void load12HourTimeZones() {
        //modifying the Paris included layout
        Paris = findViewById(R.id.Paris);
        city1 = Paris.findViewById(R.id.city);
        city1.setText("Paris");
        parisPic = Paris.findViewById(R.id.cityPic);
        parisPic.setImageResource(R.drawable.paris);
        time1 = Paris.findViewById(R.id.time12);
        time1.setText(get12Time("Europe/Paris"));

        London = findViewById(R.id.London);
        city2 = London.findViewById(R.id.city);
        city2.setText("London");
        londonPic = London.findViewById (R.id.cityPic);
        londonPic.setImageResource(R.drawable.london);
        time2 = London.findViewById(R.id.time12);
        time2.setText(get12Time("Europe/London"));

        Sydney = findViewById(R.id.Sydney);
        city3 = Sydney.findViewById(R.id.city);
        city3.setText("Sydney");
        sydneyPic = Sydney.findViewById (R.id.cityPic);
        sydneyPic.setImageResource(R.drawable.sydney);
        time3 = Sydney.findViewById(R.id.time12);
        time3.setText(get12Time("Australia/Sydney"));


        NewYork = findViewById(R.id.NewYork);
        city4 = NewYork.findViewById(R.id.city);
        city4.setText("New York");
        newYorkPic = NewYork.findViewById (R.id.cityPic);
        newYorkPic.setImageResource(R.drawable.newyork);
        time4 = NewYork.findViewById(R.id.time12);
        time4.setText(get12Time("America/New_York"));


        Amsterdam = findViewById(R.id.Amsterdam);
        city5 = Amsterdam.findViewById(R.id.city);
        city5.setText("Amsterdam");
        amsterdamPic = Amsterdam.findViewById (R.id.cityPic);
        amsterdamPic.setImageResource (R.drawable.amsterdam);
        time5 = Amsterdam.findViewById(R.id.time12);
        time5.setText(get12Time("Europe/Amsterdam"));


        Dublin = findViewById(R.id.Dublin);
        city6 = Dublin.findViewById(R.id.city);
        city6.setText("Dublin");
        dublinPic = Dublin.findViewById (R.id.cityPic);
        dublinPic.setImageResource (R.drawable.dublin);
        time6 = Dublin.findViewById(R.id.time12);
        time6.setText(get12Time("Europe/Dublin"));
    }

    protected void load24HourTimeZones() {
        //modifying the Paris included layout
        Paris = findViewById(R.id.Paris);
        city1 = Paris.findViewById(R.id.city);
        city1.setText("Paris");
        parisPic = Paris.findViewById(R.id.cityPic);
        parisPic.setImageResource(R.drawable.paris);
        time1 = Paris.findViewById(R.id.time12);
        time1.setText(get24Time("Europe/Paris"));

        London = findViewById(R.id.London);
        city2 = London.findViewById(R.id.city);
        city2.setText("London");
        londonPic = London.findViewById (R.id.cityPic);
        londonPic.setImageResource(R.drawable.london);
        time2 = London.findViewById(R.id.time12);
        time2.setText(get24Time("Europe/London"));

        Sydney = findViewById(R.id.Sydney);
        city3 = Sydney.findViewById(R.id.city);
        city3.setText("Sydney");
        sydneyPic = Sydney.findViewById (R.id.cityPic);
        sydneyPic.setImageResource(R.drawable.sydney);
        time3 = Sydney.findViewById(R.id.time12);
        time3.setText(get24Time("Australia/Sydney"));


        NewYork = findViewById(R.id.NewYork);
        city4 = NewYork.findViewById(R.id.city);
        city4.setText("New York");
        newYorkPic = NewYork.findViewById (R.id.cityPic);
        newYorkPic.setImageResource(R.drawable.newyork);
        time4 = NewYork.findViewById(R.id.time12);
        time4.setText(get24Time("America/New_York"));


        Amsterdam = findViewById(R.id.Amsterdam);
        city5 = Amsterdam.findViewById(R.id.city);
        city5.setText("Amsterdam");
        amsterdamPic = Amsterdam.findViewById (R.id.cityPic);
        amsterdamPic.setImageResource (R.drawable.amsterdam);
        time5 = Amsterdam.findViewById(R.id.time12);
        time5.setText(get24Time("Europe/Amsterdam"));


        Dublin = findViewById(R.id.Dublin);
        city6 = Dublin.findViewById(R.id.city);
        city6.setText("Dublin");
        dublinPic = Dublin.findViewById (R.id.cityPic);
        dublinPic.setImageResource (R.drawable.dublin);
        time6 = Dublin.findViewById(R.id.time12);
        time6.setText(get24Time("Europe/Dublin"));
    }


    public static String get12Time(String timeZone){
        ZoneId zoneId = ZoneId.of(timeZone);
        LocalTime localTime=LocalTime.now(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm: a");
        String formattedTime = localTime.format(formatter);
        return formattedTime;
    }

    public static String get24Time(String timeZone){
        ZoneId zoneId = ZoneId.of(timeZone);
        LocalTime localTime=LocalTime.now(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmm");
        String formattedTime = localTime.format(formatter);
        return formattedTime;
    }


}
