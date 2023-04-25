package com.example.prjpriori.InvestimentosDisponiveis;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.prjpriori.FrmConfigPage;
import com.example.prjpriori.FrmHomePage;
import com.example.prjpriori.FrmPerfilPage;
import com.example.prjpriori.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class FrmDisponiveisPage extends AppCompatActivity {

    Button btnHome, btnPerfil, btnConfig;
    TextView txt;
    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_disponiveis_page);
        getSupportActionBar().hide();

        btnHome = (Button) findViewById(R.id.btnHome);
        btnConfig = (Button) findViewById(R.id.btnConfig);
        btnPerfil = (Button) findViewById(R.id.btnPerfil);
        txt = findViewById(R.id.textView3);

        retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:5135/api")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


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