package com.example.wprowadzenie2p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wypisz(View view) {
        view.setVisibility(View.INVISIBLE);
        Toast.makeText(this, "Witaj w pierwszej aplikacji", Toast.LENGTH_SHORT).show();
    }
}