package com.informatika.umm.modul_5_mobile.api;

import com.informatika.umm.modul_5_mobile.model.RestaurantResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/*
 * R#cXman
 */

public interface Service {

    @GET("api/place/nearbysearch/json")
    Call<RestaurantResponse> getNearbyPlaces(
            @Query("type") String type,
            @Query("location") String location,
            @Query("radius") int radius,
            @Query("key") String apiKey);

}
