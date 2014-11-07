package com.smartplace.thirdapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private ArrayList<ListItem> mArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listTest =(ListView)findViewById(R.id.list_test);
        Button btnUpdate = (Button)findViewById(R.id.btn_update_list);

        mArrayList = new ArrayList<ListItem>();

        ListItem listItem = new ListItem();
        listItem.setHeader("Item 1");
        listItem.setSubHeader("SubItem 1");
        listItem.setImageUser(getResources().getDrawable(R.drawable.image_user));
        mArrayList.add(listItem);

        listItem = new ListItem();
        listItem.setHeader("Item 2");
        listItem.setSubHeader("SubItem 2");
        listItem.setImageUser(getResources().getDrawable(R.drawable.image_user));
        mArrayList.add(listItem);

        final ListItemAdapter listItemAdapter = new ListItemAdapter(getBaseContext(),mArrayList);
        listTest.setAdapter(listItemAdapter);

        listTest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(),mArrayList.get(i).getHeader()+" pressed",Toast.LENGTH_SHORT).show();
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListItem listItem = new ListItem();
                listItem.setHeader("Item " + (mArrayList.size()+1));
                listItem.setSubHeader("SubItem " + (mArrayList.size()+1));
                listItem.setImageUser(getResources().getDrawable(R.drawable.image_user));
                mArrayList.add(listItem);

                listItem = new ListItem();
                listItem.setHeader("Item " + (mArrayList.size()+1));
                listItem.setSubHeader("SubItem " + (mArrayList.size()+1));
                listItem.setImageUser(getResources().getDrawable(R.drawable.image_user));
                mArrayList.add(listItem);

                listItemAdapter.notifyDataSetChanged();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
