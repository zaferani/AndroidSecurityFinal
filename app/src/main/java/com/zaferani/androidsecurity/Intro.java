package com.zaferani.androidsecurity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.ZoomControls;

import com.zaferani.androidsecurity.androidsecurity.R;

public class Intro extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        ZoomControls zoom = (ZoomControls) findViewById(R.id.zoomControls);


        final TextView txt_intro = (TextView) findViewById(R.id.txt_intro);

        txt_intro.setText("امنیت اندروید\n" +
                "\n" +
                "با پیشرفت روزافزون تکنولوژی مخصوصا در زمینه IT  اهمیت و نیاز به امنیت و ایجاد محیط های امن برای استفاده از نرم افزارهای مختلف و تبادل اطلاعات یکی از بزرگترین دغدقه های موجود برای کاربران عادی و صاحبان مشاغل شده است که سالانه مبالغ زیادی را به صنایع مختلف تحمیل میکند.\n" +
                "\n" +
                "نکته قابل تامل اینست که هر دو دسته کاربران عادی و صاحبان مشاغل در معرض خطر هستند . زیرا هر دو دسته کاربران اطلاعاتی دارند که برایشان هایز اهمیت و مهم میباشد. \n" +
                "\n" +
                "دسته بندی کاربران :\n" +
                "\n" +
                "دسته اول : اطلاعات شخصی کاربران خانگی که میتواند در هر دو حالت از بین رفتن یا در معرض عموم قرار گرفتن مشکلات جبران ناپذیری را برای افراد بوجود آورد.");


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

               x[0] =  txt_intro.getTextSize();


                x[0] = x[0] + 1 ;


                txt_intro.setTextSize(x[0]);
            }
        });






    }

}
