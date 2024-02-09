package com.example.farmers_e_market;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginFragment extends Fragment {


    public loginFragment() {
        // Required empty public constructor
    }

   // TextView loginSignUp;
    //RegistrationActivity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_login, container, false);
        // Inflate the layout for this fragment
      //  activity=(RegistrationActivity) getActivity();

        // ids initialize
        //loginSignUp=view.findViewById(R.id.loginText2);

       /* loginSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(),RegistrationActivity.class);
                startActivity(i);
            }
        });*/

        return view;
    }

}