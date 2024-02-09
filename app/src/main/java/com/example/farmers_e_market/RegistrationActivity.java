package com.example.farmers_e_market;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {
//Button registerBtn;
//EditText registerEmail, registerPassword, registerName;
//TextView registerTxt1, registerSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

      /* registerName= findViewById(R.id.registerName);
        registerEmail= findViewById(R.id.registerEmail);
        registerPassword= findViewById(R.id.registerPassword);
        registerBtn= findViewById(R.id.registerBtn);
        registerSignIn=findViewById(R.id.registerTxt2);

        // set click listener
        registerSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment= new loginFragment();
                FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
                ft.add(R.id.containerDrawer,fragment).commit();
            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }
}