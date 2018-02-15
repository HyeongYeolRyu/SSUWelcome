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

public class SignUpActivity extends AppCompatActivity {

    private String ID,PW;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        setTitle("점포 회원가입");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        /*  submitSignUpBtn 과 notSubmitSignUpBtn의 리스너 작동
            submit : 회원가입 신청 토스트 메시지 출력
            notSubmit : 취소 토스트 메시지 출력
         */
        final EditText inputID = (EditText) findViewById(R.id.signupID);
        final EditText inputPW = (EditText) findViewById(R.id.signupPW);
        Button submitSignUpBtn = (Button) findViewById(R.id.submitSignUpBtn);
        Button notSubmitSignUpBtn = (Button) findViewById(R.id.notSubmitSignUpBtn);

        submitSignUpBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ID = inputID.getText().toString();
                PW = inputPW.getText().toString();
                // 입력받은 회원정보 서버에 보내기
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "회원가입이 신청되었습니다", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        notSubmitSignUpBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "취소하셨습니다", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }


}