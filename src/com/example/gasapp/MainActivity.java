package com.example.gasapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.*;
import android.app.*;
import java.text.DecimalFormat;

import com.example.gasapp.MainActivity;

@SuppressWarnings("unused")
public class MainActivity extends Activity {
	
	EditText kmpor,tempo,velocidade;
    Button calcular;
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        kmpor = (EditText) findViewById(R.id.kmpor);
        tempo = (EditText) findViewById(R.id.txttempo);
        velocidade = (EditText) findViewById(R.id.txtvel);
        calcular = (Button) findViewById(R.id.calcular);
        
        
        calcular.setOnClickListener(new View.OnClickListener() {

        	 @Override
        	 public void onClick(View arg0) {

        	 double temp = Double.parseDouble(tempo.getText().toString());
        	 double vel = Double.parseDouble(velocidade.getText().toString());
        	 double kmporl = Double.parseDouble(kmpor.getText().toString());
        	 
        	 double distancia = temp*vel;
        	 double  litros = distancia/kmporl;      	 
        	 
        	 
        	 AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
      	    dialogo.setTitle("litros");
  	    	dialogo.setMessage("A Qantidade de litros é: "+ litros);
  	    	dialogo.setNeutralButton("OK", null);
  	    	dialogo.show();
        	 
        	 
        	 
        	 
        	

        	

        	 }
        	}); 
    }	

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
