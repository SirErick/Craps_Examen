package com.android.craps_examen;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DadosActivity extends AppCompatActivity {
    Drawable drawable1 ;
    Drawable drawable2 ;
    Drawable drawable3 ;
    Drawable drawable4;
    Drawable drawable5 ;
    Drawable drawable6 ;
    ImageView iv,iv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        drawable1 = this.getResources().getDrawable(R.drawable.uno);
         drawable2 = this.getResources().getDrawable(R.drawable.dos);
         drawable3 = this.getResources().getDrawable(R.drawable.tres);
       drawable4 = this.getResources().getDrawable(R.drawable.cuatro);
         drawable5 = this.getResources().getDrawable(R.drawable.cinco);
       drawable6 = this.getResources().getDrawable(R.drawable.seis);
        iv=(ImageView)findViewById(R.id.imageView);
       iv2=(ImageView)findViewById(R.id.imageView2);

    }
    public  void Generar(View v){


        int numeroAleatorio = (int) (Math.random()*6+1);
        int numeroAleatorio2 = (int) (Math.random()*6+1);
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



}
