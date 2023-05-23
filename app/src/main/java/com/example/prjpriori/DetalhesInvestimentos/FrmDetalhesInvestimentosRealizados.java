package com.example.prjpriori.DetalhesInvestimentos;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prjpriori.Acessa;
import com.example.prjpriori.FrmPerfilPage;
import com.example.prjpriori.InvestimentosDisponiveis.FrmDisponiveisPage;
import com.example.prjpriori.R;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;


public class FrmDetalhesInvestimentosRealizados extends AppCompatActivity {

    TextView nome, rentabilidadeFixa, valorMinimo, vencimento, tipoInvestimento,rentabilidadeVariavel,dataEfetuacao,valorAplicado,status,saldo;

    Button btnDisponivel, btnPerfil, btnPerfil2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_detalhes_investimentos_realizados);
        getSupportActionBar().hide();

        nome = findViewById(R.id.nomeInvestimento);
        rentabilidadeFixa = findViewById(R.id.rentabildadeFixaInvestimento);
        rentabilidadeFixa = findViewById(R.id.textView8);
        valorMinimo = findViewById(R.id.valorMinimoInvesimento);
        vencimento = findViewById(R.id.vencimentoInvestimento);
        tipoInvestimento = findViewById(R.id.textView5);
        rentabilidadeVariavel = findViewById(R.id.textView14);
        dataEfetuacao = findViewById(R.id.textView15);
        valorAplicado = findViewById(R.id.textView16);
        status = findViewById(R.id.textView17);
        btnDisponivel = (Button) findViewById(R.id.btnDisponivel);
        btnPerfil = (Button) findViewById(R.id.btnPerfil);
        btnPerfil2 = (Button) findViewById(R.id.btnPerfil2);


        String idSelected = getIntent().getStringExtra("id");
        entrar(idSelected);


        btnDisponivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FrmDisponiveisPage.class);
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


        btnPerfil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FrmPerfilPage.class);
                startActivity(intent);
            }
        });
    }

    Acessa objA = new Acessa();

    public Connection consultar(String id) {
        objA.entBanco(this);
        try {
            objA.RS = objA.stmt.executeQuery
                    ("select inv.nome,id_riscoInvestimento,valor_minimo,vencimento,Carteira. * from tblInvestimentos as inv" +
                            " inner join tblCarteiraInvestimentos as Carteira " +
                            "on inv.id_investimento = Carteira.id_investimento " +
                            "where Carteira.id_investimento = " + id + " ");
        } catch (SQLException ex) {
            Toast.makeText(getApplicationContext(), "erro" + ex, Toast.LENGTH_SHORT).show();
        }
        return objA.con;
    }

    public void preencher() {
        try {
            nome.setText(objA.RS.getString("nome"));
            rentabilidadeFixa.setText(objA.RS.getString("rentabilidade_fixa"));
            rentabilidadeVariavel.setText(objA.RS.getString("rentabilidade_variavel"));
            valorAplicado.setText(objA.RS.getString("valor_aplicado"));
            status.setText(objA.RS.getString("status"));
            //saldo.setText(objA.RS.getString("saldo"));

            Date DataVencimento = objA.RS.getDate("vencimento");
            Date efetuacao = objA.RS.getDate("data_efetuacao");
            SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
            String formatEfetuacao = DateFor.format(efetuacao);
            String formatVencimento = DateFor.format(DataVencimento);
            valorMinimo.setText(formatVencimento);
            vencimento.setText(formatEfetuacao);

            int id_riscoInvestmento = objA.RS.getInt("id_riscoInvestimento");

            LinearLayout cor = findViewById(R.id.cor);
            if(id_riscoInvestmento == 1){
                cor.setBackgroundResource(R.drawable.lateral_green);
            }else if(id_riscoInvestmento == 2){
                cor.setBackgroundResource(R.drawable.lateral_yellow);
            }else{
                cor.setBackgroundResource(R.drawable.lateral_red);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void entrar(String id) {
        objA.entBanco(this);
        consultar(id);

        try {
            if (objA.RS.next()) {
                preencher();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
/*
    public void web(View view){
        Uri uri = Uri.parse("http://google.com/");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    */
}
