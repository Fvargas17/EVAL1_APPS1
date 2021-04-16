package com.example.eva1_8_eventos_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    TextView txtViewNom, txtViewApe;
    EditText edtTextNom, edtTextApe;
    RadioGroup rdGrpIdioma;
    RadioButton rdBtnEsp, rdBtnIng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtViewNom = findViewById(R.id.txtViewNom);
        txtViewApe = findViewById(R.id.txtViewApe);
        edtTextNom = findViewById(R.id.edtTxtNom);
        edtTextApe = findViewById(R.id.edtTxtApe);
        rdGrpIdioma = findViewById(R.id.rdGrpIdioma);
        rdBtnEsp = findViewById(R.id.rdBtnEsp);
        rdBtnIng = findViewById(R.id.rdBtnIng);

        rdGrpIdioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if(i==R.id.rdBtnEsp){
            txtViewNom.setText(R.string.txt_vw_nom);
            edtTextNom.setHint(R.string.edt_txt_nom);
            txtViewApe.setText(R.string.txt_vw_ape);
            edtTextApe.setHint(R.string.edt_txt_ape);
            rdBtnEsp.setText(R.string.rd_btn_es);
            rdBtnIng.setText(R.string.rd_btn_in);
        }else{
            //LUEGO EN INGLES
            txtViewNom.setText(R.string.txt_vw_nom_en);
            edtTextNom.setHint(R.string.edt_txt_nom_en);
            txtViewApe.setText(R.string.txt_vw_ape_en);
            edtTextApe.setHint(R.string.edt_txt_ape_en);
            rdBtnEsp.setText(R.string.rd_btn_en);
            rdBtnIng.setText(R.string.rd_btn_in_en);
        }
    }
}