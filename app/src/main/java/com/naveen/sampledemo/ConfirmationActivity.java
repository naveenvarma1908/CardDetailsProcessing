package com.naveen.sampledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmationActivity extends AppCompatActivity {

    private Button button;
    private TextView textView_details,number,cvv,date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        textView_details = (TextView)findViewById(R.id.text_name);
        button = (Button)findViewById(R.id.button_gotBACK);
        date = (TextView)findViewById(R.id.text_Date);
        cvv  = (TextView)findViewById(R.id.text_CVV);
        number = (TextView)findViewById(R.id.tex_number);


        textView_details.setText(getIntent().getStringExtra("CardHolderName"));
        date.setText(getIntent().getStringExtra("CardDate"));
        cvv.setText(getIntent().getStringExtra("CardCVV"));
        number.setText(getIntent().getStringExtra("CardNumber"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ConfirmationActivity.this, "Thanks for Confirmation !!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
