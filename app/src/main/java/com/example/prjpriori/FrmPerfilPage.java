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

    Button btnHome, btnDisponivel, btnLogout_perfil;
    TextView pontuacao, tipo, consultor, email, DataNascimento_perfil, endereco, dataAdesao, nomePerfil, txtSaldo;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_perfil_page);
        getSupportActionBar().hide();

        btnDisponivel = (Button) findViewById(R.id.btnDisponivel);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnLogout_perfil = (Button) findViewById(R.id.btnLogout_perfil);
        pontuacao = findViewById(R.id.pontuacao_perfil);
        tipo = findViewById(R.id.tipo_perfil);
        txtSaldo = findViewById(R.id.txtSaldo);
        consultor = findViewById(R.id.colsultor_perfil);
        email = findViewById(R.id.email_perfil);
        endereco = findViewById(R.id.endereco_perfil);
        DataNascimento_perfil = findViewById(R.id.DataNascimento_perfil);
        dataAdesao = findViewById(R.id.dataAdesao_perfil);
        nomePerfil = findViewById(R.id.nome_perfil);

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


    }

    Acessa objA = new Acessa();
    Acessa objB = new Acessa();

    public Connection consultar() {
        objA.entBanco(this);
        try {
            objA.RS = objA.stmt.executeQuery
                    ("select carteira.saldo, Cliente.* from tblClientes as Cliente inner join \n" +
                            "tblCarteiraInvestimentos as carteira on carteira.id_cliente_carteira = Cliente.id_cliente where data_efetuacao\n" +
                            "   in  (SELECT MAX (data_efetuacao) FROM tblCarteiraInvestimentos GROUP BY id_cliente_carteira)\n" +
                            "                             AND id_cliente_carteira = " + idCliente + "  ");
        } catch (SQLException ex) {
            Toast.makeText(this, "erro" + ex, Toast.LENGTH_SHORT).show();
        }
        return objA.con;
    }

    public Connection nome() {
        objB.entBanco(this);
        try {
            objB.RS = objB.stmt.executeQuery
                    ("select * from tblConsultores WHERE id_consultor = " + idCliente + "  ");
        } catch (SQLException ex) {
            Toast.makeText(this, "erro" + ex, Toast.LENGTH_SHORT).show();
        }
        return objB.con;
    }

    public void preencher() {
        try {
            nomePerfil.setText(objA.RS.getString("nome"));
            dataAdesao.setText(objA.RS.getString("data_adesao"));
            pontuacao.setText(objA.RS.getString("pontuacao"));
            //para o txtSaldo, o indíce estava 1 para o Marcos Pontes, porém, estou tentando colocar apenas id_cliente_carteira para testar
            txtSaldo.setText(objA.RS.getString("saldo"));
            email.setText(objA.RS.getString("email"));
            DataNascimento_perfil.setText(objA.RS.getString("dataNascimento"));
            endereco.setText(objA.RS.getString("endereco"));
            consultor.setText(objB.RS.getString("nome"));


            Integer tipoInvestidor = Integer.valueOf(objA.RS.getString("id_tipoinvestidor"));
            if (tipoInvestidor == 1) {
                tipo.setText("Conservador");
            } else if (tipoInvestidor == 2) {
                tipo.setText("Moderado");
            } else {
                tipo.setText("Audacioso");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void entrar() {
        objA.entBanco(this);
        objB.entBanco(this);
        consultar();
        nome();
        preencher();
    }
}