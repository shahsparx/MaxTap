package com.example.lenovo.maxtap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Lenovo on 30-05-2015.
 */
public class Folk extends Activity {

        TextView fnl;
        Button bttn;

        @Override
        public void onCreate (Bundle billBi){
        super.onCreate(billBi);

            Intent xo = getIntent();
            final int c = xo.getIntExtra("counter",0);
            setContentView(R.layout.scoreboard);
            bttn = (Button) findViewById(R.id.bVhigh) ;
            fnl = (TextView) findViewById(R.id.bFinal);
            fnl.setText("Your Total is " + c);
            bttn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent lo = new Intent("com.example.lenovo.maxtap.HIGHSCORE");
                    lo.putExtra("c", c);
                    startActivity(lo);
                }
            });


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
