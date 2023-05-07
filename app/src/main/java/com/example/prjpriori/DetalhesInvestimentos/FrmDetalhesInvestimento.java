package com.example.prjpriori.DetalhesInvestimentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prjpriori.Acessa;
import com.example.prjpriori.FrmConfigPage;
import com.example.prjpriori.FrmPerfilPage;
import com.example.prjpriori.InvestimentosRealizados.FrmHomePage;
import com.example.prjpriori.R;

import java.sql.Connection;
import java.sql.SQLException;

public class FrmDetalhesInvestimento extends AppCompatActivity {

    TextView nome,rentabilidadeFixa,valorMinimo,vencimento;

    Button btnHome, btnPerfil, btnPerfil2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_investimentos);
        getSupportActionBar().hide();

        nome = findViewById(R.id.nomeInvestimento);
        rentabilidadeFixa = findViewById(R.id.rentabildadeFixaInvestimento);
        valorMinimo = findViewById(R.id.valorMinimoInvesimento);
        vencimento = findViewById(R.id.vencimentoInvestimento);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnPerfil2 = (Button) findViewById(R.id.btnPerfil2);
        btnPerfil = (Button) findViewById(R.id.btnPerfil);


        String idSelected = getIntent().getStringExtra("id");
        entrar(idSelected);

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
        btnPerfil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FrmPerfilPage.class);
                startActivity(intent);
            }
        });



    }

    Acessa objA = new Acessa();

    public Connection consultar(String id){
        objA.entBanco(this);
        try{
            objA.RS = objA.stmt.executeQuery
                    ("select * from tblInvestimentos where id_investimento = " + id +" ");
        }catch (SQLException ex){
            Toast.makeText(getApplicationContext(),"erro"+ex,Toast.LENGTH_SHORT).show();
        }
        return objA.con;
    }

    public void preencher(){
        try{
            nome.setText(objA.RS.getString("nome"));
            rentabilidadeFixa.setText(objA.RS.getString("rentabilidade_fixa"));
            valorMinimo.setText(objA.RS.getString("valor_minimo"));
            vencimento.setText(objA.RS.getString("vencimento"));
            int id_riscoInvestmento = objA.RS.getInt("id_riscoInvestimento");


            LinearLayout cor = findViewById(R.id.cor);
            if(id_riscoInvestmento == 1){
                cor.setBackgroundResource(R.drawable.lateral_green);
            }else if(id_riscoInvestmento == 2){
                cor.setBackgroundResource(R.drawable.lateral_yellow);
            }else{
                cor.setBackgroundResource(R.drawable.lateral_red);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void entrar(String id){
        objA.entBanco(this);
        consultar(id);

        try{
            if(objA.RS.next()){
                preencher();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

}