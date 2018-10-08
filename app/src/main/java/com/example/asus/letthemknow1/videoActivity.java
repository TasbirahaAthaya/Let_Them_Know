package com.example.asus.letthemknow1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class videoActivity extends AppCompatActivity {
    DatabaseHelper db1;
    EditText editUrl,editSuspicious,editDes;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        editUrl=(EditText)findViewById(R.id.urlname);
        editSuspicious=(EditText)findViewById(R.id.personname);
        editDes=(EditText)findViewById(R.id.descname);
        btnSubmit=(Button)findViewById(R.id.Submit);

        TextView tv=(TextView) findViewById(R.id.VideoRemDesc);
        String str="If you or someone you know become a victim of online video scandal, this secti" +
                "on can help you. Through this section you can submit your response to us. We will" +
                " forward it to the concerned authority.";
        tv.setText(str);

    }
    public void submit2(View viw){
        Toast.makeText(videoActivity.this, "Your response is taken under consideration :) ", Toast.LENGTH_SHORT).show();
    }

}
