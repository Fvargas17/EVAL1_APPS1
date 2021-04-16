package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdGrpComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpComida = findViewById(R.id.rdGrpComida);
        //ASIGNAR EL LISTENER
        rdGrpComida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //TOAST INDICANDO CUAL RADIOBUTTON FUE SELECCIONADO
                /*switch (i){
                    case R.id.radioButton:
                        Toast.makeText(getApplicationContext(),,Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(),"DOS",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(getApplicationContext(),"TRES",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(getApplicationContext(),"CUATRO",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton5:
                        Toast.makeText(getApplicationContext(),"CINCO",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton6:
                        Toast.makeText(getApplicationContext(),"SEIS",Toast.LENGTH_SHORT).show();
                        break;
                }*/
                RadioButton rdBtnSel = findViewById(i); //TE MANDA EL RADIOBTN seleccionado
                Toast.makeText(getApplicationContext(), rdBtnSel.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}