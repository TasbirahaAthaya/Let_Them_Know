package com.example.asus.letthemknow1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class jobActivity extends AppCompatActivity {

    public static String n;

    EditText editName,editAge,editFather,editMother,editAddress,editPhone,editR_name,editR_age,
    editR_father,editR_Address,editOccupation,editNID,editR_phone,editInstitution;
    Button btnAddData;
    Button btnView;
    DatabaseHelper mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);

        mDb = new DatabaseHelper(getApplicationContext());

        editName = (EditText)findViewById(R.id.name);
        editAge = (EditText)findViewById(R.id.age);
        editFather = (EditText)findViewById(R.id.father);
        editMother = (EditText)findViewById(R.id.mother);
        editAddress = (EditText)findViewById(R.id.address);
        editPhone = (EditText)findViewById(R.id.phone);
        editR_name = (EditText)findViewById(R.id.Rname);
        editR_age = (EditText)findViewById(R.id.Rage);
        editR_father = (EditText)findViewById(R.id.Rfather);
        editR_Address = (EditText)findViewById(R.id.Raddress);
        editOccupation = (EditText)findViewById(R.id.Roccupation);
        editNID = (EditText)findViewById(R.id.nid);
        editR_phone = (EditText)findViewById(R.id.Rphone);
        editInstitution = (EditText)findViewById(R.id.institution);

        btnAddData = (Button)findViewById(R.id.Button_submit);

        //Submit();
        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDb.addNewPerson(new AddInfo(editName.getText().toString(),
                        editAge.getText().toString(), editFather.getText().toString(), editMother.getText().toString(),
                        editAddress.getText().toString(), editPhone.getText().toString(), editR_name.getText().toString(),
                        editR_age.getText().toString(), editR_father.getText().toString(), editR_Address.getText().toString(),
                        editOccupation.getText().toString(), editNID.getText().toString(),
                        editR_phone.getText().toString(), editInstitution.getText().toString()));

                Toast.makeText(jobActivity.this, "Added new person! ", Toast.LENGTH_SHORT).show();

            }
        });

    }


}
