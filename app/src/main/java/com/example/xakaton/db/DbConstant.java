package com.example.xakaton.db;

public class DbConstant {
        public static final String TABLE_NAME_STUDENT = "student_table";
        public static final String TABLE_NAME_GROUP = "group_table";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_STUDENT_ID = "student_id";
        public static final String COLUMN_GROUP_ID = "group_id";
        public static final String COLUMN_FIRST_NAME = "first_name";
        public static final String COLUMN_LAST_NAME = "last_name";                    //нужные данные для бд и создание бд
        public static final String COLUMN_MIDDLE_NAME = "middle_name";
        public static final String COLUMN_BIRTH_DATE = "birth_date";
        public static final String COLUMN_GROUP_NAME = "group_name";
        public static final String COLUMN_GROUP_NUMBER = "group_number";
        public static final String DATABASE_NAME = "students.db";
        public static final int DATABASE_VERSION = 1;
        public static final String CREATE_TABLE_GROUP = "CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME_GROUP + " (" + COLUMN_ID + " INTEGER PRIMARY KEY," +
                COLUMN_GROUP_NAME + " TEXT," +
                COLUMN_GROUP_NUMBER + " INTEGER)";
        public static final String CREATE_TABLE_STUDENT = "CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME_STUDENT + " (" + COLUMN_ID + " INTEGER PRIMARY KEY," +
                COLUMN_STUDENT_ID + " INTEGER," +
                COLUMN_GROUP_ID + " INTEGER," +
                COLUMN_FIRST_NAME + " TEXT," +
                COLUMN_LAST_NAME + " TEXT," +
                COLUMN_MIDDLE_NAME + " TEXT," +
                COLUMN_BIRTH_DATE + " TEXT," +
                "FOREIGN KEY(" + COLUMN_GROUP_ID + ") REFERENCES " + TABLE_NAME_GROUP + "(" + COLUMN_ID + "))";
        public static final String DELETE_TABLE_STUDENT =
                "DROP TABLE IF EXISTS " + TABLE_NAME_STUDENT;
        public static final String DELETE_TABLE_GROUP =
                "DROP TABLE IF EXISTS " + TABLE_NAME_GROUP;


}


