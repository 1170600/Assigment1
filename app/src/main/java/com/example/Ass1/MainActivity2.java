package com.example.Ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();

        String full_name =intent.getStringExtra("Full Name");
        TextView txt1 = findViewById(R.id.fullname);


        String email_address= intent.getStringExtra("Email Address");
        TextView txt2 = findViewById(R.id.email);

        String gender=intent.getStringExtra("Gender");
        TextView txt3 = findViewById(R.id.gender);


        String dateofbirth=intent.getStringExtra("Data OF Birthday ");
        TextView txt4 = findViewById(R.id.dateofbirth);
        String age =intent.getStringExtra("Age");
        TextView txt5 = findViewById(R.id.Age);
        String pass= intent.getStringExtra("Password");
        TextView txt6 = findViewById(R.id.pass);
        txt1.setText(full_name);
        txt2.setText(email_address);
        txt3.setText(gender);
        txt4.setText(dateofbirth);
        txt5.setText(age);
        txt6.setText(pass);



    }
}