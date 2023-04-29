package com.shahadat.bmicalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

 EditText edWaight,edFeet,edInch;
 Button buttonCalculate;
 TextView tvResult;
 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      edWaight = findViewById(R.id.edWaight);
      edFeet = findViewById(R.id.edFeet);
      edInch = findViewById(R.id.edInch);
      buttonCalculate = findViewById(R.id.button);
      tvResult = findViewById(R.id.TvResult);
      

 buttonCalculate.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {

         String sWaight = edWaight.getText().toString();
         String sFeet = edFeet.getText().toString();
         String sInch = edInch.getText().toString();

         if(sWaight.length()>0 && sFeet.length()>0 && sInch.length() >0){

             //..........................................................................


             float Waight = Float.parseFloat(sWaight);
             float Feet = Float.parseFloat(sFeet);
             float Inch = Float.parseFloat(sInch);

             float Haight = (float) (Feet* 0.3048 + Inch* 0.0254);
             float Index = Waight/ (Haight*Haight);

             if( Index> 24 ){
                 tvResult.setText("BMI Index is :"+Index+"\n Vai tumi mota");
             } else if (Index> 18){
                 tvResult.setText("BMI Index is :"+Index+"\n Vai tumi thik acho");
             } else {
                 tvResult.setText("BMI Index is :"+Index+"\n Vai tumi chikon");
             }

             //..........................................................................

         }else {
             edWaight.setError("Please file the box");
             edFeet.setError("Please file the box");
             edInch.setError("Please file the box");
         }


     }
 });







    }




}