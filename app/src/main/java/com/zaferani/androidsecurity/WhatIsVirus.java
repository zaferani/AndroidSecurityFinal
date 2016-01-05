package com.zaferani.androidsecurity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.ZoomControls;

import com.zaferani.androidsecurity.androidsecurity.R;

public class WhatIsVirus extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_is_virus);

        ZoomControls zoom = (ZoomControls) findViewById(R.id.zoomControls);


        final TextView txt_intro = (TextView) findViewById(R.id.txt_intro);



        final float[] x = new float[1];


        zoom.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                txt_intro.setTextSize(10);
            }
        });


        zoom.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                x[0] = txt_intro.getTextSize();


                x[0] = x[0] + 1;


                txt_intro.setTextSize(x[0]);
            }
        });






    }

}
