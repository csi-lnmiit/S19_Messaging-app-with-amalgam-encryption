package com.example.csiae.csichatae;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ayush Goel on 2/8/2018.
 */

public class ChatArrayadpter extends ArrayAdapter {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if(listitemView == null){
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.chatadapter,parent,false);
        }
        Chats currentchathead = (Chats) getItem(position);
        TextView enTextView = (TextView) listitemView.findViewById(R.id.adapterChatName);
        enTextView.setText(currentchathead.getChName());

        return listitemView;
    }

    ChatArrayadpter (Context context, ArrayList<Chats> chat){

        super(context,0,chat);
    }
}
