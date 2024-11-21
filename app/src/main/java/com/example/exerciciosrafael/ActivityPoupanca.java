package com.example.exerciciosrafael;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityPoupanca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poupanca);


        ImageView Voltar = findViewById(R.id.vtInt);
        EditText ValorInicial = findViewById(R.id.valorInicial);
        EditText AplicacaoMensal = findViewById(R.id.valorMensal);
        EditText TempoAplicacao = findViewById(R.id.tempoAplicacao);
        EditText TaxaJuros = findViewById(R.id.taxaJuro);
        TextView TotalAplicacao = findViewById(R.id.txtTotal);
        Button calc = findViewById(R.id.btCalcular);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valorInicial = Double.parseDouble(ValorInicial.getText().toString());
                double aplicacaoMensal = Double.parseDouble(AplicacaoMensal.getText().toString());
                double tempoAplicacao = Double.parseDouble(TempoAplicacao.getText().toString());
                double taxaJuros = Double.parseDouble(TaxaJuros.getText().toString())/100;

                double valorFinal = valorInicial;
                for(int i = 0; i < tempoAplicacao; i++){
                    valorFinal = (valorFinal + aplicacaoMensal) * (1 + taxaJuros);
                }
                TotalAplicacao.setText(String.format("R$ %.2f", valorFinal));
            }
        });


        Voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPoupanca.this, MainActivityIncial.class);
                startActivity(intent);
            }
        });
    }
}