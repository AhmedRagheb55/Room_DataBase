package com.example.ahmedx64.room_database_pasheer;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by ahmed x64 on 5/12/2018.
 */

@Dao
public interface MyDao {

    @Insert
    public void adduser(User user);


    @Query("select * from users")
    public List<User> getusers();


    @Delete
    public void deletuser(User user);


    @Update
    public void updateuser(User user);


}
