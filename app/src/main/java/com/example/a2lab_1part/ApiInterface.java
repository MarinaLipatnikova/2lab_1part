package com.example.a2lab_1part;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
        @GET("weather?APPID=c9546fc43a7fc76615f690c12440d2de8&units=metric")
        Call<Example> getWeatherData(@Query("q") String name);
}
