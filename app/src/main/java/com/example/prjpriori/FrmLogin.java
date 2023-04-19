package com.example.prjpriori;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FrmLogin extends AppCompatActivity {

    EditText lblEmail, lblSenha;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_login);

        btnLogin = findViewById(R.id.btnLogin);
        lblSenha = findViewById(R.id.lblSenha);
        lblEmail = findViewById(R.id.lblEmail);

        assert getSupportActionBar() != null;
        getSupportActionBar().hide();
    }
    Acessa obj = new Acessa();
    public void acessabanco(View v){
        obj.entBanco(this);
        String email = lblEmail.getText().toString();
        String senha = lblSenha.getText().toString();
        try{
            obj.RS = obj.stmt.executeQuery
                    ("select * from tblClientes where email='"+email+"'and nome='"+senha+"'");
            if(obj.RS.next()){
                Toast.makeText(getApplicationContext(),"Aprovado",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FrmLogin.this,FrmHomePage.class);
                startActivity(intent);
                finish();
            }else{
                Toast.makeText(getApplicationContext(),"Entrada não aprovada",Toast.LENGTH_SHORT).show();
            }
        }catch (SQLException ex){
            Toast.makeText(getApplicationContext(),"erro no acesso",Toast.LENGTH_SHORT).show();
        }
    }
}