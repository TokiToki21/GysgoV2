package com.gysgo.raam.gysgo;

import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class MasterListActivity extends AppCompatActivity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_list);
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Test 1");
        listDataHeader.add("Test 2");
        listDataHeader.add("Test 3");

        // Adding child data
        List<String> Test1 = new ArrayList<String>();
        Test1.add("something");
        Test1.add("something");
        Test1.add("something");
        Test1.add("something");
        Test1.add("something");
        Test1.add("something");
        Test1.add("something");

        List<String> Test2 = new ArrayList<String>();
        Test2.add("something");
        Test2.add("something");
        Test2.add("something");
        Test2.add("something");
        Test2.add("something");
        Test2.add("something");

        List<String> Test3 = new ArrayList<String>();
        Test3.add("something");
        Test3.add("something");
        Test3.add("something");
        Test3.add("something");
        Test3.add("something");

        listDataChild.put(listDataHeader.get(0), Test1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), Test2);
        listDataChild.put(listDataHeader.get(2), Test3);
    }
}