package com.example.csiae.csichatae;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class messages extends AppCompatActivity  {
    ArrayList<String> marr = new ArrayList<String>();
    String m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);


    }
    public void click(View view) {
        TextView t1=(TextView)findViewById(R.id.editText2);
        String m=t1.getText().toString();
        TextView t2=(TextView)findViewById(R.id.textView);
        t2.setText(m);
       if(!(TextUtils.isEmpty(m)))
        t2.setVisibility(View.VISIBLE);
        t1.setText("");
        Toast.makeText(messages.this,"sent",Toast.LENGTH_SHORT).show();
    }
}
