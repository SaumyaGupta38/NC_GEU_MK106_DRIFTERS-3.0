package com.example.true_mentor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebView2 extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view2);

        webView = findViewById(R.id.web_View2);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://truementor.herokuapp.com/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    public void tryAgain (View view) {

        Intent intent = new Intent(this, WebView1.class);
        startActivity(intent);

    }

    public void Developers (View view){

        Intent intent = new Intent(this,Developers.class);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {

        if(webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }

}