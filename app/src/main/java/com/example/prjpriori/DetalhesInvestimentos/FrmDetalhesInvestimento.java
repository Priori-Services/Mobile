package com.example.prjpriori.DetalhesInvestimentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prjpriori.Acessa;
import com.example.prjpriori.R;

import java.sql.Connection;
import java.sql.SQLException;

public class FrmDetalhesInvestimento extends AppCompatActivity {

    TextView nome,rentabilidadeFixa,valorMinimo,vencimento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_investimentos);

        nome = findViewById(R.id.nome);
        rentabilidadeFixa = findViewById(R.id.rentabildadeFixa);
        valorMinimo = findViewById(R.id.valorMinimo);
        vencimento = findViewById(R.id.vencimento);


        String idSelected = getIntent().getStringExtra("id");
        entrar(idSelected);

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