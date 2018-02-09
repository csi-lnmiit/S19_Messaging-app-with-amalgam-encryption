package com.example.csiae.csichatae;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AuthenticationPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication_page);
    }

    public void LoginstartIntent(View view){
        Intent ChatIntent = new Intent(this,ChatActivity.class);
        startActivity(ChatIntent);

    }

    public void CreateAccountIntent(View view){
        Intent CreateIntent = new Intent(this,CreateAccountActivity.class);
        startActivity(CreateIntent);

    }

}


