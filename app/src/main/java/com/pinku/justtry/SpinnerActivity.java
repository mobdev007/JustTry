package com.pinku.justtry;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by mine on 1/29/2016.
 */
public class SpinnerActivity extends Activity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    Spinner sp;
    Button snd;
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        sp = (Spinner)findViewById(R.id.spinner);
        ArrayList al= new ArrayList();

        snd = (Button) findViewById(R.id.sendButton);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,al);
        al.add("afghanistan");
        al.add("albania");
        al.add("algeria");
        al.add("andorra");

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setAdapter(adapter);

        addListenerOnSpinnerItemSelection();

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        sp= (Spinner) findViewById(R.id.spinner);
        snd = (Button) findViewById(R.id.sendButton);
        snd.setOnClickListener(this);
    }

    private void addListenerOnSpinnerItemSelection() {
        sp.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(SpinnerActivity.this, "On Button Click: " +String.valueOf(sp.getSelectedItem()), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        Toast.makeText(SpinnerActivity.this,"On Place Selected",+parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
