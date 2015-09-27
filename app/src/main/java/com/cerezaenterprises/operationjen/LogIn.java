package com.cerezaenterprises.operationjen;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class LogIn extends AppCompatActivity  {

    Button bLogin;
    EditText etUsername, etPassword;
    TextView tvRegisterLink;

    UserLocalStore userLocalStore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        tvRegisterLink = (TextView) findViewById(R.id.tvRegisterLink);

        userLocalStore = new UserLocalStore(this);

        Button button = (Button) findViewById(R.id.bLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                User user = new User(null, null);

                userLocalStore.storeUserData(user);
                userLocalStore.setUserLoggedIn(true);


                Intent intent = new Intent(LogIn.this, Register.class);

                startActivity(intent);
            }
        });


        TextView textView = (TextView) findViewById(R.id.tvRegisterLink);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LogIn.this, MainActivity.class);

                startActivity(intent);
            }


        });
    }
}