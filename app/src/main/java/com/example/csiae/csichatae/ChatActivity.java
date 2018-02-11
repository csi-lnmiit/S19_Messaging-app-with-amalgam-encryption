package com.example.csiae.csichatae;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ArrayList<Chats> chatsadapter = new ArrayList<Chats>();
        chatsadapter.add(new Chats("Abc1"));
        chatsadapter.add(new Chats("Abc2"));
        chatsadapter.add(new Chats("Abc3"));
        chatsadapter.add(new Chats("Abc4"));
        chatsadapter.add(new Chats("Abc5"));
        chatsadapter.add(new Chats("Abc6"));
        chatsadapter.add(new Chats("Abc7"));
        chatsadapter.add(new Chats("Abc8"));
        chatsadapter.add(new Chats("Abc9"));
        chatsadapter.add(new Chats("Abc10"));
        chatsadapter.add(new Chats("Abc11"));
        chatsadapter.add(new Chats("Abc12"));
        ChatArrayadpter chatadapter = new ChatArrayadpter(this,chatsadapter);
        ListView listView = (ListView)findViewById(R.id.ListChats);
        listView.setAdapter(chatadapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mess = new Intent(ChatActivity.this,messages.class);
                startActivity(mess);

            }
        });
    }


}
