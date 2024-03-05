package com.example.tp3mike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView textView;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView=(TextView)findViewById(R.id.counterr);
    }
    public void onClick (){
        counter ++;
        textView.setText(counter);
    }
}