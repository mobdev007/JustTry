package com.pinku.justtry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by mine on 1/27/2016.
 */
public class CountryActivity extends Activity implements AdapterView.OnItemClickListener, View.OnClickListener {
    ListView cn;
    ArrayList al = new ArrayList();
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        Button b =  (Button)findViewById(R.id.country);
        b.setOnClickListener(this);
        cn =(ListView)findViewById(R.id.countryname);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.country_list,R.id.country,al);
        al.add("afghanistan");
        al.add("albania");
        al.add("algeria");
        al.add("andorra");
        cn.setAdapter(adapter);
        cn.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"Its a name of a country",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Intent i =new Intent(this,CountryDetails.class);
        startActivity(i);
    }
}
