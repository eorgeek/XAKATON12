package com.example.xakaton.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.xakaton.Student;

import java.util.ArrayList;
import java.util.List;

public class DbManager {
    private Context context;
    private DbHelper dbHelper;
    private SQLiteDatabase db;

    public DbManager(Context context){
        this.context = context;
        dbHelper = new DbHelper(context);
    }

    //Открытие и закрытие необходимы приработе с БД
    public void openDb(){
        db = dbHelper.getWritableDatabase();
    }
    public void closeDb(){
        db.close();
    }

    //Метод добавления объекта класа юзер в БД
    public void insertUserToDb(Student student){
        ContentValues cv = new ContentValues();
        cv.put(DbConstant.COLUMN_FIRST_NAME,student.getFirstName());
        cv.put(DbConstant.COLUMN_LAST_NAME,student.getLastName());
        cv.put(DbConstant.COLUMN_MIDDLE_NAME,student.getMiddleName());
        db.insert(DbConstant.TABLE_NAME_STUDENT,null,cv);
    }

    //Метод получения списка всех юзеров
    @SuppressLint("Range")
    public List<Student> getAllUserFromDb(){
        List<Student> users = new ArrayList<>();
        Cursor cursor = db.query(DbConstant.TABLE_NAME_STUDENT,null,null,null,null,null,null);
        while (cursor.moveToNext()){
            Student user = new Student();
            user.setFirstName(cursor.getString(cursor.getColumnIndex(DbConstant.COLUMN_FIRST_NAME)));
            user.setLastName(cursor.getString(cursor.getColumnIndex(DbConstant.COLUMN_LAST_NAME)));
            user.setMiddleName(cursor.getString(cursor.getColumnIndex(DbConstant.COLUMN_MIDDLE_NAME)));
            user.setId(Integer.parseInt(cursor.getString(cursor.getColumnIndex(DbConstant.COLUMN_ID))));
            users.add(user);
        }
        cursor.close();
        return users;
    }
}
