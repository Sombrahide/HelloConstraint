package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int _contador;
    public TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sumarContador(View view){
        _contador = _contador + 1;
        texto = findViewById(R.id.show_count);
        String aTexto = Integer.toString(_contador);
        texto.setText(aTexto);
    }
    public void borrarContador(View view){
        _contador = 0;
        texto = findViewById(R.id.show_count);
        String aTexto = Integer.toString(_contador);
        texto.setText(aTexto);
    }
}
