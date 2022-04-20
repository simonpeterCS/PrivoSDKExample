package com.privo.privosdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class PrivoStartActivity extends AppCompatActivity {

    private final Context context = PrivoStartActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privo_start);

        Toast.makeText(context, "Welcome to Privo SDK", Toast.LENGTH_SHORT).show();
    }
}