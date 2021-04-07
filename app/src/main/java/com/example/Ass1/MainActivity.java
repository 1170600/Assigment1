package com.example.Ass1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private EditText editFull_name;
    private EditText editEmail;
    private EditText DateOfBirth;
    private EditText editAge;
    private EditText editPass;
    Spinner spinner;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editFull_name = findViewById(R.id.editFull_name);
        editEmail = findViewById(R.id.editEmail);
          spinner = findViewById(R.id.spinner);
        ArrayList<String> gender = new ArrayList<>();
        gender.add("Female");
        gender.add("Male");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gender);
        spinner.setAdapter(adapter);
        DateOfBirth = findViewById(R.id.DateOfBirth);
        editAge = findViewById(R.id.editAge);
        editPass = findViewById(R.id.editPass);


    }


    public void btnsend_OnClick(View view) {

        Intent intent = new Intent(this, MainActivity2.class);
        String full_name= editFull_name.getText().toString();
        String email=editEmail.getText().toString();
        String spinner1= spinner.getSelectedItem().toString();
        String date=DateOfBirth.getText().toString();
        String age=editAge.getText().toString();
        String pass=editPass.getText().toString();

        intent.putExtra("Full Name",full_name);
        intent.putExtra("Email Address",email);
        intent.putExtra("Gender",spinner1);
        intent.putExtra("Data OF Birthday ",date);
        intent.putExtra("Age",age);
        intent.putExtra("Password",pass);
        startActivity(intent);

    }


}

