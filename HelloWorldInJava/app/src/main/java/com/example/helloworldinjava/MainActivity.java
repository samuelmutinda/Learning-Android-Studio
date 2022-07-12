package com.example.helloworldinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void confirmCredentials(View view){
        TextView firstNameOutput = findViewById(R.id.firstNameOutputText);
        TextView secondNameOutput = findViewById(R.id.secondNameOutputText);
        TextView emailOutput = findViewById(R.id.emailOutputText);

        EditText FirstNameInputText = findViewById(R.id.FirstNameInputText);
        EditText SecondNameInputText = findViewById(R.id.SecondNameInputText);
        EditText EmailInputText = findViewById(R.id.EmailInputText);

        firstNameOutput.setText(FirstNameInputText.getText().toString());
        secondNameOutput.setText(SecondNameInputText.getText().toString());
        emailOutput.setText(EmailInputText.getText().toString());
    }
}