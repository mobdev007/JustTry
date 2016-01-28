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

        rm = (TextView)findViewById(R.id.receivemessage);
        back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String message = rm.getText().toString();
        Intent i = new Intent();
        i.putExtra("MESSAGE",message);
        setResult(2,i);
        finish();

    }
    protected void onActivityResult (int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 2)
        {
            String Message = data.getStringExtra("message");
            rm.setText(Message);
        }
    }
}
