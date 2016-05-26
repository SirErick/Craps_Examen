package com.android.craps_examen;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends Activity {
    private EditText Caja;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Caja =(EditText) findViewById(R.id.edittext);
        Button botonuno =(Button) findViewById(R.id.boton1);
        //Button botondos =(Button) findViewById(R.id.boton2);
        botonuno.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String nombre=Caja.getText().toString();
                SharedPreferences settings = getSharedPreferences("perfil", MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("nombre",nombre );
                editor.commit() ;
                Intent i = new Intent(MainActivity.this, DadosActivity.class);
                startActivity(i);

            }
        });
        /*
        botondos.setOnClickListener(new View.OnClickListener(){ // llave 1
            public void onClick(View view){ // llave 0
                SharedPreferences settings = getSharedPreferences("perfil", MODE_PRIVATE);
                String nombre = settings.getString("nombre", "valorpordefecto");
                    Toast.makeText(MainActivity.this, nombre, Toast.LENGTH_SHORT).show();
            }
        });
        */

    }
}