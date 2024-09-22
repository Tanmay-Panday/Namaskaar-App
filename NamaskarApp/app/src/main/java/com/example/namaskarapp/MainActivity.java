package com.example.namaskarapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText nameText;
    Button btn;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize global variables
        nameText = findViewById(R.id.name);
        btn = findViewById(R.id.btn);
        title = findViewById(R.id.title);

        // provoide functionality
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputname = nameText.getText().toString();
                Toast.makeText(
                        MainActivity.this,
                        "Namaskaar "+inputname+" Ji",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}