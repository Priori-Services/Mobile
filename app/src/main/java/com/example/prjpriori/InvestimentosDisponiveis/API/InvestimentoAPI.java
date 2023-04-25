package com.example.prjpriori.InvestimentosDisponiveis.API;

import com.example.prjpriori.InvestimentosDisponiveis.Model.Investimentos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InvestimentoAPI {

    @GET("/Investimento")
    Call<List<Investimentos>> listarInvestimentos();
}
