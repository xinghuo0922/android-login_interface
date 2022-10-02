package com.example.android_login_interface;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class user extends AppCompatActivity{
    private TextView username;

//    ListView listview1;
//    String[] data = {"Apple","Banana","Orange","Watermelon","Pear"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Intent intent=getIntent();
        String name=intent.getStringExtra("username");
        username=(TextView) findViewById(R.id.username);
        username.setText("欢迎你："+name);

//        listview1 = findViewById(R.id.listview1);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(user.this, android.R.layout.simple_list_item_1,data);
//        listview1.setAdapter(adapter);
    }

}
