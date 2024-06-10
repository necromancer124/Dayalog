package com.example.dialogexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);


        Dialog d = new Dialog(this);
        d.setContentView(R.layout.dialog_layout);


        d.findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                EditText nameEditText = d.findViewById(R.id.nameEditText);

                String username = nameEditText.getText().toString();
                String password = ((EditText)d.findViewById(R.id.passwordEditText)).getText().toString();

                Toast.makeText(MainActivity.this, "Username: " + username + ", Password: " + password, Toast.LENGTH_LONG).show();

                d.dismiss();
            }
        });



        this.findViewById(R.id.myButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.show();
            }
        });


    }
}