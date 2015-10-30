package com.example.lenovo.maxtap;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;

/**
 * Created by Lenovo on 28-05-2015.
 */

public class Start extends Activity{
    int counter;
    Button tp;
    TextView display;
    public int data=0;
    public EditText et;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tapordie);
        counter=0;
        tp = (Button) findViewById(R.id.bTap) ;
        display = (TextView) findViewById(R.id.bScorey);
        Thread timer = new Thread()
        {
            public void run(){
                try{
                    tp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            counter++;
                            display.setText("SCORE IS " + counter);




                        }
                    });

                        sleep(10000);


                }catch (InterruptedException e){
                    e.printStackTrace();

                }finally {


                    Intent xo = new Intent("com.example.lenovo.maxtap.FOLK");
                    xo.putExtra("counter", counter);
                    startActivity(xo);



                 }







            }
        };
        timer.start();




    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
