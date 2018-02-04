package com.example.android.anila_1202150280_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView jmlmakan;
    TextView pricemakan;
    TextView menumakanan;
    TextView tempatmakan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String aJUMLAH = intent.getStringExtra("idporsimakan");
        String aMENU = intent.getStringExtra("idmenumakan");
        String aTEMPAT = intent.getStringExtra("idtempatmakan");
        String aHARGA = intent.getStringExtra("idhargamakan");
        int hHrg = Integer.valueOf(aHARGA)*Integer.valueOf(aJUMLAH);

        jmlmakan =(TextView) findViewById(R.id.idporsimakan);
        jmlmakan.setText(aJUMLAH);
        tempatmakan =(TextView) findViewById(R.id.idtempatmakan);
        tempatmakan.setText(aTEMPAT);
        menumakanan = (TextView) findViewById(R.id.idmenumakan);
        menumakanan.setText(aMENU);
        pricemakan = (TextView) findViewById(R.id.idhargamakan);
        pricemakan.setText(String.valueOf(hHrg));
        if(hHrg > 65000){
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Jan Malam Malam Di sini! Uang Kamu Tidak Cukup", Toast.LENGTH_LONG);
            toast.show();
        }else{
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Makan Malam Di Sini Aja Nih", Toast.LENGTH_LONG);
            toast.show();
        }

    }
}
