package com.example.exe4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText pegaAnoNasc;
    EditText pegaAnoAct;
    TextView saida;
    TextView saida1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular (View view){
         pegaAnoNasc =findViewById(R.id.editTextTextPersonName);
         pegaAnoAct  =findViewById(R.id.editTextTextPersonName2);
         saida=findViewById(R.id.textView);
        saida1 =findViewById(R.id.textView2);

        int anoNasc=Integer.parseInt(pegaAnoNasc.getText().toString());
        int anoAct=Integer.parseInt(pegaAnoAct.getText().toString());

        int idadeAct=anoAct - anoNasc;
        int idade2 = 2050-anoNasc;

        saida.setText("Idade Atual: "+String.valueOf(idadeAct)+"Anos");
        saida1.setText("Idade em 2050: "+String.valueOf(idade2)+"Anos");
    }
}