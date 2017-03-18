package com.alejandro.httprequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Alejandro on 17/3/17.
 */

public class Town {

    private int id;
    @SerializedName("ciudades")
    private List<City> cities;

    public Town(){}

    public Town(int id, List<City> cities) {
        this.id = id;
        this.cities = cities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public static City parseJSON(String response) {
        Gson gson = new GsonBuilder().create();
        City city = gson.fromJson(response, City.class);
        return city;
    }

}
