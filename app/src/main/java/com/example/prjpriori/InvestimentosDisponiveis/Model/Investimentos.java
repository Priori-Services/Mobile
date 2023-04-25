package com.example.prjpriori.InvestimentosDisponiveis.Model;

import net.sourceforge.jtds.jdbc.DateTime;

import java.math.BigDecimal;
import java.util.Date;

public class Investimentos {

    public String id_investimento;
    public String id_riscoInvestimento;
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

    public void setId_investimento(String id_investimento) {
        this.id_investimento = id_investimento;
    }

    public String getId_riscoInvestimento() {
        return id_riscoInvestimento;
    }

    public void setId_riscoInvestimento(String id_riscoInvestimento) {
        this.id_riscoInvestimento = id_riscoInvestimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo_investimento() {
        return tipo_investimento;
    }

    public void setTipo_investimento(String tipo_investimento) {
        this.tipo_investimento = tipo_investimento;
    }

    public String getRentabilidade_fixa() {
        return rentabilidade_fixa;
    }

    public void setRentabilidade_fixa(String rentabilidade_fixa) {
        this.rentabilidade_fixa = rentabilidade_fixa;
    }

    public String getRentabilidade_variavel() {
        return rentabilidade_variavel;
    }

    public void setRentabilidade_variavel(String rentabilidade_variavel) {
        this.rentabilidade_variavel = rentabilidade_variavel;
    }

    public String getData_atualizacao() {
        return data_atualizacao;
    }

    public void setData_atualizacao(String data_atualizacao) {
        this.data_atualizacao = data_atualizacao;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getValor_minimo() {
        return valor_minimo;
    }

    public void setValor_minimo(String valor_minimo) {
        this.valor_minimo = valor_minimo;
    }

    public String getTempo_minimo() {
        return tempo_minimo;
    }

    public void setTempo_minimo(String tempo_minimo) {
        this.tempo_minimo = tempo_minimo;
    }
}
