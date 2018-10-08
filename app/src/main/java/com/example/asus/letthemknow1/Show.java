package com.example.asus.letthemknow1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Show extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        DatabaseHelper objz = new DatabaseHelper(getApplicationContext());
        TextView tv;
        tv=(TextView)findViewById(R.id.show);

        String rv=getIntent().getStringExtra("key");

        String s = "";
        String[] rec_data = objz.getAllDataFromTable(rv);
        for (int i = 0; i < rec_data.length; i++) {
            s = s + rec_data[i] + "\n\n";
        }
        tv.setText(s);
    }


}
