package com.antonio.cuponesapp.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.antonio.cuponesapp.R;
import com.google.android.gms.gcm.GoogleCloudMessaging;

/**
 * Created by Antonio on 01/07/2017.
 */

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        //GoBusDB.initializeInstance();
        GoogleCloudMessaging.getInstance(this);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);

                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{

                    Intent intent = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);

                }
            }
        };
        timerThread.start();

    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}
