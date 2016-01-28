package com.pinku.justtry;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by mine on 1/28/2016.
 */
public class CreateMessageActivity extends Activity {
    TextView em;
    Button submit;
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createmessage_activity);

        em = (TextView)findViewById(R.id.message);
        submit=(Button) findViewById(R.id.sendmessage);
    }
}
