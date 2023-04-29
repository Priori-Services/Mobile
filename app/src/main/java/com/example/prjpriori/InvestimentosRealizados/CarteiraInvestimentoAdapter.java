package com.example.prjpriori.InvestimentosRealizados;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.prjpriori.R;

import java.util.ArrayList;

public class CarteiraInvestimentoAdapter extends BaseAdapter {

    private Context contexto;

    private ArrayList<CarteiraInvestimentos> carteira;

    public CarteiraInvestimentoAdapter(Context contexto, ArrayList<CarteiraInvestimentos> carteira) {
        this.contexto = contexto;
        this.carteira = carteira;
    }

    @Override
    public int getCount() {
        return carteira.size() ;
    }

    @Override
    public Object getItem(int position) {
        return carteira.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CarteiraInvestimentos carteiraItens = carteira.get(position);
        View LayoutModelo;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)
                    contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            LayoutModelo = inflater.inflate(R.layout.modelo_investimentos_realizados,null);
        }else{
            LayoutModelo = convertView;
        }

        TextView txtNome =LayoutModelo.findViewById(R.id.nome);
        txtNome.setText(carteiraItens.nome);

        TextView txtRentabilidae = LayoutModelo.findViewById(R.id.rentabildadeFixa);
        txtRentabilidae.setText( carteiraItens.rentabilidade_fixa);

        TextView txtValorAplicado = LayoutModelo.findViewById(R.id.valorMinimo);
        txtValorAplicado.setText(( carteiraItens.valor_aplicado));

        TextView txtDataEfetuacao = LayoutModelo.findViewById(R.id.vencimento);
        txtDataEfetuacao.setText( carteiraItens.data_efetuacao);

        return LayoutModelo;
    }
}
