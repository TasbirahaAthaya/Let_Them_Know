package com.example.asus.letthemknow1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {
    treaserActivity tr;
    private static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "letThemKnow.db";
    public static final String TABLE_APPLICANT = "APPLICANT_TABLE";
    public static final String A_ID = "ID";
    public static final String NAME = "NAME";
    public static final String A_AGE = "AGE";
    public static final String A_FATHER = "FATHER_NAME";
    public static final String A_MOTHER = "MOTHER_NAME";
    public static final String A_ADDRESS = "ADDRESS";
    public static final String A_PHONE = "PHONE";
    public static final String R_NAME = "RNAME";
    public static final String R_AGE = "RAGE";
    public static final String R_FATHER = "RFATHER_NAME";
    public static final String R_ADDRESS = "RADDRESS";
    public static final String R_OCCUPATION = "OCCUPATION";
    public static final String R_NID = "NID";
    public static final String R_PHONE = "RPHONE";
    public static final String R_INSTITUTE = "INSTITUTION";

    public static final String TABLE_VIDEO = "VIDEO_TABLE";
    public static final String V_ID = "V_ID";
    public static final String V_URL = "URL";
    public static final String V_SUS = "SUSPICION";
    public static final String V_DES = "DESCRIPTION";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String create_table="CREATE TABLE " + TABLE_APPLICANT+" (`"
                + A_ID + "` INTEGER PRIMARY KEY AUTOINCREMENT, `"+ NAME +"` TEXT, `"+ A_AGE +"` TEXT, `"+A_FATHER+"` TEXT, `"+A_MOTHER+"` TEXT, `"+A_ADDRESS +"` TEXT, `"
                + A_PHONE+"` TEXT, `"+ R_NAME+"` TEXT, `"+R_AGE+"` TEXT, `"+R_FATHER+"` TEXT, `"+R_ADDRESS+"` TEXT, `"+R_OCCUPATION+"` TEXT, `"+R_NID+"` TEXT, `"
                + R_PHONE+"` TEXT, `"+R_INSTITUTE+"` TEXT "+")";


        db.execSQL(create_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    void addNewPerson(AddInfo info) {

        System.out.println("HOISE\n\n\n\n\n\n");

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(NAME, info.getName());
        values.put(A_AGE,info.getAge());
        values.put(A_PHONE, info.getA_phone());
        values.put(A_ADDRESS,info.getA_address());
        values.put(A_FATHER,info.getAfather());
        values.put(A_MOTHER,info.getAmother());
        values.put(R_NAME,info.getR_name());
        values.put(R_INSTITUTE,info.getInstitute());
        values.put(R_NID,info.getNid());
        values.put(R_PHONE,info.getR_phone());
        values.put(R_ADDRESS,info.getR_address());
        values.put(R_FATHER,info.getR_father());
        values.put(R_AGE,info.getR_age());
        values.put(R_OCCUPATION,info.getOccupation());

        db.insert(TABLE_APPLICANT, null, values);

        db.close();

    }


    public String[] getAllDataFromTable(String name) {

        SQLiteDatabase db = this.getReadableDatabase();

        String query="select * from " + TABLE_APPLICANT + " where NAME = '"+name+ "'";

        Cursor res = db.rawQuery( query ,null);

        res.moveToFirst();

        String[] p = new String[res.getCount()];

       // if(res.moveToFirst()) {

            int i = 0;

             {


                p[i] = "Applicant's Name: " + res.getString(res.getColumnIndex(NAME + "")) + "\n"
                        + "Applicant's Age: " + res.getString(res.getColumnIndex(A_AGE + "")) + "\n"
                        + "Applicant's Father's Name: " + res.getString(res.getColumnIndex(A_FATHER + "")) + "\n"
                        + "Applicant's Mother's's Name: " + res.getString(res.getColumnIndex(A_MOTHER + "")) + "\n"
                        + "Applicant's Address: " + res.getString(res.getColumnIndex(A_ADDRESS + "")) + "\n"
                        + "Applicant's Phone: " + res.getString(res.getColumnIndex(A_PHONE + "")) + "\n"
                        + "Recruiter's Name: " + res.getString(res.getColumnIndex(R_NAME + "")) + "\n"
                        + "Recruiter's Age: " + res.getString(res.getColumnIndex(R_AGE + "")) + "\n"
                        + "Recruiter's Address: " + res.getString(res.getColumnIndex(R_ADDRESS + "")) + "\n"
                        + "Recruiter's Occupation: " + res.getString(res.getColumnIndex(R_OCCUPATION + "")) + "\n"
                        + "Recruiter's NID: " + res.getString(res.getColumnIndex(R_NID + "")) + "\n"
                        + "Recruiter's Phone: " + res.getString(res.getColumnIndex(R_PHONE + "")) + "\n"
                        + "Recruiter's Institute: " + res.getString(res.getColumnIndex(R_INSTITUTE + "")) + "\n\n"

                ;

                i = i + 1;



        }
        return p;


    }


}
