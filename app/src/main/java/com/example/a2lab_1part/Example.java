package com.example.a2lab_1part;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Example {

    @SerializedName("main")
    private Main main;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

}
