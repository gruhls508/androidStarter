package com.webstaurantstore.gruhl.mysecondapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    TextView mainTextView;
    Button mainButton;
    EditText mainEditText;
    ListView mainListVew;
    ArrayAdapter mArrayAdapter;
    ArrayList mNameList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTextView = (TextView) findViewById(R.id.main_textview);
        mainTextView.setText("Set in javaaa");

        mainButton = (Button) findViewById(R.id.main_button);
        mainButton.setOnClickListener(this);

        mainEditText = (EditText) findViewById(R.id.main_editText);

        mainListVew = (ListView) findViewById(R.id.main_listview);

        mArrayAdapter = new ArrayAdapter(this,
                        android.R.layout.simple_list_item_1,
                        mNameList);

        mainListVew.setAdapter(mArrayAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public void onClick(View v) {
        mainTextView.setText(mainEditText.getText().toString()
                        + " is doing the android shuffle.");
//        mNameList.add(mainEd)
    }
}
