package com.example.admin.ssuwelcome;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.ArrayList;

public class StoreDataActivity extends AppCompatActivity {

    TextView storename;
    ArrayAdapter<String> Adapter;
    ArrayList<String> list_buyerchat;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storedata);

        storename = (TextView) findViewById(R.id.storeNameText);
        String str = com.example.admin.ssuwelcome.CategoryActivity.storeName;
        storename.setText(str);

        Button ask1Btn = (Button) findViewById(R.id.ask1);
        Button ask2Btn = (Button) findViewById(R.id.ask2);
        Button ask3Btn = (Button) findViewById(R.id.ask3);

        Button ans1Btn = (Button) findViewById(R.id.answer1);
        Button ans2Btn = (Button) findViewById(R.id.answer2);
        Button ans3Btn = (Button) findViewById(R.id.answer3);
        Button ans4Btn = (Button) findViewById(R.id.answer4);
        Button ans5Btn = (Button) findViewById(R.id.answer5);
        Button ans6Btn = (Button) findViewById(R.id.answer6);

        Button notSaveUpdateBtn = (Button) findViewById(R.id.notSaveUpdateBtn);
        Button updateMenu = (Button) findViewById(R.id.updateMenuBtn);
        Button showReviewBtn = (Button) findViewById(R.id.showReviewBtn);

        ListView list = (ListView)findViewById(R.id.lv_buyerChat);

        list_buyerchat = new ArrayList<>();
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list_buyerchat);

        list_buyerchat.add("맛있어요~");
        list.setAdapter(Adapter);



        notSaveUpdateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        updateMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SellerMenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
        showReviewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReviewActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ask1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNumberpicker();
            }
        });
        ask2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ask3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        ans1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ans2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ans3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ans4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ans5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ans6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void showNumberpicker()  {
        final Dialog dialog = new Dialog(this);
        dialog.setTitle("NumberPicker");
        dialog.setContentView(R.layout.dialog_numberpicker);
        Button okBtn = (Button) dialog.findViewById(R.id.button1);
        Button cancelBtn = (Button) dialog.findViewById(R.id.button2);

        final NumberPicker np = (NumberPicker) dialog.findViewById(R.id.numberPicker1);
        np.setMaxValue(10);
        np.setMinValue(0);
        np.setValue(4);
        np.setWrapSelectorWheel(false);
        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(){
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){

            }
        });
        okBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                //       tv.setText(String.valueOf(np.getValue()));
                dialog.dismiss();
            }
        });
        cancelBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}

