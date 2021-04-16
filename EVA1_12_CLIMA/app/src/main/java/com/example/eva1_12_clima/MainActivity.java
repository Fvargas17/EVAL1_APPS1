package com.example.eva1_12_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Clima[] aClimaCd = {
            new Clima(R.drawable.sunny,"Chihuahua",15,"Despejado con viento"),
            new Clima(R.drawable.atmospher,"Delicias",28,"Mucho viento"),
            new Clima(R.drawable.cloudy,"Cuauhtemoc",15,"Nublado"),
            new Clima(R.drawable.light_rain,"Juarez",10,"Brisa primaveral"),
            new Clima(R.drawable.rainy,"Camargo",28,"Lluvioso"),
            new Clima(R.drawable.snow,"Parral",30,"Chubascos de nieve"),
            new Clima(R.drawable.thunderstorm,"Buenaventura",23,"Tormenta eléctrica"),
            new Clima(R.drawable.tornado,"Villa Ahumada",12,"Tornadoo"),
            new Clima(R.drawable.sunny,"Chihuahua",15,"Soleadísimo"),
            new Clima(R.drawable.light_rain,"Juarez",10,"Hay algo de lluvia"),

    };
    ListView lstVwClima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter(new ClimaAdaptador(this,R.layout.mi_lista_clima,aClimaCd));
    }
}