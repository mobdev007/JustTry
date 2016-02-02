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
public class WeekActivity extends Activity implements AdapterView.OnItemClickListener,View.OnClickListener{
    ListView days;
    ArrayList al=new ArrayList();

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
        Button b= (Button)findViewById(R.id.button);
        b.setOnClickListener(this);
        days = (ListView)findViewById(R.id.day);
        
        //define a new adapter
        //first parameter=context
        //second parameter=layout of the row
        //third parameter=ID
        //forth array of week
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.days,R.id.text,al);
        al.add("Monday");
        al.add("Tuesday");
        al.add("Wednesday");
        al.add("Thursday");
        al.add("Friday");
        al.add("Saturday");
        al.add("Sunday");
        days.setAdapter(adapter);
        days.setOnItemClickListener(this);
    }
   public void onClick (View v){
               Intent i = new Intent(this,WeekActivity.class);
               startActivity(i);

   }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this,"item is clicked",Toast.LENGTH_SHORT).show();

    }
}

