package com.example.myapplication;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DBRef {
    public static DatabaseReference userRef = FirebaseDatabase.getInstance().getReference("Users");
    public static FirebaseAuth auth = FirebaseAuth.getInstance();
}
