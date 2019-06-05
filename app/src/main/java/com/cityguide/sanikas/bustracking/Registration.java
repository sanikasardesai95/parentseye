package com.cityguide.sanikas.bustracking;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration extends AppCompatActivity {

        EditText editText;
        FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        fab=(FloatingActionButton)findViewById(R.id.btn1);
        editText=(EditText)findViewById(R.id.edit1);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckNo(editText.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Enter the number",Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(getApplicationContext(), "Please Enter the Number", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Registration.this,OTP.class);
                    startActivity(i);
                }


            }

        });

    }

    public boolean CheckNo(String sn) {
        Boolean check=false;
        String no= "\\d*\\.?\\d+";
        CharSequence inputstr=sn;
        Pattern pte=Pattern.compile(no,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pte.matcher(inputstr);
        if(matcher.matches())
        {
            check=true;
        }
        return check;


    }
}
