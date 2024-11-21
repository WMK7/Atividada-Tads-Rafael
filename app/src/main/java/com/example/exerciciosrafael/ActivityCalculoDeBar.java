package com.example.exerciciosrafael;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityCalculoDeBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_de_bar);

        Button btCalc = findViewById(R.id.btCalcCF);
        EditText Consumo = findViewById(R.id.etconsumo);
        EditText Cuver = findViewById(R.id.etCuver);
        EditText NumPessoa = findViewById(R.id.etNumeroPessoa);
        TextView Taxa = findViewById(R.id.txtValorPorPessoa);
        TextView ContaTotal = findViewById(R.id.txtContaTotal);
        TextView TaxaServico = findViewById(R.id.txtTaxaServico);
        ImageView Voltar = findViewById(R.id.voltar);

        btCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    double consumo = Double.parseDouble(Consumo.getText().toString());
                    double cuver = Double.parseDouble(Cuver.getText().toString());
                    double numPessoa = Double.parseDouble(NumPessoa.getText().toString());
                    //calcular a taxa do garçon
                    double taxa = consumo * 0.10;
                    //calular o total + taxa  cuver
                    double contaTotal = consumo + taxa + (cuver * numPessoa);
                     double valorPP = contaTotal / numPessoa;

                TaxaServico.setText(String.valueOf(taxa));
                ContaTotal.setText(String.valueOf(contaTotal));
                Taxa.setText(String.valueOf(valorPP));
            }
        });

        Voltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityCalculoDeBar.this, MainActivityIncial.class);
                startActivity(intent);
            }
        });

    }//onCreate
}//class