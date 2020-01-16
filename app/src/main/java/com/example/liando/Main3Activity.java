package com.example.liando;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button sukses2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sukses2 = findViewById(R.id.sukses2);
        sukses2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Main3Activity.this, Main3Activity.class);
                startActivity(b);
                finish();
            }
        });
    }
}
