package com.example.science_fair;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    EditText input;
    String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    //used to take input
    public void process(View view){
        input = (EditText) findViewById(R.id.text);
        String s = input.getText().toString();
        parser(s);

    }

    //parsing the input for the apk
    public void parser(String s){

    }
}