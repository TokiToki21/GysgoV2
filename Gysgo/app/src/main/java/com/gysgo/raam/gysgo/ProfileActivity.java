package com.gysgo.raam.gysgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        // Display Name
        TextView name = (TextView)findViewById(R.id.userName);
        String s = "Raam Rattanakone";
        name.setText(s);
        // Display Email
        TextView email = (TextView)findViewById(R.id.userEmail);
        String e = "raam@raam.com";
        email.setText(e);

    }
}
