package com.pinku.justtry;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by mine on 1/28/2016.
 */
public class ImplicitActivity extends Activity  {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_avtivity);

        Button gl = (Button) findViewById (R.id.googleButton);
//        gl.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
//        Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
//        startActivity(webintent);
//    }
}
