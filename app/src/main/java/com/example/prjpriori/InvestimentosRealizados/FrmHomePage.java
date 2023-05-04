package com.example.prjpriori.InvestimentosRealizados;

import static com.example.prjpriori.FrmLogin.idCliente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.prjpriori.Acessa;
import com.example.prjpriori.FrmConfigPage;
import com.example.prjpriori.FrmPerfilPage;
import com.example.prjpriori.InvestimentosDisponiveis.FrmDisponiveisPage;
import com.example.prjpriori.R;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class FrmHomePage extends AppCompatActivity {

    Button btnDisponivel, btnPerfil, btnConfig, btnPerfil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_home_page);
        getSupportActionBar().hide();

        btnDisponivel = (Button) findViewById(R.id.btnDisponivel);
        btnConfig = (Button) findViewById(R.id.btnConfig);
        btnPerfil = (Button) findViewById(R.id.btnPerfil);
        btnPerfil2 = (Button) findViewById(R.id.btnPerfil2);

        entrar();

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

        btnConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FrmConfigPage.class);
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
    ArrayList<CarteiraInvestimentos> carteira = new ArrayList<CarteiraInvestimentos>();
    Acessa objA = new Acessa();
    public Connection consultar() {
        objA.entBanco(this);
        try {
            objA.RS = objA.stmt.executeQuery
                    ("select inv.nome,Carteira. * from tblInvestimentos as inv" +
                            " inner join tblCarteiraInvestimentos as Carteira " +
                            "on inv.id_investimento = Carteira.id_investimento " +
                            "where id_cliente_carteira = " + idCliente + " ");
        } catch (SQLException ex) {
            Toast.makeText(getApplicationContext(), "erro" + ex, Toast.LENGTH_SHORT).show();
        }
        return objA.con;
    }

    public void preencher() throws SQLException {

        do{
            CarteiraInvestimentos carteiraInvestimentos = new CarteiraInvestimentos();
            carteiraInvestimentos.nome = objA.RS.getString(1);
            carteiraInvestimentos.rentabilidade_fixa = objA.RS.getString(5);
            carteiraInvestimentos.data_efetuacao = objA.RS.getString(7);
            carteiraInvestimentos.valor_aplicado = objA.RS.getString(8);
            carteira.add(carteiraInvestimentos);
        } while (objA.RS.next());

        ListView lista = findViewById(R.id.investimentosRealizados);
        lista.setAdapter(new CarteiraInvestimentoAdapter(this, carteira));
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