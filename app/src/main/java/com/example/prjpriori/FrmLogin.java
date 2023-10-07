package com.example.prjpriori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.text.InputType;
import android.widget.ImageView;



import com.example.prjpriori.InvestimentosRealizados.FrmHomePage;

import java.sql.SQLException;

public class FrmLogin extends AppCompatActivity {

    EditText lblEmail, lblSenha;
    Button btnLogin;
    ProgressBar barraProgresso;

    TextView txtSemCadastro;

    ImageView eyeIcon;

    public static String idCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_login);

        btnLogin = findViewById(R.id.btnLogin);
        eyeIcon = findViewById(R.id.eyeIcon);
        lblSenha = findViewById(R.id.lblSenha);
        lblEmail = findViewById(R.id.lblEmail);
        barraProgresso = findViewById(R.id.barraProgresso);
        txtSemCadastro = findViewById(R.id.txtSemCadastro);

        assert getSupportActionBar() != null;
        getSupportActionBar().hide();

        eyeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int inputType = lblSenha.getInputType();
                if (inputType == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
                    lblSenha.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    eyeIcon.setImageResource(R.drawable.ic_eye); // Define o ícone do olho normal
                } else {
                    lblSenha.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    eyeIcon.setImageResource(R.drawable.ic_eye_crossed); // Define o ícone do olho riscado
                }
                lblSenha.setSelection(lblSenha.getText().length());
            }
        });

        txtSemCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrmLogin.this, FrmCadastro.class);
                startActivity(intent);
            }
        });
    }

    Acessa obj = new Acessa();

    public void acessabanco(View v) {
        obj.entBanco(this);
        String email = lblEmail.getText().toString();
        String senha = lblSenha.getText().toString();
        barraProgresso.setVisibility(View.VISIBLE);
        try {
            obj.RS = obj.stmt.executeQuery
                    ("select * from tblClientes where email='" + email + "'and nome='" + senha + "'");
            if (obj.RS.next()) {
                idCliente = obj.RS.getString("id_cliente");
                Toast.makeText(getApplicationContext(), "Aprovado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FrmLogin.this, FrmHomePage.class);
                startActivity(intent);
                finish();

            } else {
                Toast.makeText(getApplicationContext(), "Entrada não aprovada", Toast.LENGTH_SHORT).show();
            }
        } catch (SQLException ex) {
            Toast.makeText(getApplicationContext(), "erro no acesso", Toast.LENGTH_SHORT).show();
        }

    }
}