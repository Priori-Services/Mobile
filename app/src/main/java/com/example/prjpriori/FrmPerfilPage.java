package com.example.prjpriori;

import static com.example.prjpriori.FrmLogin.idCliente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prjpriori.InvestimentosDisponiveis.FrmDisponiveisPage;
import com.example.prjpriori.InvestimentosRealizados.FrmHomePage;

import java.sql.Connection;
import java.sql.SQLException;

public class FrmPerfilPage extends AppCompatActivity {

    Button btnHome, btnDisponivel, btnConfig, btnLogout_perfil;
    TextView pontuacao, tipo, consultor, email, telefone, endereco, dataAdesao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_perfil_page);
        getSupportActionBar().hide();

        btnDisponivel = (Button) findViewById(R.id.btnDisponivel);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnConfig = (Button) findViewById(R.id.btnConfig);
        btnLogout_perfil = (Button) findViewById(R.id.btnLogout_perfil);

        pontuacao = findViewById(R.id.pontuacao_perfil);
        tipo = findViewById(R.id.tipo_perfil);
        consultor = findViewById(R.id.colsultor_perfil);
        email = findViewById(R.id.email_perfil);
        telefone = findViewById(R.id.endereco_perfil);
        endereco = findViewById(R.id.endereco_perfil);
        dataAdesao = findViewById(R.id.dataAdesao_perfil);

        entrar();

        btnLogout_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrmPerfilPage.this, FrmLogin.class);
                startActivity(intent);
                finish();
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FrmHomePage.class);
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
                    ( "select consultor.nome, Cliente.* from tblClientes as Cliente" +
                            " inner join tblConsultores as consultor on consultor.id_consultor = Cliente.id_consultor" +
                            " where id_cliente = " + idCliente + " ");
        }catch (SQLException ex){
            Toast.makeText(this, "erro"+ex, Toast.LENGTH_SHORT).show();
        }
        return objA.con;
    }

    public void preencher(){
        try{
           pontuacao.setText(objA.RS.getString("pontuacao"));
           consultor.setText(objA.RS.getString("nome"));
           email.setText(objA.RS.getString("email"));
           telefone.setText(objA.RS.getString("telefone"));
           endereco.setText(objA.RS.getString("endereco"));
           dataAdesao.setText(objA.RS.getString("data_adesao"));

            Integer tipoInvestidor = Integer.valueOf(objA.RS.getString("id_tipoinvestidor"));
            if(tipoInvestidor == 1){
                tipo.setText("conservador");
            } else if (tipoInvestidor == 2) {
                tipo.setText("moderado");
            }else{
                tipo.setText("arrojado");
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void entrar( ){
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