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

    public void FazerLogin(View v) {
        @Nullable
        ResultSet RS = null;
        try (
                Connection con = ConnectionHandler.CreateConnection(getApplicationContext());
                PreparedStatement stmt = con != null ? con.prepareStatement("SELECT * FROM tblClientes WHERE email=? and senha=?") : null
        ) {
            assert stmt != null;
            stmt.setString(0, lblEmail.getText().toString());
            stmt.setString(1, lblSenha.getText().toString());
            RS = stmt.executeQuery();
        } catch (SQLException ex) {
            Toast.makeText(getApplicationContext(), "Fudeu bonito, não conectou com o BD: " + ex, Toast.LENGTH_LONG).show();
        }

        try {
            assert RS != null;
            if (!RS.next()) {
                Toast.makeText(getApplicationContext(), "Acesso negado.", Toast.LENGTH_SHORT).show();
                return;
            }

            startActivity(new Intent(getApplicationContext(), FrmHomePage.class));
            finish();
        } catch (SQLException ignored) {

        }
    }
}