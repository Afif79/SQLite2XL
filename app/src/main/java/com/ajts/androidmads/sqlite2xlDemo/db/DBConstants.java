package com.ajts.androidmads.sqlite2xlDemo.db;

class DBConstants {

    static final String USER_TABLE = "customers";
    static final String CONTACT_ID = "Id";
    static final String CONTACT_PERSON_NAME = "Item";
    static final String CONTACT_NO = "Price";

    static final String CREATE_USER_TABLE = "CREATE TABLE IF NOT EXISTS " + USER_TABLE + " ("
            + CONTACT_ID + " INTEGER PRIMARY KEY,"
            + CONTACT_PERSON_NAME + " TEXT,"
            + CONTACT_NO + " TEXT)";


    static final String SELECT_QUERY = "SELECT * FROM " + USER_TABLE;

}
