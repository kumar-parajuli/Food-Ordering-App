package com.example.foodorderingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        // Bind the TextView
        TextView redirectToSignupTextView = findViewById(R.id.nobutton);
      Button redirectToChooselocationButton = findViewById(R.id.loginbutton);
        // Set up the click listener
        redirectToSignupTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start LoginActivity
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });


      redirectToChooselocationButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Create an Intent to start LoginActivity
            Intent intent = new Intent(LoginActivity.this, ChooselocationActivity.class);
            startActivity(intent);
        }
    });

}

}