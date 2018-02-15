package com.example.admin.ssuwelcome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by EinHugo on 2017-05-19.
 */

public class SellerMenuActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {

        setTitle("메뉴 관리");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellermenu);


        Button submitMenu = (Button) findViewById(R.id.submitMenu);
        Button notSubmitMenu = (Button) findViewById(R.id.notSubmitMenu);
        submitMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),UpdateStoreActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "메뉴가 수정되었습니다", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        notSubmitMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),UpdateStoreActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "취소하셨습니다", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}