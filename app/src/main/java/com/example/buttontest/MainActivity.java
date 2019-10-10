package com.example.buttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bn=(Button) findViewById(R.id.btn);
        final TextView show=(TextView) findViewById(R.id.viewer);
        show.setText("请单击bn按钮！");

        bn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show.setText("bn按钮被单击啦啦啦！");
            }
        });
    }
}


