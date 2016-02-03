package com.pinku.justtry;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;


/**
 * Created by mine on 2/3/2016.
 */
public class GridActivity extends Activity implements AdapterView.OnItemClickListener {
    GridView gv;
    static final String[] number = new String[]{

            "1","2","3",
            "4","5","6",
            "7","8","9",
            "0"
    };
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearvertical);

        gv = (GridView)findViewById(R.id.textView);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,number);
        gv.setAdapter(adapter);
        gv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,String.valueOf(position+1),Toast.LENGTH_SHORT).show();
    }
}

