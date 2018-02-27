package com.example.ankomah.updatingui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import java.util.*

public class MainActivity extends AppCompatActivity() {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    TextView myview;
    int x;
    Random myRand = new Random();
    String number;
    Handler myhandler = new Handler;

    public void randomize(view view) {
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                generateNumber();
            }

        };
        new Thread (myRunnable).start();

    }
    private void generateNumber() {
        for (int i = 0; i <= 40; i++){
        x = myRand.nextInt(100) + 1;
        number = String.valueOf(x);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myviewHandler.post(new Runnable) {
            @Override
            public void run() {
                myView = (TextView) findViewById (R.id.myTextView)
                myView.setText(number);


            }
        });


    }
    }
}


