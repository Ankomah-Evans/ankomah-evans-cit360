package com.example.ankomah.myapplication;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    Button btn;

String strUrl =
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 =(EditText) findViewById(R.id.num1);
        num2 =(EditText) findViewById(R.id.num2);

        btn = (Button) findViewById(R.id.btnAdd);
        btn =setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int i = Integer.parseInt(num1.getText().toString());
                int j = Integer.parseInt(num2.getText().toString());

                new MultiplyTask().execute();
            }
        });
    }
    public class MultiplyTask extends AsyncTask<String,String,String>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }

        @Override
        protected String doInBackground(String... strings) {

            try{
                URL url =new URL(strUrl);
                HttpURLConnection con =(HttpsURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.connect();

                BufferedReader bf =new BufferedReader(new InputStreamReader()));
                String Value = bf.readline();
                System.out.println("result is" + value);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            return null;
        }
    }
}
