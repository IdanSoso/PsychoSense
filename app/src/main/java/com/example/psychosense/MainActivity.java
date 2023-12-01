package com.example.psychosense;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Idan";
    private FirebaseAuth mAuth;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect to firebase
        mAuth = FirebaseAuth.getInstance();
    }

    //checking if the user is already connected
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            Log.d(TAG, "onStart: home");
            intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
        else {
            Log.d(TAG, "onStart: login");
            intent = new Intent(this, Login.class);
            startActivity(intent);
        }
    }
}