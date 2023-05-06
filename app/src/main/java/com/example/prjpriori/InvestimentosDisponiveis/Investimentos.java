package com.example.prjpriori.InvestimentosDisponiveis;

import net.sourceforge.jtds.jdbc.DateTime;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Investimentos implements Serializable {

    public String id_investimento;
    public int id_riscoInvestimento;
    public String nome;
    public String tipo_investimento;
    public String rentabilidade_fixa;
    public String rentabilidade_variavel;
    public String data_atualizacao;
    public String vencimento;
    public String valor_minimo;
    public String tempo_minimo;

    public String getId_investimento() {
        return id_investimento;
    }
}
