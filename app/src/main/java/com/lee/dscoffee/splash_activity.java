package com.lee.dscoffee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by ijaebeom on 15. 4. 16..
 */
public class splash_activity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splash_activity.this, MainActivity.class);
                startActivity(i);

                finish();
            }
        },2000);
    }
}
