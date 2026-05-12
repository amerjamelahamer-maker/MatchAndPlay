package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public class SignInActivity extends AppCompatActivity {

    private TextView signUpTV;
    private TextView signInTV;
    private EditText emailET;
    private EditText passwordET;

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
            emailET = findViewById(R.id.email_et);
            passwordET = findViewById(R.id.password_et);
            String email = emailET.getText().toString();
            String password = passwordET.getText().toString();
            if( validateEmailAndPassword(email,password)) {
                DBRef.auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if( task.isSuccessful() ){
                            Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        }else{
                            Toast.makeText(SignInActivity.this,"Error ",Toast.LENGTH_LONG).show();
                        }
                    }
                });

            }
        });


        }


    private boolean validateEmailAndPassword(String email, String password){
        return true;
    }

}