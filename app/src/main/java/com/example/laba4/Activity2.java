package com.example.laba4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView tvName = findViewById(R.id.tvName);
        String name = getIntent().getStringExtra("name");
        tvName.setText("Your name is " + name);
    }
    public void back(View v){
        DatePicker datePicker = findViewById(R.id.datePicker);
        String etDay = String.valueOf(datePicker.getDayOfMonth());
        String etMonth = String.valueOf(datePicker.getMonth());
        String etYear = String.valueOf(datePicker.getYear());

        Intent intent = new Intent(Activity2.this, MainActivity.class);
        intent.putExtra("day", etDay);
        intent.putExtra("month", etMonth);
        intent.putExtra("year", etYear);


        startActivity(intent);

    }

}