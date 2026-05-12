package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignInActivity extends AppCompatActivity {

    private TextView signUpTV;
    private TextView signInTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        signUpTV = findViewById(R.id.sign_up_tv);
        signUpTV.setOnClickListener(v -> {
            Intent intent = new Intent(SignInActivity.this, SignUpaActivity.class);
            startActivity(intent);
            finish();
        });
        signInTV = findViewById(R.id.sign_in);
        signInTV.setOnClickListener(v ->  {
           Intent intent = new Intent(SignInActivity.this, MainActivity.class);
           startActivity(intent);
           finish();
        });


        }




}