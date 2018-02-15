package com.example.admin.ssuwelcome;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Switch;

/**
 * Created by EinHugo on 2017-05-15.
 */

public class UpdateStoreActivity extends AppCompatActivity {

    private String notice = null, phone = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        setTitle("점포관리");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updatestore);

        final EditText inputNotice = (EditText) findViewById(R.id.updateNotice);
        final EditText inputPhone = (EditText) findViewById(R.id.updatePhone);
        Switch isOpenSwitch = (Switch) findViewById(R.id.isOpenSwitch);
        Button saveUpdateBtn = (Button) findViewById(R.id.saveUpdateBtn);
        final Button notSaveUpdateBtn = (Button) findViewById(R.id.notSaveUpdateBtn);
        Button updateMenu = (Button) findViewById(R.id.updateMenuBtn);
        Button showReviewBtn = (Button) findViewById(R.id.showReviewBtn);
        saveUpdateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                notice = inputNotice.getText().toString();
                phone = inputPhone.getText().toString();

                if((notice.length() != 0) && (phone.length() != 0)) {  // 둘 다 수정되었을 경우

                } else if ((notice.length() == 0) && (phone.length() != 0)) { // 전화번호만 수정되었을 경우

                } else if ((notice.length() != 0) && (phone.length() == 0)) { // 공지사항만 수정되었을 경우

                }

                Intent intent = new Intent(getApplicationContext(),UpdateStoreActivity.class);
                startActivity(intent);
                finish();
            }
        });

        notSaveUpdateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        updateMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SellerMenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
        showReviewBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ReviewActivity.class);
                startActivity(intent);
                finish();
            }
        });
        isOpenSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // do something, the isChecked will be
                // true if the switch is in the On position
            }
        });

        Button sellerChatAvailableBtn = (Button) findViewById(R.id.sellerChatAvaliableBtn);
        Button sellerChatUnavailableBtn = (Button) findViewById(R.id.sellerChatUnavaliableBtn);
        Button sellerChatOpenBtn = (Button) findViewById(R.id.sellerChatOpenBtn);
        Button sellerChatClosedBtn = (Button) findViewById(R.id.sellerChatClosedBtn);
        sellerChatAvailableBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showNumberpicker();
            }
        });
        sellerChatUnavailableBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        sellerChatOpenBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        sellerChatClosedBtn.setOnClickListener(new View.OnClickListener(){
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