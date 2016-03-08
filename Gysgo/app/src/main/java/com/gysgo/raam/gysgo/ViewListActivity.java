package com.gysgo.raam.gysgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ViewListActivity extends AppCompatActivity {
    // initializing variables
    ExpandableListAdapter listingViewAdapter;
    ExpandableListView expUserListView;
    List<String> listItemTitle;
    HashMap<String, List<String>> listItemChild;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);
        // get the list view
        expUserListView = (ExpandableListView)findViewById(R.id.userlistView);
        // operate list data
        opListData();
        listingViewAdapter = new ExpandableListAdapter(this, listItemTitle,listItemChild);
        // setting list adapter
        expUserListView.setAdapter(listingViewAdapter);
    }
    public void opListData(){
        listItemTitle = new ArrayList<String>();
        listItemChild = new HashMap<String,List<String>>();

        // adding child data
        listItemTitle.add("List1");
        listItemTitle.add("List2");
        listItemTitle.add("List3");

        // adding items to child data
        List<String> Test1 = new ArrayList<String>();
        List<String> Test2 = new ArrayList<String>();
        List<String> Test3 = new ArrayList<String>();
        for (int i = 1; i <= 10;i++){
            Test1.add("Item "+i);
            Test2.add("Item "+i);
            Test3.add("Item "+i);
        }

        listItemChild.put(listItemTitle.get(0),Test1);
        listItemChild.put(listItemTitle.get(1),Test2);
        listItemChild.put(listItemTitle.get(2),Test3);
    }
}
