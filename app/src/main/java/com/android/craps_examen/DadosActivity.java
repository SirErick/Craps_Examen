package com.android.craps_examen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DadosActivity extends AppCompatActivity {
    Drawable drawable1 ;
    Drawable drawable2 ;
    Drawable drawable3 ;
    Drawable drawable4;
    Drawable drawable5 ;
    Drawable drawable6, drawableg, drawablep, drawablepun ;
    ImageView iv,iv2,iv3;int turno=0,suma=0;
    String datos,nom;
    String NAME="name";
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);
        tv = (TextView) findViewById(
                R.id.TextView);
        Intent newint = getIntent();
        nom = newint.getStringExtra(MainActivity.NAME);
        tv.setText(nom);
        drawable1 = this.getResources().getDrawable(R.drawable.uno);
         drawable2 = this.getResources().getDrawable(R.drawable.dos);
         drawable3 = this.getResources().getDrawable(R.drawable.tres);
       drawable4 = this.getResources().getDrawable(R.drawable.cuatro);
         drawable5 = this.getResources().getDrawable(R.drawable.cinco);
       drawable6 = this.getResources().getDrawable(R.drawable.seis);
        drawableg = this.getResources().getDrawable(R.drawable.ganaste);
        drawablep = this.getResources().getDrawable(R.drawable.perdiste);
        drawablepun = this.getResources().getDrawable(R.drawable.punto);
        iv=(ImageView)findViewById(R.id.imageView);
       iv2=(ImageView)findViewById(R.id.imageView2);
        iv3=(ImageView)findViewById(R.id.imageView3);
    }
    public  void Generar(View v){

        turno++;
        int numeroAleatorio = (int) (Math.random()*6+1);
        int numeroAleatorio2 = (int) (Math.random()*6+1);
        suma=numeroAleatorio+numeroAleatorio2;
        tv.setText("La Suma es: " + suma);
        if((suma==7 || suma==11) && turno==1){

            iv3.setImageDrawable(drawableg);
            datos=("GANADOR   "+"Nombre: "+ nom + "  Resultado"+ suma);
            SharedPreferences settings = getSharedPreferences("perfil", MODE_PRIVATE);
            SharedPreferences.Editor editor = settings.edit();
            editor.putString("nombre",datos );
            editor.commit() ;
        }
        if((suma==2 || suma==3 || suma==12) ){
            iv3.setImageDrawable(drawablep);
            datos=("PERDIDA  "+ "Nombre: "+ nom + "   Resultado"+ suma);
            SharedPreferences settings = getSharedPreferences("perfil", MODE_PRIVATE);
            SharedPreferences.Editor editor = settings.edit();
            editor.putString("nombre",datos );
            editor.commit() ;
        }
        if(suma==4 || suma==5 || suma==6  || suma==8  || suma==9 || suma==10 ){
            iv3.setImageDrawable(drawablepun);
            datos=("PUNTO: "+"Nombre: "+ nom + "  Resultado "+ suma);
            SharedPreferences settings = getSharedPreferences("perfil", MODE_PRIVATE);
            SharedPreferences.Editor editor = settings.edit();
            editor.putString("nombre",datos );
            editor.commit() ;
        }
        if(suma==7 || suma==11){
            iv3.setImageDrawable(null);
        }
        if(numeroAleatorio==1){
            iv.setImageDrawable(drawable1);
        }
        if(numeroAleatorio==2){
            iv.setImageDrawable(drawable2);
        }
        if(numeroAleatorio==3){
            iv.setImageDrawable(drawable3);
        }
        if(numeroAleatorio==4){
            iv.setImageDrawable(drawable4);
        }
        if(numeroAleatorio==5){
            iv.setImageDrawable(drawable5);
        }
        if(numeroAleatorio==6){
            iv.setImageDrawable(drawable6);
        }


        if(numeroAleatorio2==1){
            iv2.setImageDrawable(drawable1);
        }
        if(numeroAleatorio2==2){
            iv2.setImageDrawable(drawable2);
        }
        if(numeroAleatorio2==3){
            iv2.setImageDrawable(drawable3);
        }
        if(numeroAleatorio2==4){
            iv2.setImageDrawable(drawable4);
        }
        if(numeroAleatorio2==5){
            iv2.setImageDrawable(drawable5);
        }
        if(numeroAleatorio2==6){
            iv2.setImageDrawable(drawable6);
        }

    }

    public void Mostrar(View v){
        SharedPreferences settings = getSharedPreferences("perfil", MODE_PRIVATE);
        String nombre = settings.getString("nombre", "valorpordefecto");
        Toast.makeText(DadosActivity.this, nombre, Toast.LENGTH_SHORT).show();

    }

}
