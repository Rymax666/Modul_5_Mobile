package com.informatika.umm.modul_5_mobile.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/*
 * R#cXman
 */
public class RestaurantResponse {

    @SerializedName("results")
    @Expose
    private List<Restaurant> results = new ArrayList<>();

    public List<Restaurant> getResults() {
        return results;
    }
}
