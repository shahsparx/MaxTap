package com.example.lenovo.maxtap;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Lenovo on 01-06-2015.
 */
public class Welcome_screen extends Activity{
    MediaPlayer songy;
    @Override
    protected void onCreate(Bundle welcome) {
        super.onCreate(welcome);
        setContentView(R.layout.welcome);
        songy = MediaPlayer.create(Welcome_screen.this,R.raw.cutt);
        songy.start();
        Thread timer = new Thread()
        {
            public void run(){
                try{


                    sleep(5000);


                }catch (InterruptedException e){
                    e.printStackTrace();

                }finally {


                    Intent po = new Intent("com.example.lenovo.maxtap.MENU");

                    startActivity(po);




                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        songy.release();
        finish();
    }
}
