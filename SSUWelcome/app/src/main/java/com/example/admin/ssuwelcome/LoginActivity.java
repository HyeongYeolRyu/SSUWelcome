package com.example.admin.ssuwelcome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by EinHugo on 2017-05-15.
 */

public class LoginActivity extends AppCompatActivity{

    private String ID, PW;
    boolean isValid = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        setTitle("점포 관리자 로그인");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText inputID = (EditText) findViewById(R.id.inputID);
        final EditText inputPW = (EditText) findViewById(R.id.inputPW);
        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ID = inputID.getText().toString();
                PW = inputPW.getText().toString();

                if(isValid) {
                    Intent intent = new Intent(getApplicationContext(), UpdateStoreActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "ID와 비밀번호를 다시 한번 확인해주세요", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void signUpBtnClicked(View v){
        Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
        startActivity(intent);
        finish();
    }
}