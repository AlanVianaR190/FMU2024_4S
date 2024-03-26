package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //variaveis
    private EditText editTextext;

    private EditText editTextext2;

    private EditText editTextext3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextext = findViewById(R.id.editTextText);
        editTextext2 = findViewById(R.id.editTextText2);
        editTextext3 = findViewById(R.id.editTextText3);

    }

    //metodo
    public void somar(View view){

        int x = Integer.parseInt(editTextext.getText().toString());
        int y = Integer.parseInt(editTextext2.getText().toString());
        int soma = x + y;
        editTextext3.setText(Integer.toString(soma));

    }

    public void abrirJanela(View view){
        int x = Integer.parseInt(editTextext.getText().toString());
        int y = Integer.parseInt(editTextext2.getText().toString());
        int soma = x + y;
        String msg = Integer.toString(soma);
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("soma",msg);
        startActivity(intent);
    }

}