package com.example.ahmedx64.room_database_pasheer;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by ahmed x64 on 5/12/2018.
 */

@Database(entities = User.class,version = 1)
public abstract class MyAppDataBase extends RoomDatabase {

    public abstract MyDao myDao();
}
