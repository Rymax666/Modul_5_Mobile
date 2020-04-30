package com.informatika.umm.modul_5_mobile.api;

import com.informatika.umm.modul_5_mobile.util.Utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
 * R#cXman
 */
public class Client {
    private static final String BASE_URL = Utils.URL;
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
