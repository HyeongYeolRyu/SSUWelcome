package com.example.admin.ssuwelcome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class KoreanfoodStoreActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    byte[] buf = new byte[255];

    ArrayList<String> list_koreanItemList;
    ArrayAdapter<String> Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koreanfoodstore);




        ListView list=(ListView)findViewById(R.id.lv_korean);

        list_koreanItemList = new ArrayList<>();
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list_koreanItemList);

        list_koreanItemList.add("손칼국수");
        list_koreanItemList.add("만나식당");
        list_koreanItemList.add("김밥천국");
        list_koreanItemList.add("김밥천국");
        list_koreanItemList.add("김밥천국");
        list_koreanItemList.add("김밥천국");
        list_koreanItemList.add("김밥천국");
        list_koreanItemList.add("김밥천국");
        list_koreanItemList.add("김밥천국");
        list_koreanItemList.add("김밥천국");
        list_koreanItemList.add("김밥천국");
        list_koreanItemList.add("김밥천국");

        list.setAdapter(Adapter);

        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(getApplicationContext(),
                list_koreanItemList.get(position),Toast.LENGTH_SHORT).show();

        com.example.admin.ssuwelcome.CategoryActivity.storeName =  list_koreanItemList.get(position);

        Intent intent = new Intent(this, StoreDataActivity.class);
        startActivity(intent);
    }
}
