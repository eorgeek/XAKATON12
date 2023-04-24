package com.example.xakaton.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context) {
        super(context, DbConstant.DATABASE_NAME, null, DbConstant.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DbConstant.CREATE_TABLE_GROUP);
        db.execSQL(DbConstant.CREATE_TABLE_STUDENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DbConstant.DELETE_TABLE_STUDENT);
        db.execSQL(DbConstant.DELETE_TABLE_GROUP);
        onCreate(db);
    }
}



