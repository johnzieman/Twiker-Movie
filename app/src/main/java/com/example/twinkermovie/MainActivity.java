package com.example.twinkermovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerSeasons;
    private RadioButton cityButton;
    private RadioButton natureButton;
    private Spinner cities;
    private Spinner nature;
    private CheckBox airport;
    private CheckBox taxi;
    private CheckBox car;
    private Spinner month;
    private Spinner day;

    private StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        spinnerSeasons = findViewById(R.id.spinnerSeasons);
        cityButton = findViewById(R.id.cityButton);
        natureButton = findViewById(R.id.natureButton);
        cities = findViewById(R.id.spinnerCities);
        nature = findViewById(R.id.spinnerNature);
        airport = findViewById(R.id.checkBoxAirport);
        taxi = findViewById(R.id.checkBoxTaxi);
        car = findViewById(R.id.checkBoxCar);
        month = findViewById(R.id.spinnerMonth);
        day  = findViewById(R.id.spinnerDay);
    }

    public void changeLocation (View view) {
        RadioButton button  = (RadioButton) view;
        int id = button.getId();
        if(id == R.id.cityButton){
            cities.setVisibility(View.VISIBLE);
            nature.setVisibility(View.INVISIBLE);
            stringBuilder.append(getString(R.string.cities)).append(" ");
        }
        else {
            cities.setVisibility(View.INVISIBLE);
            nature.setVisibility(View.VISIBLE);
            stringBuilder.append(getString(R.string.nature)).append(" ");
        }
    }

    public void openAllResultList(View view){
        String list ="\nSeasons: "+ spinnerSeasons.getSelectedItem().toString()
                + "\nType of location: ";
        if(airport.isChecked()){

        }
        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra("list", list);
        startActivity(intent);
    }
}
