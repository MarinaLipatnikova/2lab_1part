package com.example.a2lab_1part;

import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("temp")
    String temp;

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
