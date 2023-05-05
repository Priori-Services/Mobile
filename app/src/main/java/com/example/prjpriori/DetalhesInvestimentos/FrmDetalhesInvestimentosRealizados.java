package com.example.prjpriori.DetalhesInvestimentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.prjpriori.R;


public class FrmDetalhesInvestimentosRealizados extends AppCompatActivity {

    TextView nome,rentabilidadeFixa,valorMinimo,vencimento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_detalhes_investimentos_realizados);
    }
}