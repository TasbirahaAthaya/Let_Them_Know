package com.example.asus.letthemknow1;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class treaserActivity extends AppCompatActivity {

    EditText editName,editFatherName;
    DatabaseHelper db;
    Button btnTrace;
    String n;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treaser);
        btnTrace=(Button)findViewById(R.id.trace);
        editName=(EditText)findViewById(R.id.Name);
        editFatherName=(EditText)findViewById(R.id.fatherName);


    }


    public void click(View v) {
        n = editName.getText().toString();
        Intent i2=new Intent(treaserActivity.this,Show.class);
        i2.putExtra("key",n);
        startActivity(i2);
    }

}
