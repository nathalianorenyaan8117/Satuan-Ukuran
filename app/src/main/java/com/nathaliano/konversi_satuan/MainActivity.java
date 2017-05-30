package com.nathaliano.konversi_satuan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText edt_angka;
    Button bhm, bdam, bm, bdm, bcm, bmm;
    TextView hsl;

    double angka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_angka = (EditText) findViewById(R.id.ET_input);
        bhm = (Button) findViewById(R.id.bhm);
        bdam = (Button) findViewById(R.id.bdam);
        bm = (Button) findViewById(R.id.bm);
        bdm = (Button) findViewById(R.id.bdm);
        hsl = (TextView) findViewById(R.id.output);
    }



    public boolean cek(){
        if(edt_angka.getText().toString().isEmpty()){
            Toast.makeText(this, "Masukkan Nominal", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
    public void bhm (View v){
        if(!cek()){
            return;
        }
        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch (Exception ex){
            Toast.makeText(this, "Masukkan Nominal", Toast.LENGTH_SHORT).show();

        }
        double hasil = angka * 10;
        hsl.setText(Integer.toString((int) hasil));
        Toast.makeText(this,"1 km = 10 hm", Toast.LENGTH_SHORT).show();
    }
    public void bdam (View v){
        if(!cek()){
            return;
        }
        try {
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch (Exception e){
            Toast.makeText(this,"Masukkan Nominal", Toast.LENGTH_SHORT).show();

        }
        double hasil = angka * 100;
        hsl.setText(Integer.toString((int) hasil));
        Toast.makeText(this, "1 km = 100 dam", Toast.LENGTH_SHORT).show();
    }
    public void bm(View v){
        if(!cek()){
            return;
        }
        try{
            angka =Double.parseDouble(edt_angka.getText().toString());
        }catch (Exception e){
            Toast.makeText(this,"Masukkan Nominal",Toast.LENGTH_SHORT).show();
        }
        double hasil =angka * 1000;
        hsl.setText(Integer.toString((int) hasil));
        Toast.makeText(this,"1 km = 1000 m",Toast.LENGTH_SHORT).show();
    }
    public void bdm (View v){
        if (!cek()){
            return;
        }
        try {
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception e){
            Toast.makeText(this,"Masukkan Nominal",Toast.LENGTH_SHORT).show();
        }
        double hasil = angka * 10000;
        hsl.setText(Integer.toString((int) hasil));
        Toast.makeText(this,"1 km = 10000 dm", Toast.LENGTH_SHORT).show();
    }

    public void bcm(View v){
        if(!cek()){
            return;
        }
        try{
            angka =Double.parseDouble(edt_angka.getText().toString());
        }catch (Exception e){
            Toast.makeText(this,"Masukkan Nominal",Toast.LENGTH_SHORT).show();
        }
        double hasil =angka * 100000;
        hsl.setText(Integer.toString((int) hasil));
        Toast.makeText(this,"1 km = 100000 cm",Toast.LENGTH_SHORT).show();
    }
    public void bmm (View v){
        if (!cek()){
            return;
        }
        try {
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception e){
            Toast.makeText(this,"Masukkan Nominal",Toast.LENGTH_SHORT).show();
        }
        double hasil = angka * 1000000;
        hsl.setText(Integer.toString((int) hasil));
        Toast.makeText(this,"1 km = 1000000 mm", Toast.LENGTH_SHORT).show();
    }


}
