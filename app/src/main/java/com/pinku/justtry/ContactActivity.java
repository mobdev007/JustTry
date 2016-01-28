package com.pinku.justtry;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.jar.Attributes;

/**
 * Created by mine on 1/27/2016.
 */
public class ContactActivity extends Activity {

    ListView cl;
    ArrayList al=new ArrayList();

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        String[] name={"Pinky","Sweta","Kashyap"};
        String[] number={"+91234567890","+912435648268","+912639475043"};

        cl = (ListView) findViewById(R.id.contact_list);

        String[] from  = new String []{"image1","Name","Number"};
        int[] to = new int[]{R.id.image1,R.id.Name,R.id.Number};
        int images1[]={R.drawable.images1,R.drawable.images1,R.drawable.images1};

        for(int i=0;i<=2;i++)
        {
            HashMap<String,String> hm = new HashMap<String,String>();
            hm.put("image1",Integer.toString(images1[i]));
            hm.put("Name",""+name[i]);
            hm.put("Number",""+number[i]);
            al.add(hm);
        }
        SimpleAdapter adapter=new SimpleAdapter (this,al,R.layout.activity_contact,from,to);
        cl.setAdapter(adapter);

    }
}
