package com.example.prjpriori.InvestimentosRealizados;

import static com.example.prjpriori.FrmLogin.idCliente;

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
import com.example.prjpriori.DetalhesInvestimentos.FrmDetalhesInvestimentosRealizados;
import com.example.prjpriori.FrmConfigPage;
import com.example.prjpriori.FrmPerfilPage;
import com.example.prjpriori.InvestimentosDisponiveis.FrmDisponiveisPage;
import com.example.prjpriori.R;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class FrmHomePage extends AppCompatActivity {

    Button btnDisponivel, btnPerfil, btnPerfil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_home_page);
        getSupportActionBar().hide();

        btnDisponivel = (Button) findViewById(R.id.btnDisponivel);
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
                    ("select inv.nome,id_riscoInvestimento,Carteira. * from tblInvestimentos as inv" +
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
            carteiraInvestimentos.id_riscoInvestimento = objA.RS.getInt(2);
            carteiraInvestimentos.id_investimento = objA.RS.getString(5);
            carteiraInvestimentos.rentabilidade_fixa = objA.RS.getString(7);
            carteiraInvestimentos.data_efetuacao = objA.RS.getString(9);
            carteiraInvestimentos.valor_aplicado = objA.RS.getString(10);
            carteira.add(carteiraInvestimentos);
        } while (objA.RS.next());

        ListView lista = findViewById(R.id.investimentosRealizados);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), FrmDetalhesInvestimentosRealizados.class);
                intent.putExtra("id",carteira.get(position).getId_investimento());
                startActivity(intent);
            }
        });
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