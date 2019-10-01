package com.example.homeworktask1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.util.TimeZone;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //modifying the Paris included layout
        Paris = findViewById(R.id.Paris);
        city1 = Paris.findViewById(R.id.city);
        city1.setText("Paris");
        parisPic = Paris.findViewById(R.id.cityPic);
        parisPic.setImageResource(R.drawable.paris);

        London = findViewById(R.id.London);
        city2 = London.findViewById(R.id.city);
        city2.setText("London");
        londonPic = London.findViewById (R.id.cityPic);
        londonPic.setImageResource(R.drawable.london);

        Sydney = findViewById(R.id.Sydney);
        city3 = Sydney.findViewById(R.id.city);
        city3.setText("Sydney");
        sydneyPic = Sydney.findViewById (R.id.cityPic);
        sydneyPic.setImageResource(R.drawable.sydney);


        NewYork = findViewById(R.id.NewYork);
        city4 = NewYork.findViewById(R.id.city);
        city4.setText("New York");
        newYorkPic = NewYork.findViewById (R.id.cityPic);
        newYorkPic.setImageResource(R.drawable.newyork);


        Amsterdam = findViewById(R.id.Amsterdam);
        city5 = Amsterdam.findViewById(R.id.city);
        city5.setText("Amsterdam");
        amsterdamPic = Amsterdam.findViewById (R.id.cityPic);
        amsterdamPic.setImageResource (R.drawable.amsterdam);


        Dublin = findViewById(R.id.Dublin);
        city6 = Dublin.findViewById(R.id.city);
        city6.setText("Dublin");
        dublinPic = Dublin.findViewById (R.id.cityPic);
        dublinPic.setImageResource (R.drawable.dublin);


    }

}
