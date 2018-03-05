package com.matheuscristoni.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnDelete;
    private Button btnIgual;
    private Button btnMenos;
    private Button btnMais;
    private Button btnDividido;
    private Button btnVezes;
    private TextView txtResultado;
    private int operador = 5; // 5 representa que nenhum operador foi selecionado
    private boolean resultadoSetado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializaVariaveis();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultadoSetado){
                    txtResultado.setTextSize(20);
                    txtResultado.setText("");
                    resultadoSetado = false;
                }
                txtResultado.setText(txtResultado.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultadoSetado){
                    txtResultado.setTextSize(20);
                    txtResultado.setText("");
                    resultadoSetado = false;
                }
                txtResultado.setText(txtResultado.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultadoSetado){
                    txtResultado.setTextSize(20);
                    txtResultado.setText("");
                    resultadoSetado = false;
                }
                txtResultado.setText(txtResultado.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultadoSetado){
                    txtResultado.setTextSize(20);
                    txtResultado.setText("");
                    resultadoSetado = false;
                }
                txtResultado.setText(txtResultado.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultadoSetado){
                    txtResultado.setTextSize(20);
                    txtResultado.setText("");
                    resultadoSetado = false;
                }
                txtResultado.setText(txtResultado.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultadoSetado){
                    txtResultado.setTextSize(20);
                    txtResultado.setText("");
                    resultadoSetado = false;
                }
                txtResultado.setText(txtResultado.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultadoSetado){
                    txtResultado.setTextSize(20);
                    txtResultado.setText("");
                    resultadoSetado = false;
                }
                txtResultado.setText(txtResultado.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultadoSetado){
                    txtResultado.setTextSize(20);
                    txtResultado.setText("");
                    resultadoSetado = false;
                }
                txtResultado.setText(txtResultado.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultadoSetado){
                    txtResultado.setTextSize(20);
                    txtResultado.setText("");
                    resultadoSetado = false;
                }
                txtResultado.setText(txtResultado.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultadoSetado){
                    txtResultado.setTextSize(20);
                    txtResultado.setText("");
                    resultadoSetado = false;
                }
                txtResultado.setText(txtResultado.getText() + "9");
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultadoSetado){
                    txtResultado.setTextSize(20);
                    txtResultado.setText("");
                    resultadoSetado = false;
                }
                if (txtResultado.getText().length() > 0){
                    txtResultado.setText(txtResultado.getText().subSequence(0, txtResultado.length()-1));
                }
                if (!txtResultado.getText().toString().contains("+") ||
                    !txtResultado.getText().toString().contains("-") ||
                    !txtResultado.getText().toString().contains("*") ||
                    !txtResultado.getText().toString().contains("/")){
                    operador = 5;
                }
            }
        });
        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResultado.getText().length() > 0 && operador == 5){
                    txtResultado.setText(txtResultado.getText() + "+");
                    operador = 0; //Seta operador para +
                }
            }
        });
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResultado.getText().length() > 0 && operador == 5){
                    txtResultado.setText(txtResultado.getText() + "-");
                    operador = 1; //Seta operador para -
                }
            }
        });
        btnVezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResultado.getText().length() > 0 && operador == 5){
                    txtResultado.setText(txtResultado.getText() + "*");
                    operador = 2; //Seta operador para *
                }
            }
        });
        btnDividido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResultado.getText().length() > 0 && operador == 5){
                    txtResultado.setText(txtResultado.getText() + "/");
                    operador = 3; //Seta operador para /
                }
            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valorRetornado = "";
                if (operador == 0){
                    double valA = Double.parseDouble(txtResultado.getText().toString().substring(0, (txtResultado.getText().toString().indexOf('+'))));
                    double valB = Double.parseDouble(txtResultado.getText().toString().substring(txtResultado.getText().toString().indexOf('+')+1));
                    txtResultado.setTextSize(35);
                    txtResultado.setText(String.format("%.2f", valA+valB));
                    resultadoSetado = true;
                }
                else if (operador == 1){
                    double valA = Double.parseDouble(txtResultado.getText().toString().substring(0, (txtResultado.getText().toString().indexOf('-'))));
                    double valB = Double.parseDouble(txtResultado.getText().toString().substring(txtResultado.getText().toString().indexOf('-')+1));
                    txtResultado.setTextSize(35);
                    txtResultado.setText(String.format("%.2f", valA-valB));
                    resultadoSetado = true;
                }
                else if(operador == 2){
                    double valA = Double.parseDouble(txtResultado.getText().toString().substring(0, (txtResultado.getText().toString().indexOf('*'))));
                    double valB = Double.parseDouble(txtResultado.getText().toString().substring(txtResultado.getText().toString().indexOf('*')+1));
                    txtResultado.setTextSize(35);
                    txtResultado.setText(String.format("%.2f", valA*valB));
                    resultadoSetado = true;
                }
                else{
                    double valA = Double.parseDouble(txtResultado.getText().toString().substring(0, (txtResultado.getText().toString().indexOf('/'))));
                    double valB = Double.parseDouble(txtResultado.getText().toString().substring(txtResultado.getText().toString().indexOf('/')+1));
                    if (valB == 0){
                        Toast.makeText(getApplicationContext(), "impossível dividir por zero", Toast.LENGTH_LONG).show();
                        txtResultado.setText("0");
                    }
                    txtResultado.setTextSize(35);
                    resultadoSetado = true;
                }
            }
        });
    }

    private void inicializaVariaveis() {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDelete = findViewById(R.id.btnDelete);
        btnIgual = findViewById(R.id.btnIgual);
        btnMais = findViewById(R.id.btnMais);
        btnMenos = findViewById(R.id.btnMenos);
        btnVezes = findViewById(R.id.btnVezes);
        btnDividido = findViewById(R.id.btnDividido);
        txtResultado = findViewById(R.id.txt_resultado);
    }
}
