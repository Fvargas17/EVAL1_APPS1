package com.example.eva1_6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnListener,btnAnonima,btnPorClase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btnListener);
        btnAnonima = findViewById(R.id.btnAnonima);
        btnPorClase = findViewById(R.id.btnPorClase);

        btnListener.setOnClickListener(this);
        btnAnonima.setOnClickListener(new View.OnClickListener(){
             @Override
            public void onClick(View view){
                 Toast.makeText(getApplicationContext(),"EVENTO POR CLASE ANÓNIMA",Toast.LENGTH_LONG).show();
             }
        });
        MiClaseOnClick objClick = new MiClaseOnClick();
        objClick.setContext(this);
        btnPorClase.setOnClickListener(objClick);

    }

    //USANDO LA PROPIEDAD android:onClick DEL WIDGET
    //NOMBREDELMETODO(View arg){}
    //LOS VIEWS SON CLASE, WIDGETS, AREA REECTANGUALR DONDE SE DIBUJA EL WIDGET,

    public void miClick(View arg){
        //MOSTRAR UN MENSAJE (TOAST)
        Toast.makeText(this,"EVENTO POR ONCLICK XML",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"EVENTO POR LISTENER",Toast.LENGTH_LONG).show();
    }

}