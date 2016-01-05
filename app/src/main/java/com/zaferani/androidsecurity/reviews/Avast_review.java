package com.zaferani.androidsecurity.reviews;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.zaferani.androidsecurity.androidsecurity.R;


public class Avast_review extends Activity {




    private WebView mWebView;
    ProgressBar progressBar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avast_review);





        mWebView = (WebView) findViewById(R.id.activity_main_webview);

        progressBar = (ProgressBar) findViewById(R.id.progressBar1);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("http://cafebazaar.ir/redirect/?url=http%3A//itresan.com/61850/%25D8%25A7%25D9%25BE-%25D8%25B1%25D8%25B3%25D8%25A7%25D9%2586-%25D8%25A8%25D8%25B1%25D8%25B1%25D8%25B3%25DB%258C-%25D8%25A2%25D9%2586%25D8%25AA%25DB%258C%25E2%2580%258C%25D9%2588%25DB%258C%25D8%25B1%25D9%2588%25D8%25B3-avast-%25D8%25A8%25D8%25B1%25D8%25A7%25DB%258C-%25D8%25B3%25DB%258C%25D8%25B3%25D8%25AA%25D9%2585.html");
        mWebView.setWebViewClient(new aliwebview());


    }

    private class aliwebview extends WebViewClient{


        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String url)
        {
            webView.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);

            progressBar.setVisibility(view.GONE);
        }
    }


}