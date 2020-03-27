package com.example.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseManager extends SQLiteOpenHelper {

    public DatabaseManager(Context context){
        super(context, "MoviesDB", null, 1);
    }

    public void onCreate(SQLiteDatabase db){
        String sql = "create table MovieTable(";
        sql += "id integer primary key autoincrement, ";
        sql += "title text, director text, year text)";
        db.execSQL(sql);
    }

    public void insert(String movieName, String directorName, String yearName){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "insert into MovieTable values(";
        sql += "null, '"+movieName+"', '"+directorName+"', '"+yearName+"')";
        db.execSQL(sql);
        db.close();
    }

    public String[] get(){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "select * from MovieTable";
        Cursor cursor = db.rawQuery(sql, null);
        String[] entry = new String[3];
        if (cursor.moveToFirst()){
            String title = cursor.getString(1);
            String director = cursor.getString(2);
            String year = cursor.getString(3);
            entry[0] = title;
            entry[1] = director;
            entry[2] = year;
        }
        db.close();
        return entry;
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
