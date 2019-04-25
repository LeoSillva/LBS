package com.example.thiago.librart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstrucoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucoes);

        Button chamarContinuar = (Button) findViewById(R.id.bntContinuar);
        chamarContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InstrucoesActivity.this,AprendaActivity.class);
                startActivity(intent);
            }
        });
    }
}
