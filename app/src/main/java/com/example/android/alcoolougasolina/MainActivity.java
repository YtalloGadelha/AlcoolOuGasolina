package com.example.android.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);
        textoResultado =  (TextView) findViewById(R.id.textoResultadoId);

        botaoVerificar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if(id == R.id.botaoVerificarId){

           //Recuperando os valores digitados e convertendo para Strings
            String textoPrecoAlcool = precoAlcool.getText().toString();
            String textoPrecoGasolina = precoGasolina.getText().toString();

            //Convertendo os valores de String para números
            Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
            Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

            //alcool / gasolina

            double resultado = valorAlcool/valorGasolina;

            if(resultado >= 0.7){
                textoResultado.setText("É melhor utilizar Gasolina!!!");
            }else{
                textoResultado.setText("É melhor utilizar Álcool!!!");
            }

        }

    }
}
