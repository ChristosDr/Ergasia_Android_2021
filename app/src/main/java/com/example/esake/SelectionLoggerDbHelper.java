package com.example.esake;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SelectionLoggerDbHelper extends SQLiteOpenHelper {

    public SelectionLoggerDbHelper(Context c) {
        super(c, "SelectionLogger.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        String sql = "CREATE TABLE selections (ID INTEGER PRIMARY KEY, brand TEXT, model TEXT, timestamp TEXT)";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DELETE FROM selections";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }


}
