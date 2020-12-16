package com.example.fitnesscoach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
     Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(intent);
            }
        });

    }

    public void editerProfil(View view) {
            Intent intent=new Intent(getApplicationContext(), Profil.class);
            startActivity(intent);
    }

    public void paramétrer(View view) {
        Intent intent=new Intent(getApplicationContext(),Settings.class);
        startActivity(intent);
    }

    public void Conseiller(View view) {
    }



}