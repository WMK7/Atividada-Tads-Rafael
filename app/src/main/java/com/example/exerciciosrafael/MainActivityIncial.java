package com.example.exerciciosrafael;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityIncial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicial);

        Button btEx1 = findViewById(R.id.btEx1);
        Button btEx2 = findViewById(R.id.btEx2);
        Button btFim = findViewById(R.id.btDesligar);

        btEx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityIncial.this, ActivityPoupanca.class);
                startActivity(intent);
            }
        });

        btEx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityIncial.this, ActivityCalculoDeBar.class);
                startActivity(intent);
            }
        });

        btFim.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });

    }//onCreate
}//class