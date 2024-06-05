package com.example.laba4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View v){
        EditText etName = findViewById(R.id.etName);
        String name = etName.getText().toString();
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        intent.putExtra("name", name);
        startActivity(intent);

    }
    public void date(View v){
        TextView twDay = findViewById(R.id.twDay);
        String day = getIntent().getStringExtra("day");
        String month = getIntent().getStringExtra("month");
        String year = getIntent().getStringExtra("year");
        twDay.setText(day + "." + month + "." + year);
    }


}