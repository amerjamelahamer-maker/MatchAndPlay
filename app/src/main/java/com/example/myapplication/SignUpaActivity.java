package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

public class SignUpaActivity extends AppCompatActivity {
    private EditText firstNameET;
    private EditText lastNameET;
    private EditText emailET;
    private EditText passwordET;
    private Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_upa);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        firstNameET = findViewById(R.id.first_name);
        lastNameET = findViewById(R.id.last_name);
        emailET = findViewById(R.id.email_et);
        passwordET = findViewById(R.id.password_et);
        signUpBtn = findViewById(R.id.sign_up);
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = firstNameET.getText().toString();
                String lastName = lastNameET.getText().toString();
                String email = emailET.getText().toString();
                String password = passwordET.getText().toString();
                if (checkData(firstName, lastName, email, password)){
                    DBRef.auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if( task.isSuccessful()) {
                                String userId = task.getResult().getUser().getUid();
                                User user = new User(firstName, lastName, email, password, userId);
                                DBRef.userRef.child(userId).setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if( task.isSuccessful()){
                                            if(task.isSuccessful()){
                                                Toast.makeText(SignUpaActivity.this,"sign up complete",Toast.LENGTH_LONG).show();
                                                Intent intent = new Intent(SignUpaActivity.this,SignInActivity.class);
                                                startActivity(intent);
                                            }else{
                                               Toast.makeText(SignUpaActivity.this,"Error",Toast.LENGTH_LONG).show();
                                            }
                                        }
                                    }
                                });
                            }else{
                                Toast.makeText(SignUpaActivity.this,"Error ..",Toast.LENGTH_LONG).show();
                            }

                        }
                    });
                }
            }
        });




    }
    private boolean checkData (String firstName, String lastName, String email, String password){
        return true;
    }
}