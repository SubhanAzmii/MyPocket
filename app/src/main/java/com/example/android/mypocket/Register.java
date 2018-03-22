package com.example.android.mypocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText user,pass,retype;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        retype = (EditText) findViewById(R.id.repassword);
        register = (Button) findViewById(R.id.register);



    }

    public void Register(View view) {
        final String pswd = pass.getText().toString();
        final String rtype = retype.getText().toString();

        if (pswd == rtype){
            Intent a = new Intent(Register.this, login.class);
            startActivity(a);
        }else {
            Toast toast = Toast.makeText(this, "Password dan Re-Password Tidak sama !!!", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
