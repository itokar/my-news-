package com.example.pain.athkar;

import android.os.Bundle;
import android.widget.ImageView;

public class Page1 extends MainActivity {

    ImageView play1,play2,play3,pauss1,pauss2,pauss3,zomm1,zomm2,zomm3,less1,less2,less3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play1 = (ImageView)findViewById(R.id.pp1);
        play2 = (ImageView)findViewById(R.id.pp22);
        play3 = (ImageView)findViewById(R.id.pp33);


    }
}
