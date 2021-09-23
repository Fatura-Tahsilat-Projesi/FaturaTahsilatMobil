package com.yazilimcaorg.faturatahsilat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView)  findViewById(R.id.webView);
        myWebView.loadUrl("http://faturatahsilat.yazilimca.org");
        //myWebView.loadUrl("https://faturatahsilatfronstatic.z22.web.core.windows.net");
        WebSettings settings = myWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
    }


}