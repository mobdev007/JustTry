package com.pinku.justtry;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mine on 1/29/2016.
 */
public class DialogActivity extends Activity implements View.OnClickListener {

    Button dB;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        dB = (Button) findViewById(R.id.dialogButton);
        dB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Can you see the dialog box appear?");

        alertDialogBuilder.setPositiveButton("No", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent in = new Intent(DialogActivity.this,DialogActivity.class);
                startActivity(in);
            }
        });

        alertDialogBuilder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(DialogActivity.this,RespondDialogActivity.class);
                startActivity(i);
            }

        });

        alertDialogBuilder.show();
    }
}
