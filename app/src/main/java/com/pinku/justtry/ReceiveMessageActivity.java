package com.pinku.justtry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by mine on 1/28/2016.
 */
public class ReceiveMessageActivity extends Activity implements View.OnClickListener {
    TextView rm;
    Button back;
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receivemessage_activity);
        Bundle bundle= getIntent().getExtras();
        String message= bundle.getString("message");

        rm = (TextView)findViewById(R.id.receivemessage);
        rm.setText(message);
        back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        Intent i = new Intent(this,CreateMessageActivity.class);
        startActivity(i);

    }

}
