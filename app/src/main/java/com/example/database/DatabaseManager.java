package com.example.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseManager extends SQLiteOpenHelper {

    public DatabaseManager(Context context){
        super(context, "WrestlerDB", null, 1);
    }

    public void onCreate(SQLiteDatabase db){
        String sql = "create table WrestlerTable(";
        sql += "id integer primary key autoincrement, ";
        sql += "name text, nickname text, finisher text)";
        db.execSQL(sql);
    }

    public void insert(String wrestlerName, String nicknameName, String finisherName){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "insert into WrestlerTable values(";
        sql += "null, '"+wrestlerName+"', '"+nicknameName+"', '"+finisherName+"')";
        db.execSQL(sql);
        db.close();
    }

    public void updateByTitle(String name, String nickname, String finisher){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "update WrestlerTable set nickname = '"+nickname+"'";
        sql += "where wrestler = '"+name+"'";
        db.execSQL(sql);
        db.close();
    }

    public ArrayList<String> getNames(){
        ArrayList<String> list = new ArrayList<String>();
        SQLiteDatabase db = getWritableDatabase();
        String sql = "select * from WrestlerTable";
        Cursor cursor = db.rawQuery(sql, null);
        while(cursor.moveToNext()) {
            String name = cursor.getString(1);
            list.add(name);
        }
        db.close();
        return list;
    }

    public String[] get(String wrestlerName){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "select * from WrestlerTable where title = '"+wrestlerName+"'";
        Cursor cursor = db.rawQuery(sql, null);
        String[] entry = new String[3];
        if (cursor.moveToFirst()){
            String name = cursor.getString(1);
            String nickname = cursor.getString(2);
            String finisher = cursor.getString(3);
            entry[0] = name;
            entry[1] = nickname;
            entry[2] = finisher;
        }
        db.close();
        return entry;
    }

    public ArrayList<String> getNickname (String nickName){
        SQLiteDatabase db = getWritableDatabase();
        ArrayList<String> list = new ArrayList<String>();
        String sql = "select * from WrestlerTable where nickname = '"+nickName+"'";
        Cursor cursor = db.rawQuery(sql, null);
        while(cursor.moveToNext()) {
            String nickname = cursor.getString(1);
            list.add(nickname);
        }
        db.close();
        return list;
    }

    public void delete (String deleteWrestler){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "delete from WrestlerTable where name = '"+deleteWrestler+"'";
        db.execSQL(sql);
        db.close();
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
