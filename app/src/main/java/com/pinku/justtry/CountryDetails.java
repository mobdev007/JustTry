package com.pinku.justtry;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by mine on 1/28/2016.
 */
public class CountryDetails extends Activity {
    ListView cd;
    ArrayList al=new ArrayList();

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_country);

        String[] country = {"afghanistan","albania","algeria","andorra"};
        String[] capital = {"Kabul","Tirana","Algerai","Andora lavela"};

        cd = (ListView) findViewById(R.id.contact_list);

        String[] from = new String[] {"afghanistan","name_country","capital"};
        int [] to = new int[]{R.id.afghanistan,R.id.name_country,R.id.capital};
        int images[]={R.drawable.afghanistan,R.drawable.albania,R.drawable.algeria,R.drawable.andorra};

        for (int i=0;i<=3;i++)
        {
            HashMap  hm=new HashMap ();
            hm.put("afghanistan",Integer.toString(images[i]));
            hm.put("name_country",""+country[i]);
            hm.put("capital","" + capital[i]);
            al.add(hm);

            SimpleAdapter adapter = new SimpleAdapter(this,al,R.layout.country,from,to);
            cd.setAdapter(adapter);
        }
    }
}
