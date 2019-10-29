package com.example.spinners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    final String[] semana = new String[]{"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*ArrayAdapter<String> adaptador = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, semana);

        Spinner opciones = (Spinner)findViewById(R.id.Opciones);
        opciones.setAdapter(adaptador);

        opciones.setOnItemSelectedListener(this);*/

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.colores, R.layout.support_simple_spinner_dropdown_item);

        Spinner colores = (Spinner)findViewById(R.id.Opciones);
        colores.setAdapter(adapter);

        colores.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position,
                               long id) {
        /*Toast x = Toast.makeText(this, "El dia elegido es: "+ semana[position], Toast.LENGTH_SHORT);
        x.show();*/

        String eleccion = parent.getSelectedItem().toString();

        Toast x = Toast.makeText(this, "El color elegido es: "+ eleccion, Toast.LENGTH_SHORT);
        x.show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
