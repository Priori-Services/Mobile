package com.example.prjpriori.InvestimentosRealizados;

import java.io.Serializable;

public class CarteiraInvestimentos implements Serializable {

    public String nome;
    public int id_riscoInvestimento;
    public String id_investimento;
    public String rentabilidade_fixa;

    public String data_efetuacao;
    public String valor_aplicado;


    public String getId_investimento() {
        return id_investimento;
    }
}
