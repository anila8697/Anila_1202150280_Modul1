package com.example.android.anila_1202150280_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    EditText porsi;
    EditText menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abnormal(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        porsi = (EditText) findViewById(R.id.idporsimakan);
        String jumlah = porsi.getText().toString();
        menu = (EditText) findViewById(R.id.idmenu);
        String makan = menu.getText().toString();
        intent.putExtra("idtempatmakan","Eatbus");
        intent.putExtra("idmenumakan",makan);
        intent.putExtra("idporsimakan",jumlah);
        intent.putExtra("idhargamakan","50000");
        startActivity(intent);

    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        porsi = (EditText) findViewById(R.id.idporsimakan);
        String jumlah = porsi.getText().toString();
        menu = (EditText) findViewById(R.id.idmenu);
        String makan = menu.getText().toString();
        intent.putExtra("idtempatmakan","Abnormal");
        intent.putExtra("idmenumakan",makan);
        intent.putExtra("idporsimakan",jumlah);
        intent.putExtra("idhargamakan","30000");
        startActivity(intent);
    }

}
