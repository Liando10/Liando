package com.example.liando;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    Button sukses1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sukses1 = findViewById(R.id.sukses1);
        sukses1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(b);
                finish();
            }
        });

    }
}
