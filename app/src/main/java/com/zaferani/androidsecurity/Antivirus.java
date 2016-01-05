package com.zaferani.androidsecurity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import com.zaferani.androidsecurity.androidsecurity.R;

public class Antivirus extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antiviruses);


        Button btnavast       = (Button) findViewById(R.id.btn_avast);
        Button btnbitdefender = (Button) findViewById(R.id.btn_bitdefender);
        Button btnkaspersky   = (Button) findViewById(R.id.btn_kaspersky);
        Button btnavg         = (Button) findViewById(R.id.btn_avg);
        Button btnlookout     = (Button) findViewById(R.id.btn_lookout);
        Button btnsymantec    = (Button) findViewById(R.id.btn_norton);
        Button btndrweb       = (Button) findViewById(R.id.btn_drweb);
        Button btneset        = (Button) findViewById(R.id.btn_eset);
        Button btntrustgo     = (Button) findViewById(R.id.btn_trustgo);
        Button btnzoner       = (Button) findViewById(R.id.btn_zoner);
        Button btn360         = (Button) findViewById(R.id.btn_360);
        Button btnavira       = (Button) findViewById(R.id.btn_avira);


        btnavast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                startActivity(new Intent(Antivirus.this, Avast.class));

            }
        });

        btnbitdefender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                startActivity(new Intent(Antivirus.this, Bitdefender.class));

            }
        });

        btnkaspersky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                startActivity(new Intent(Antivirus.this, Kaspersky.class));

            }
        });

        btnavg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                startActivity(new Intent(Antivirus.this, Avg.class));

            }
        });

        btnlookout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                startActivity(new Intent(Antivirus.this, Lookout.class));

            }
        });

        btnsymantec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                startActivity(new Intent(Antivirus.this, Symantec.class));

            }
        });

        btndrweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                startActivity(new Intent(Antivirus.this, Drweb.class));

            }
        });

        btneset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                startActivity(new Intent(Antivirus.this, Eset.class));

            }
        });

        btntrustgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                startActivity(new Intent(Antivirus.this, Trustgo.class));

            }
        });

        btnzoner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                startActivity(new Intent(Antivirus.this, Zoner.class));

            }
        });

        btn360.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                startActivity(new Intent(Antivirus.this, A360.class));

            }
        });

        btnavira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                startActivity(new Intent(Antivirus.this, Avira.class));

            }
        });


    }

}
