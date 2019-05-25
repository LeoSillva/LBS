package com.example.icod.lbs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EscolherQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher_quiz);

        //CHAMAR O QUIZ LETRAS PELO BUTTON
        Button buttonQuizLetras = (Button) findViewById(R.id.buttonQuizLetras);
        buttonQuizLetras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(intent);
            }
        });
    }
}
