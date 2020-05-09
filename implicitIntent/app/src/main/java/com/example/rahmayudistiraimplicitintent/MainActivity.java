package com.example.rahmayudistiraimplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {
        switch (view.getId()){
            case R.id.b1 :
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(i1);
                break;
            case R.id.b2 :
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:085287257777"));
                startActivity(i2);
                break;
            case R.id.b3 :
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:20.5937,78.9629"));
                i3.setPackage("com.google.android.apps.maps");
                startActivity(i3);
                break;
        }
    }
}
