package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void b3click(View view){
        EditText Amount = findViewById(R.id.Amount);
        String Dollars=Amount.getText().toString();
        Double doubledollars=Double.parseDouble(Dollars);
        Double doubleInr = 78.36*doubledollars;
        String toastText = "= "+ String.format("%.2f", doubleInr) + " $";
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();


    }
    public void b4click(View view) {
        EditText Amount = findViewById(R.id.Amount);
        String Dollars = Amount.getText().toString();
        Double doubleeuro = Double.parseDouble(Dollars);
        Double doubleInr = 82.71 * doubleeuro;
        String toastText = "= " + String.format("%.2f", doubleInr);
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
    public void b5click(View view){
      EditText Amount = findViewById(R.id.Amount);
      String Ruble =Amount.getText().toString();
      Double DoubleRuble=Double.parseDouble(Ruble);
      Double Doubleinr=1.45*DoubleRuble;
      String toasttext= "= "+String.format("%.2f",Doubleinr);
        Toast.makeText(this, toasttext, Toast.LENGTH_SHORT).show();
    }
    public void b6click(View view){
     EditText Amount =findViewById(R.id.Amount);
     String Pound = Amount.getText().toString();
     Double DoublePound= Double.parseDouble(Pound);
     Double DoubleInr=94.49*DoublePound;
     String toasttext="= "+String.format("%.2f",DoubleInr);
        Toast.makeText(this,toasttext, Toast.LENGTH_SHORT).show();
    }
    public void b7click(View view){
    EditText Amount =findViewById(R.id.Amount);
    String Won=Amount.getText().toString();
    Double Doublewon=Double.parseDouble(Won);
    Double Doubleinr = 0.0061*Doublewon;
    String toastetxt="= "+String.format("%.2f",Doubleinr);
        Toast.makeText(this, toastetxt, Toast.LENGTH_SHORT).show();
    }
    public void b8click(View view){
        EditText Amount =findViewById(R.id.Amount);
        String Yeh=Amount.getText().toString();
        Double Doubleyeh=Double.parseDouble(Yeh);
        Double Doubleinr = 0.58*Doubleyeh;
        String toastetxt="= "+String.format("%.2f",Doubleinr);
        Toast.makeText(this, toastetxt, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }}