package com.example.prjpriori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmDisponiveisPage extends AppCompatActivity {

    Button btnHome, btnPerfil, btnConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_disponiveis_page);
        getSupportActionBar().hide();

        btnHome = (Button) findViewById(R.id.btnHome);
        btnConfig = (Button) findViewById(R.id.btnConfig);
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

        btnConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FrmConfigPage.class);
                startActivity(intent);
            }
        });

    }
}