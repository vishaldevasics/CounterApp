package com.maverickallies.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button incrButton;
    Button decrButton;
    Button resetButton;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.CountTVId);
        decrButton = findViewById(R.id.DecrBtnId);
        incrButton = findViewById(R.id.IncrBtnId);
        resetButton = findViewById(R.id.ResetBtnId);



        incrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(""+IncrementCount());
            }
        });
        decrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0){
                    Toast.makeText(MainActivity.this, "Count already 0..!", Toast.LENGTH_SHORT).show();
                    return;
                }
                textView.setText(""+DecreaseCount());
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(""+ResetCount());
            }
        });

    }
    public int IncrementCount(){
        return ++count;
    }
    public int DecreaseCount(){
        return --count;
    }
    public int ResetCount(){
        return 0;
    }

}