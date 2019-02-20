package com.example.examen1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTextView1;
    TextView txtTextView2;
    TextView txtTextView3;
    TextView txtTextView4;
    TextView txtTextView5;
    TextView txtTextView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTextView1 = (TextView) findViewById(R.id.textView);
        txtTextView2 = (TextView) findViewById(R.id.textView2);
        txtTextView3 = (TextView) findViewById(R.id.textView3);
        txtTextView4 = (TextView) findViewById(R.id.textView4);
        txtTextView5 = (TextView) findViewById(R.id.textView5);
        txtTextView6 = (TextView) findViewById(R.id.textView6);

        txtTextView1.setText("Alita");
        txtTextView2.setText("Una mujer/cyborg con ojos saltones hará todo lo posible por encontrar su origen mientras escapa de sus asesinos");
        txtTextView3.setText("Glass");
        txtTextView4.setText("La secuela a la aclamada pelicula Split, en la que el personaje principal tiene varias personalidades");
        txtTextView5.setText("Lego Movie 2");
        txtTextView6.setText("Legos animados por computadora se encontraran en una aventura por el mundo de lego");

        

    }
}
