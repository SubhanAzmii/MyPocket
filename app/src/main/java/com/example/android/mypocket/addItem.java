package com.example.android.mypocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addItem extends AppCompatActivity {

    EditText nName, nDesc, nPlace, nImgSrc;
    Button send;

    DatabaseReference dbitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        dbitem = FirebaseDatabase.getInstance().getReference("ItemList");
        nName = (EditText) findViewById(R.id.name);
        nPlace = (EditText) findViewById(R.id.place);
        nDesc = (EditText) findViewById(R.id.place);
        send = (Button) findViewById(R.id.kirim);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem();
            }
        });


    }
    private  void addItem(){
        String nama = nName.getText().toString().trim();
        String tmp = nPlace.getText().toString().trim();
        String deskrip = nDesc.getText().toString().trim();

        if(!TextUtils.isEmpty(nama) && !TextUtils.isEmpty(tmp)){
            String id = dbitem.push().getKey();
            tambahitem item = new tambahitem(id, nama, tmp, deskrip);

            dbitem.child(id).setValue(item);
            Toast.makeText(this,"Data Berhasil Di simpan",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"Masukkan barang dan posisi nyimpanya",Toast.LENGTH_LONG).show();
        }

    }

}
