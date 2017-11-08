package com.naveen.sampledemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.GRAY;


public class MainActivity extends AppCompatActivity {


    private Button bn_process;
    private EditText cname,cnumber,cCVV,cDate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //to hide use getsupportActionBar Method to hide.

        getSupportActionBar().hide();


        bn_process = (Button)findViewById(R.id.button_Process);
        cname = (EditText)findViewById(R.id.edit_cardholderName);
        cnumber = (EditText)findViewById(R.id.edit_cardNumber);
        cDate = (EditText)findViewById(R.id.edit_expDate);
        cCVV = (EditText)findViewById(R.id.edit_cvv);





        bn_process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = cname.getText().toString();
                String number = cnumber.getText().toString();
                String cvv = cCVV.getText().toString();
                String date = cDate.getText().toString();


                //Notification
                Toast.makeText(MainActivity.this,"Bill Processed",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,ConfirmationActivity.class);
                intent.putExtra("CardHolderName",name);
                intent.putExtra("CardNumber",number);
                intent.putExtra("CardCVV",cvv);
                intent.putExtra("CardDate",date);
                startActivity(intent);
                finish();

            }
        });
    }
}
