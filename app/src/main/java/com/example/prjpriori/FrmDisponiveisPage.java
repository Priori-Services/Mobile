package com.example.prjpriori;

import static com.example.prjpriori.FrmLogin.idCliente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.SQLException;

public class FrmDisponiveisPage extends AppCompatActivity {

    Button btnHome, btnPerfil, btnConfig;
    TextView rentabilidadeFixa, rentabildadeVariavel, dataEfetuacao, valorAplicado, dataEncerramento, status, saldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_disponiveis_page);
        getSupportActionBar().hide();

        btnHome = (Button) findViewById(R.id.btnHome);
        btnConfig = (Button) findViewById(R.id.btnConfig);
        btnPerfil = (Button) findViewById(R.id.btnPerfil);

        rentabildadeVariavel = findViewById(R.id.rentabilidade_variavel);
        rentabilidadeFixa = findViewById(R.id.rentabildade_fixa);
        dataEfetuacao = findViewById(R.id.data_adesao);
        dataEncerramento = findViewById(R.id.data_encerramento);
        valorAplicado = findViewById(R.id.valor_aplicado);
        status = findViewById(R.id.status);
        saldo = findViewById(R.id.saldo);

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
    Acessa objA = new Acessa();

    public Connection consultar(){
        objA.entBanco(this);
        try{
            objA.RS = objA.stmt.executeQuery
                    ("select * from tblCarteiraInvestimentos where id_cliente_carteira ='"+ idCliente +"' ");
        }catch (SQLException ex){
            Toast.makeText(getApplicationContext(),"erro"+ex,Toast.LENGTH_SHORT).show();
        }
        return objA.con;
    }

    public void preencher(){
        try{
           rentabilidadeFixa.setText(objA.RS.getString("rentabilidade_fixa"));
           rentabildadeVariavel.setText(objA.RS.getString("rentabilidade_variavel"));
            dataEfetuacao.setText(objA.RS.getString("data_efetuacao"));
           valorAplicado.setText(objA.RS.getString("valor_aplicado"));
           dataEncerramento.setText(objA.RS.getString("data_encerramento"));
           status.setText(objA.RS.getString("status"));
           saldo.setText(objA.RS.getString("saldo"));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void entrar(){
        objA.entBanco(this);
        consultar();

        try{
            if(objA.RS.next()){
                preencher();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}