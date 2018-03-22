package com.example.android.mypocket;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    EditText user,pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText)findViewById(R.id.username);
        pass = (EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
    }

    public void Register(View view) {
        Intent intent = new Intent(login.this, Register.class);
        login.this.startActivity(intent);
    }

    public void login(View view) {
        final String userkey = user.getText().toString();
        String passkey = pass.getText().toString();

        if(userkey.equals("aan")&& passkey.equals("123") || userkey.equals("admin") && passkey.equals("admin") ){
            AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
            builder.setMessage("Login Sukses !").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(login.this, mainitem.class);
                    intent.putExtra("user",userkey);
                    login.this.startActivity(intent);
                }
            });
            builder.show();
        }

        else{
            AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
            builder.setMessage("Username dan password Salah")
                    .setNegativeButton("retry...", null).create().show();
        }
    }
}
