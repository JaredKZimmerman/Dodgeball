package com.example.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseManager extends SQLiteOpenHelper {

    public DatabaseManager(Context context){
        super(context, "Players", null, 1);
    }

    public void onCreate(SQLiteDatabase db){
        String sql = "create table PlayerTable(";
        sql += "id integer primary key autoincrement, ";
        sql += "name text, PID text)";
        db.execSQL(sql);
    }

    public void insert(String playerName, int pID){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "insert into WrestlerTable values(";
        sql += "null, '"+playerName+"', '"+pID+"')";

        db.execSQL(sql);
        db.close();
    }

    /*public void updateByTitle(String name, String PID, String finisher){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "update PlayerTable set PID = '"+PID+"'";
        sql += "where wrestler = '"+name+"'";
        db.execSQL(sql);
        db.close();
    }*/

    public ArrayList<String> getNames(){
        ArrayList<String> list = new ArrayList<String>();
        SQLiteDatabase db = getWritableDatabase();
        String sql = "select * from PlayerTable";
        Cursor cursor = db.rawQuery(sql, null);
        while(cursor.moveToNext()) {
            String name = cursor.getString(1);
            list.add(name);
        }
        db.close();
        return list;
    }

    public String[] get(String playerName){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "select * from PlayerTable where title = '"+playerName+"'";
        Cursor cursor = db.rawQuery(sql, null);
        String[] entry = new String[3];
        if (cursor.moveToFirst()){
            String name = cursor.getString(1);
            String PID = cursor.getString(2);
            entry[0] = name;
            entry[1] = PID;
        }
        db.close();
        return entry;
    }

    public ArrayList<String> getPID (String PID){
        SQLiteDatabase db = getWritableDatabase();
        ArrayList<String> list = new ArrayList<String>();
        String sql = "select * from PlayerTable where PID = '"+PID+"'";
        Cursor cursor = db.rawQuery(sql, null);
        while(cursor.moveToNext()) {
            String pID = cursor.getString(1);
            list.add(pID);
        }
        db.close();
        return list;
    }

    /*public void delete (String deleteWrestler){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "delete from WrestlerTable where name = '"+deleteWrestler+"'";
        db.execSQL(sql);
        db.close();
    }*/

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
