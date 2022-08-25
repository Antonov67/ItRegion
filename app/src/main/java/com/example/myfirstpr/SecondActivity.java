package com.example.myfirstpr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText number1, number2;
    TextView resultField;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        resultField = findViewById(R.id.resultTextField);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double num1, num2;
                    num1 = Double.parseDouble(number1.getText().toString());
                    num2 = Double.parseDouble(number2.getText().toString());
                    resultField.setText(num1 + num2 + "");

                    //передадим результат в третье Активити
                    Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                    intent.putExtra("data", num1 + num2 + "   ");
                    startActivity(intent);


                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),
                        "ошибка " + e.getMessage(),
                            Toast.LENGTH_LONG)
                            .show();
                }
            }
        });

    }
}