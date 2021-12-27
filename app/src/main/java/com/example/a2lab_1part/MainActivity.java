package com.example.a2lab_1part;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText, getEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        getEditText = findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getWeatherData(getEditText.getText().toString());
            }
        });
    }
    private void getWeatherData(String name){
        ApiInterface apiInterface = WeatherAPI.getClient().create(ApiInterface.class);
        Call<Example> call = apiInterface.getWeatherData(name);
        call.enqueue(new Callback<Example>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                editText.setText("Temperature :"+" "+response.body().getMain().getTemp());
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });
    }

}