package com.example.prjpriori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.prjpriori.InvestimentosDisponiveis.FrmDisponiveisPage;
import com.example.prjpriori.InvestimentosRealizados.FrmHomePage;

public class FrmConfigPage extends AppCompatActivity {

    Button btnHome, btnDisponivel, btnPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_config_page);
        getSupportActionBar().hide();

        btnDisponivel = (Button) findViewById(R.id.btnDisponivel);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnPerfil = (Button) findViewById(R.id.btnPerfil);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FrmHomePage.class);
                startActivity(intent);
            }
        });

        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FrmPerfilPage.class);
                startActivity(intent);
            }
        });

        btnDisponivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FrmDisponiveisPage.class);
                startActivity(intent);
            }
        });
    }
}