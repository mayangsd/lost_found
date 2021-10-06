package com.example.lost_found;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent mainIntent = getIntent();
        String data = mainIntent.getStringExtra("nama_user");

        Toast.makeText(this, "Selamat Datang "+ data, Toast.LENGTH_SHORT).show();
    }
}