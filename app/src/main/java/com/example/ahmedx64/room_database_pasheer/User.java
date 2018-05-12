package com.example.ahmedx64.room_database_pasheer;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by ahmed x64 on 5/12/2018.
 */
@Entity(tableName = "users")
public class User {

    @PrimaryKey
    int id;

    @ColumnInfo(name = "user_name")
    String name;

    @ColumnInfo(name = "user_email")
    String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
