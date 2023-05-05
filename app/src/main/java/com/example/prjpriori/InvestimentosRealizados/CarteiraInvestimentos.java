package com.example.prjpriori.InvestimentosRealizados;

import java.io.Serializable;

public class CarteiraInvestimentos implements Serializable {

    public String nome;
    public String id_efetuacao;
    public String id_cliente_carteira;
    public String id_investimento;
    public String rentabilidade_fixa;
    public String rentabilidade_variavel;
    public String data_efetuacao;
    public String valor_aplicado;
    public String data_encerramento;
    public String status;
    public String saldo;

    public String getId_investimento() {
        return id_investimento;
    }
}
