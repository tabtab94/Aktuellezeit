package com.zeit.aktuelle.zeit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Act1 extends AppCompatActivity implements View.OnClickListener {
    Button button;
    TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);
        textview2 = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Calendar kalender = Calendar.getInstance();
        SimpleDateFormat zeitformat = new SimpleDateFormat("HH:mm:ss");
        textview2.setText(zeitformat.format(kalender.getTime()));


    }
}
