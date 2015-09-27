package com.cerezaenterprises.operationjen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity  {

    Button tvRegisterLink;
    EditText etName, etUsername, etPassword, etCredit_Card, etExpiration, etCVV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.etName);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etCredit_Card = (EditText) findViewById(R.id.etCredit_card);
        etExpiration = (EditText) findViewById(R.id.etExpiration);
        etCVV = (EditText) findViewById(R.id.etCVV);




        Button button = (Button) findViewById(R.id.bRegister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                int Credit_Card = Integer.parseInt(etCredit_Card.getText().toString());
                int Expiration = Integer.parseInt(etExpiration.getText().toString());
                int CVV = Integer.parseInt(etCVV.getText().toString());

                User registeredData = new User(name, username, password, Credit_Card, Expiration, CVV);



                Intent intent = new Intent(Register.this, MainActivity.class);

                startActivity(intent);
            }

        });
    }

}
