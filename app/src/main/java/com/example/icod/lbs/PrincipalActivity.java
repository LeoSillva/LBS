package com.example.icod.lbs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_principal);

        //CHAMA A ACTIVITY COM INSTRUÇÕES
        Button chamarButton = (Button) findViewById(R.id.buttonInstrucoes);
        chamarButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InstrucoesActivity.class);
                startActivity(intent);
            }
        });
        //CHAMAR O ALFABETO PELO BUTTON
        Button chamarButtonAlfa = (Button) findViewById(R.id.buttonAlfabeto);
        chamarButtonAlfa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AlfabetoActivity.class);
                startActivity(intent);
            }
        });

        //CHAMAR O NUMERAIS PELO BUTTON
        Button chamarButtonNumerais = (Button) findViewById(R.id.buttonNumerais);
        chamarButtonNumerais.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NumeraisActivity.class);
                startActivity(intent);
            }
        });

        //CHAMAR O QUIZ
        Button chamarButtonQuiz = (Button) findViewById(R.id.buttonQuiz);
        chamarButtonQuiz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EscolherQuizActivity.class);
                startActivity(intent);
            }
        });
        //CHAMAR O DICIONARIO
        Button chamarButtonDic = (Button) findViewById(R.id.buttonDicionario);
        chamarButtonDic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DicionarioActivity.class);
                startActivity(intent);
            }
        });
    }
}


/*Context context = getApplicationContext();
        CharSequence text = "Q";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();*/

