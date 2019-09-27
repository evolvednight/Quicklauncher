package com.example.quicklauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityBtn = findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("com.example.quicklauncher.SOMETHING", "Hello World");
                // show how to pass information
                startActivity(startIntent);
            }
        });

        Button googleBtn = findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "http://www.yahoo.com";
                Uri webaddress = Uri.parse(google);
                Intent googleIntent = new Intent(Intent.ACTION_VIEW, webaddress);
                if(googleIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(googleIntent);
                }
            }
        });

    }
}
