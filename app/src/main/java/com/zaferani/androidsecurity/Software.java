package com.zaferani.androidsecurity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import com.zaferani.androidsecurity.androidsecurity.R;

public class Software extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software);

        Button btn_antiviruses = (Button) findViewById(R.id.btn_antiviruses);
        Button btn_firewalls = (Button) findViewById(R.id.btn_firewalls);
        Button btn_otherapps = (Button) findViewById(R.id.btn_otherapps);


        btn_antiviruses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                startActivity(new Intent(Software.this, Antivirus.class));

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);





            }
        });


        btn_firewalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                startActivity(new Intent(Software.this, Firewalls.class));

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);



            }
        });


        btn_otherapps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(Software.this, OtherApps.class));

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);


            }
        });




    }

}
