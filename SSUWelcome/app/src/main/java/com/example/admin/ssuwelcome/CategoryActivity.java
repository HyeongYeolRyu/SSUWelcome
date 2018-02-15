package com.example.admin.ssuwelcome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class CategoryActivity extends AppCompatActivity {

    public  static String storeName;
    public byte[] buf;
    byte c;
    String input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Socket socket = new Socket("39.115.16.203", 9195);

                    byte b = '7';

                    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                    DataInputStream dis = new DataInputStream(socket.getInputStream());
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    dos.writeByte(b);
                    //dis.readByte(buf);

                     // c = dis.readByte();

                    //dis.read(buf);
                     input = in.readLine();


                   // for (int i = 0; i < 7; i++)
                   //     buf[i] = dis.readByte();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        myThread.start();

        /*
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */


    }

    public void koreanfoodclick(View v)
    {

        Toast.makeText(getApplicationContext(), "서버로부터 받은 값 " + input, Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, KoreanfoodStoreActivity.class);
        startActivity(intent);
    }

    public void westernfoodclick(View v)
    {
        Intent intent = new Intent(this, WesternfoodStoreActivity.class);
        startActivity(intent);
    }

    public void chinesefoodclick(View v)
    {
        Intent intent = new Intent(this, ChinesefoodStoreActivity.class);
        startActivity(intent);
    }

    public void japanesefoodclick(View v)
    {
        Intent intent = new Intent(this, JapanesefoodStoreActivity.class);
        startActivity(intent);
    }

    public void cafeclick(View v)
    {
        Intent intent = new Intent(this, CafeStoreActivity.class);
        startActivity(intent);
    }

    public void etcclick(View v)
    {
        Intent intent = new Intent(this, EtcStoreActivity.class);
        startActivity(intent);
    }
}
