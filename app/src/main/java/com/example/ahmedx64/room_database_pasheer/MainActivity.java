package com.example.ahmedx64.room_database_pasheer;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    public static MyAppDataBase myAppDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();

        myAppDataBase= Room.databaseBuilder(getApplicationContext(),MyAppDataBase.class,"users").allowMainThreadQueries().build();

        if (findViewById(R.id.fragment_container)!=null){

            if (savedInstanceState!=null)
                return;

            fragmentManager.beginTransaction().add(R.id.fragment_container,new HomeFragment()).commit();
        }

    }
}
