package com.refathasan.myapplication.service;

import com.refathasan.myapplication.model.Info;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GetCountryDataService {

    @GET("country/get/all")
    Call<Info>getResults();

}
