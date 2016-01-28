package com.pinku.justtry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by mine on 1/28/2016.
 */
public class CreateMessageActivity extends Activity implements View.OnClickListener {
    EditText em;
    Button submit;
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createmessage_activity);

        em = (EditText)findViewById(R.id.editmessage);
        submit=(Button) findViewById(R.id.sendmessage);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this,ReceiveMessageActivity.class);
        startActivityForResult(i, 2);
    }
}