package com.alejandro.httprequest;

import com.google.gson.annotations.Expose;

/**
 * Created by Alejandro on 17/3/17.
 */

public class City {

    @Expose
    private int id;
    private String name;

    public City() {}

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
