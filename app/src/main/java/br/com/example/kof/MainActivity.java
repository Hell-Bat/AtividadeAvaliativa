package br.com.example.kof;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText pokemon;

    Button teste;

    TextView ola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pokemon = findViewById(R.id.Escrita);

        teste = findViewById(R.id.Fogarel);

        ola = findViewById(R.id.carregado);

        teste.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = pokemon.getText().toString();
                String vai = "Olá " + name;
                ola.setText(vai);

            }
        });

        }
}