package com.example.asus.letthemknow1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class medi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medi);

    }
    public void click1(View view)
    {
        Intent i=new Intent(medi.this,Teenage.class);
                startActivity(i);
    }
    public void click2(View view)
    {
        Intent i=new Intent(medi.this,briddho.class);
        startActivity(i);
    }
    public void click3(View view)
    {
        Intent i=new Intent(medi.this,pregnant.class);
        startActivity(i);
    }

}
