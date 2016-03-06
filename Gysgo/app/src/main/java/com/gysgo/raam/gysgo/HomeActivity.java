package com.gysgo.raam.gysgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void onProfileClick(View view){
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }
    public void onContactClick(View view){
        Intent intent = new Intent(this,ContactActivity.class);
        startActivity(intent);
    }
    public void onViewListClick(View view){
        Intent intent = new Intent(this,ViewListActivity.class);
        startActivity(intent);
    }

    public void onMasterList(View view){
        Intent intent = new Intent(this,MasterListActivity.class);
        startActivity(intent);
    }
    public void onSignOutClick(View view){
        //Intent intent = new Intent(this,ProfileActivity.class);
        //startActivity(intent);
    }


}
