package com.miempresa.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Calculadora mcalculadora;

    private EditText mPrimerOperador;
    private EditText mSegundoOperador;
    private EditText mResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mcalculadora = new Calculadora();
        mPrimerOperador = (EditText)findViewById(R.id.edt_primerOperador);
        mSegundoOperador = (EditText)findViewById(R.id.edt_primerOperador2);
        mResultado = (EditText)findViewById(R.id.edt_resultado);

        ((Button)findViewById(R.id.btn_suma)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(Calculadora.Operador.sum);
            }
        });
        ((Button)findViewById(R.id.btn_resta)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(Calculadora.Operador.res);
            }
        });
        ((Button)findViewById(R.id.btn_multiplicacion)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(Calculadora.Operador.multi);
            }
        });
        ((Button)findViewById(R.id.btn_division)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(Calculadora.Operador.div);
            }
        });


    }
    private void Calcular(Calculadora.Operador operador){
        double operadorUno;
        double operadorDos;

        operadorUno = obtenerOperador(mPrimerOperador);
        operadorDos = obtenerOperador(mSegundoOperador);
        String resultado;

        switch (operador){
            case sum:
                resultado =String.valueOf(mcalculadora.suma(operadorUno,operadorDos));
                break;
            case res:
                resultado =String.valueOf(mcalculadora.resta(operadorUno,operadorDos));
                break;
            case multi:
                resultado=String.valueOf(mcalculadora.multiplicacion(operadorUno,operadorDos));
                break;
            case div:
                if(operadorDos==0){
                    Toast.makeText(this,"Divisor es 0",Toast.LENGTH_SHORT);
                    return;
                }

                resultado=String.valueOf(mcalculadora.division(operadorUno,operadorDos));
                break;
            default:
                resultado="NaN";
                break;
        }
        mResultado.setText(resultado);
    }

    private static Double obtenerOperador(EditText operadorText){

        String operador = operadorText.getText().toString();
        return Double.valueOf(operador);
    }





}