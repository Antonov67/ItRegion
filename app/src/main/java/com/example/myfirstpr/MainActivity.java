package com.example.myfirstpr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    static int count = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  getSupportActionBar().hide();
        getSupportActionBar().setTitle("Кликер");

        button = findViewById(R.id.clickButton);
        textView = findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                button.setText(count+"");

                if (count > 10 && count < 50){
                    textView.setText("хорошее начало!");
                }
                if (count > 70 && count < 100){
                    textView.setText("так держать!!");
                }
                if (count == 10){
                    Toast.makeText(getApplicationContext(),"Вы набрали 10", Toast.LENGTH_LONG).show();
                }
            }
        });

        //обработчик нажатия на объект TextView

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}