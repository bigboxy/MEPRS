package boxell.hotmail.meprs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
//import SQLite database add on



public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "users.db";
    public static final String TABLE_NAME = "localUsers_table";
    public static final String COL_1 = "userNumber";
    public static final String COL_2 = "firstName";
    public static final String COL_3 = "secondName";
    public static final String COL_4 = "age";
    public static final String COL_5 = "medicalConditions";
    //create database and table variables, these will be used to create the database



    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase(); //temp code for testing
    //main constructor for database
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(COL_1 INTEGER PRIMARY KEY AUTOINCREMENT, COL_2 TEXT, COL_3 TEXT, COL_4 INT, COL_5 TEXT )");
    // sqlite on create method
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    // sqlite upgrade method
    }

    public boolean insertData (String firstName, String secondName, Integer age, String medicalConditions) {

    }
}
