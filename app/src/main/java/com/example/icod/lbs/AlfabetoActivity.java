package com.example.icod.lbs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AlfabetoActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprenda);

        this.mViewHolder.imgResultado = findViewById(R.id.imgResultado);
        this.mViewHolder.btnQ = findViewById(R.id.btnQ);
        this.mViewHolder.btnW = findViewById(R.id.btnW);
        this.mViewHolder.btnA = findViewById(R.id.btnA);
        this.mViewHolder.btnB = findViewById(R.id.btnB);
        this.mViewHolder.btnC = findViewById(R.id.btnC);
        this.mViewHolder.btnD = findViewById(R.id.btnD);
        this.mViewHolder.btnE = findViewById(R.id.btnE);
        this.mViewHolder.btnF = findViewById(R.id.btnF);
        this.mViewHolder.btnG = findViewById(R.id.btnG);
        this.mViewHolder.btnH = findViewById(R.id.btnH);
        this.mViewHolder.btnI = findViewById(R.id.btnI);
        this.mViewHolder.btnJ = findViewById(R.id.btnJ);
        this.mViewHolder.btnK = findViewById(R.id.btnK);
        this.mViewHolder.btnL = findViewById(R.id.btnL);
        this.mViewHolder.btnM = findViewById(R.id.btnM);
        this.mViewHolder.btnN = findViewById(R.id.btnN);
        this.mViewHolder.btnO = findViewById(R.id.btnO);
        this.mViewHolder.btnP = findViewById(R.id.btnP);
        this.mViewHolder.btnR = findViewById(R.id.btnR);
        this.mViewHolder.btnS = findViewById(R.id.btnS);
        this.mViewHolder.btnT = findViewById(R.id.btnT);
        this.mViewHolder.btnU = findViewById(R.id.btnU);
        this.mViewHolder.btnV = findViewById(R.id.btnV);
        this.mViewHolder.btnX = findViewById(R.id.btnX);
        this.mViewHolder.btnY = findViewById(R.id.btnY);
        this.mViewHolder.btnZ = findViewById(R.id.btnZ);






        this.mViewHolder.btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.q);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });

        this.mViewHolder.btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.w);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.a);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.b);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.c);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.d);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.e);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.f);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.g);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.h);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.i);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.j);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.k);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.l);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.m);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.n);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.o);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.p);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });

        this.mViewHolder.btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.r);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.s);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.t);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.u);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.v);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.x);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.y);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });
        this.mViewHolder.btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewHolder.imgResultado.setImageResource(R.drawable.z);
                mViewHolder.imgResultado.setVisibility(View.VISIBLE);
            }
        });


    }

    private static class ViewHolder{
        ImageView imgResultado;
        Button btnQ;
        Button btnW;
        Button btnA;
        Button btnB;
        Button btnC;
        Button btnD;
        Button btnE;
        Button btnF;
        Button btnG;
        Button btnH;
        Button btnI;
        Button btnJ;
        Button btnK;
        Button btnL;
        Button btnM;
        Button btnN;
        Button btnO;
        Button btnP;
        Button btnR;
        Button btnS;
        Button btnT;
        Button btnU;
        Button btnV;
        Button btnX;
        Button btnY;
        Button btnZ;
    }
}














