package com.zaferani.androidsecurity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import com.zaferani.androidsecurity.androidsecurity.R;

public class Eset extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eset);



        Button btnDownloadbazar= (Button) findViewById(R.id.btn_downloadbazar);

        Button btnDownloadgoogleplay= (Button) findViewById(R.id.btn_downloadgoogleplay);


        btnDownloadbazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://cafebazaar.ir/app/com.eset.ems2.gp/?l=fa"));
                startActivity(intent);
            }
        });

        btnDownloadgoogleplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                v1.vibrate(20);

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.eset.ems2.gp"));
                startActivity(intent);

            }
        });

    }

}
