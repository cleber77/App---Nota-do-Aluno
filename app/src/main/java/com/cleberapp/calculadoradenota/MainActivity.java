package com.cleberapp.calculadoradenota;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1,n2,n3,n4,numeroFaltas;
    private Button btCalcula;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            n1 = findViewById(R.id.nota1);
            n2 =findViewById(R.id.nota2);
            n3 = findViewById(R.id.nota3);
            n4 = findViewById(R.id.nota4);
            numeroFaltas =findViewById(R.id.numeroFalta);
            btCalcula = findViewById(R.id.bt_calcular);
            textResultado = findViewById(R.id.txt_resultado);

         btCalcula.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 int nota1 = Integer.parseInt(n1.getText().toString());
                 int nota2 = Integer.parseInt(n2.getText().toString());
                 int nota3 = Integer.parseInt(n3.getText().toString());
                 int nota4 = Integer.parseInt(n4.getText().toString());
                 int numero_falta = Integer.parseInt(numeroFaltas.getText().toString());
                 int media = (nota1 + nota2 + nota3 + nota4) /4;

                 if (media >=5 && numero_falta <=20){
                     textResultado.setText("aluno foi Aprovado  \n " + " Média fina:" + media);
                     textResultado.setTextColor(getColor(R.color.green));

                 }else if (numero_falta > 20){
                     textResultado.setText("Aluno foi Reprovado  \n" + "Média final:" +media);
                     textResultado.setTextColor(getColor(R.color.red));

                 }else if (media <5){
                   textResultado.setText("Aluno Reprovado por Nota  \n" + "Média final" + media);
                   textResultado.setTextColor(getColor(R.color.red));
                 }







             }
         });
    }
}