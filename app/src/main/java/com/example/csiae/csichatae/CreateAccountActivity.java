package com.example.csiae.csichatae;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateAccountActivity extends AppCompatActivity {
    ArrayList<String> usernames = new ArrayList<String >();
    ArrayList<String> pass = new ArrayList<String >();
    int temp=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView name=(TextView)findViewById(R.id.editText);
                final String user_name=name.getText().toString();
                TextView eid=(TextView)findViewById(R.id.editText4);
                String email_id=name.getText().toString();
                TextView phone=(TextView)findViewById(R.id.editText5);
                String phone_no=name.getText().toString();
                TextView pass1=(TextView)findViewById(R.id.editText6);
                String p1=pass1.getText().toString();
                TextView pass2=(TextView)findViewById(R.id.editText7);
                String p2=pass2.getText().toString();

                if ((TextUtils.isEmpty(user_name))||(TextUtils.isEmpty(email_id))||(TextUtils.isEmpty(phone_no))||TextUtils.isEmpty((p1))||TextUtils.isEmpty(p2))
                {temp =1;}
                if(!p1.equals(p2))
                temp=1;
                if(temp==0)
                {
                    pass.add(p1);
                    usernames.add(user_name);
                    Toast.makeText(CreateAccountActivity.this,"Done",Toast.LENGTH_SHORT).show();
                    Intent CreateIntent = new Intent(CreateAccountActivity.this,AuthenticationPageActivity.class);
                    startActivity(CreateIntent);
                }

                else
                {
                    Toast.makeText(CreateAccountActivity.this,"Fill all fields correctly",Toast.LENGTH_SHORT).show();
                    temp=0;
                }

            }
        });
    }

}
