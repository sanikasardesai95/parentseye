package com.cityguide.sanikas.bustracking;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Camera;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

public class MyCustomDialog extends DialogFragment {

    private static final String TAG= "MyCustomDialog";

    private ImageView imgcheck;
    private EditText edit1,edit2,edit3,edit4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.dialog_my_custom, container, false);

        edit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1=(EditText)view.findViewById(R.id.name);
                String name=edit1.getText().toString();
            }
        });

        edit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit2=(EditText)view.findViewById(R.id.relation);
                String relation=edit2.getText().toString();
            }
        });
        edit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit3=(EditText)view.findViewById(R.id.contact);
                String contact=edit3.getText().toString();
            }
        });
        edit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit4=(EditText)view.findViewById(R.id.mail);
                String mail=edit4.getText().toString();
            }
        });

        return view;
    }
}
