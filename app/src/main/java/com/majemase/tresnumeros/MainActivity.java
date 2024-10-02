package com.majemase.tresnumeros;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    EditText inNum1, inNum2, inNum3;
    TextView textNum1, textNum2, textNum3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inNum1 = findViewById(R.id.inNum1);
        inNum2 = findViewById(R.id.inNum2);
        inNum3 = findViewById(R.id.inNum3);
        textNum1 = findViewById(R.id.textNum1);
        textNum2 = findViewById(R.id.textNum2);
        textNum3 = findViewById(R.id.textNum3);
        findViewById(R.id.btnMayor).setOnClickListener(v->{
            if(inNum1.getText().toString().trim().isEmpty() || inNum2.getText().toString().trim().isEmpty() || inNum3.getText().toString().trim().isEmpty()){
                Toast.makeText(getApplicationContext(), "Debes introducir tres números", Toast.LENGTH_LONG).show();
            }else{
               mayor(Integer.parseInt(inNum1.getText().toString()), Integer.parseInt(inNum2.getText().toString()), Integer.parseInt(inNum3.getText().toString()));
            }
        });
        findViewById(R.id.btnMenor).setOnClickListener(v->{
            if(inNum1.getText().toString().trim().isEmpty() || inNum2.getText().toString().trim().isEmpty() || inNum3.getText().toString().trim().isEmpty()){
                Toast.makeText(getApplicationContext(), "Debes introducir tres números", Toast.LENGTH_LONG).show();
            }else{
                menor(Integer.parseInt(inNum1.getText().toString()), Integer.parseInt(inNum2.getText().toString()), Integer.parseInt(inNum3.getText().toString()));
            }
        });
        findViewById(R.id.btnAsc).setOnClickListener(v->{
            if(inNum1.getText().toString().trim().isEmpty() || inNum2.getText().toString().trim().isEmpty() || inNum3.getText().toString().trim().isEmpty()){
                Toast.makeText(getApplicationContext(), "Debes introducir tres números", Toast.LENGTH_LONG).show();
            }else{
                ordAsc(Integer.parseInt(inNum1.getText().toString()), Integer.parseInt(inNum2.getText().toString()), Integer.parseInt(inNum3.getText().toString()));
            }
        });
        findViewById(R.id.btnDesc).setOnClickListener(v->{
            if(inNum1.getText().toString().trim().isEmpty() || inNum2.getText().toString().trim().isEmpty() || inNum3.getText().toString().trim().isEmpty()){
                Toast.makeText(getApplicationContext(), "Debes introducir tres números", Toast.LENGTH_LONG).show();
            }else{
                ordDesc(Integer.parseInt(inNum1.getText().toString()), Integer.parseInt(inNum2.getText().toString()), Integer.parseInt(inNum3.getText().toString()));
            }
        });
        findViewById(R.id.btnBorrar).setOnClickListener(v->borrarTodo());
    }

    public void mayor(int num1, int num2, int num3) {
        int sol = Math.max(Math.max(num1, num2), num3);
        textNum1.setText("");
        textNum2.setText(String.valueOf(sol));
        textNum3.setText("");
    }

    public void menor(int num1, int num2, int num3) {
        int sol = Math.min(Math.min(num1, num2), num3);
        textNum1.setText("");
        textNum2.setText(String.valueOf(sol));
        textNum3.setText("");
    }

    public void ordAsc(int num1, int num2, int num3){
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        textNum1.setText(String.valueOf(numeros[0]));
        textNum2.setText(String.valueOf(numeros[1]));
        textNum3.setText(String.valueOf(numeros[2]));
    }

    public void ordDesc(int num1, int num2, int num3){
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        textNum1.setText(String.valueOf(numeros[2]));
        textNum2.setText(String.valueOf(numeros[1]));
        textNum3.setText(String.valueOf(numeros[0]));
    }

    public void borrarTodo(){
        textNum1.setText("");
        textNum2.setText("");
        textNum3.setText("");
        inNum1.setText("");
        inNum2.setText("");
        inNum3.setText("");
    }
}