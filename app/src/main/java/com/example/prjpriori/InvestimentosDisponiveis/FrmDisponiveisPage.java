package com.example.prjpriori.InvestimentosDisponiveis;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.prjpriori.Acessa;
import com.example.prjpriori.DetalhesInvestimentos.FrmDetalhesInvestimento;
import com.example.prjpriori.FrmConfigPage;
import com.example.prjpriori.InvestimentosRealizados.FrmHomePage;
import com.example.prjpriori.FrmPerfilPage;
import com.example.prjpriori.R;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

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


        entrar();

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


    ArrayList<Investimentos> investimentos = new ArrayList<Investimentos>();
    Acessa objA = new Acessa();

    public Connection consultar() {
        objA.entBanco(this);
        try {
            objA.RS = objA.stmt.executeQuery
                    ("select * from tblInvestimentos");
        } catch (SQLException ex) {
            Toast.makeText(getApplicationContext(), "erro" + ex, Toast.LENGTH_SHORT).show();
        }
        return objA.con;
    }

    public void preencher() throws SQLException {

        while (objA.RS.next()) {
            Investimentos investimento = new Investimentos();
            investimento.nome = objA.RS.getString(3);
            investimento.rentabilidade_fixa = objA.RS.getString(5);
            investimento.valor_minimo = objA.RS.getString(9);
            investimento.vencimento = objA.RS.getString(8);
            investimentos.add(investimento);
        }
        ListView lista = findViewById(R.id.lista);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), FrmDetalhesInvestimento.class);
                startActivity(intent);
            }
        });
        lista.setAdapter(new InvestimentoAdapter(this, investimentos));
    }

    public void entrar() {
        objA.entBanco(this);
        consultar();

        try {
            if (objA.RS.next()) {
                preencher();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}