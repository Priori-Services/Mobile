package com.example.prjpriori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.prjpriori.InvestimentosRealizados.FrmHomePage;

public class FrmCadastro extends AppCompatActivity {

    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_cadastro);

        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        getSupportActionBar().hide();

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrmCadastro.this, FrmLogin.class);
                startActivity(intent);
            }
        });
    }
}