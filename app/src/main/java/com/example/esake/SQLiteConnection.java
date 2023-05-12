package com.example.esake;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.Date;

public class SQLiteConnection {

    private SelectionLoggerDbHelper dbHelper;
    private SQLiteDatabase db;

    SQLiteConnection(Context c) {
        dbHelper = new SelectionLoggerDbHelper(c);
        db = dbHelper.getWritableDatabase();
    }

    public long insert(String team_name, String player) {
        ContentValues values = new ContentValues();
        values.put("team", team_name);
        values.put("player", player);
        values.put("timestamp", new Date(System.currentTimeMillis()).toString());
        long new_id = db.insert("selections", null, values);
        return new_id;

        // To check the insertion: data/data/com.example.carpicker/databases.SelectionLogger.db
        // Open in DB Browser for SQLite

        // OR
        // View > Tool Windows > App Inspection

    }

    public void close() {
        db.close();
    }


}
