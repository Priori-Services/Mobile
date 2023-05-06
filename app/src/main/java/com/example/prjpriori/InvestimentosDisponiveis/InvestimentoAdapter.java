package com.example.prjpriori.InvestimentosDisponiveis;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.prjpriori.R;

import java.util.ArrayList;

public class InvestimentoAdapter extends BaseAdapter {


    private Context contexto;

    private ArrayList<Investimentos> investimentos;

    public InvestimentoAdapter(Context contexto, ArrayList<Investimentos> investimentos) {
        this.contexto = contexto;
        this.investimentos = investimentos;
    }

    @Override
    public int getCount() {
        return investimentos.size();
    }

    @Override
    public Object getItem(int position) {
        return investimentos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Investimentos itens = investimentos.get(position);
        View LayoutModelo;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)
                    contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            LayoutModelo = inflater.inflate(R.layout.modelo_investimentos, null);
        }else{
            LayoutModelo = convertView;
        }

        TextView txtNome =LayoutModelo.findViewById(R.id.nomeInvestimento);
        txtNome.setText(itens.nome);

        TextView txtRentabilidae = LayoutModelo.findViewById(R.id.rentabildadeFixaInvestimento);
        txtRentabilidae.setText( itens.rentabilidade_fixa);

        TextView txtValorMinimo = LayoutModelo.findViewById(R.id.valorMinimoInvesimento);
        txtValorMinimo.setText(( itens.valor_minimo));

        TextView txtVencimento = LayoutModelo.findViewById(R.id.vencimentoInvestimento);
        txtVencimento.setText( itens.vencimento);

        LinearLayout cor = LayoutModelo.findViewById(R.id.cor);
        if(itens.id_riscoInvestimento == 1){
            cor.setBackgroundResource(R.drawable.lateral_green);
        } else if (itens.id_riscoInvestimento == 2) {
            cor.setBackgroundResource(R.drawable.lateral_yellow);
        }else{
            cor.setBackgroundResource(R.drawable.lateral_red);
        }

        return LayoutModelo;
    }
}
