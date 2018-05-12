package com.example.ahmedx64.room_database_pasheer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    Button btnadduser , btnRead , deleteuser,updateuser;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        btnadduser = view.findViewById(R.id.adduser);
        btnadduser.setOnClickListener(this);

        btnRead = view.findViewById(R.id.btn_viewuser);
        btnRead.setOnClickListener(this);

        deleteuser = view.findViewById(R.id.btn_deleteuser);
        deleteuser.setOnClickListener(this);

        updateuser = view.findViewById(R.id.btn_updateuser);
        updateuser.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.adduser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new AddUserFragment()).addToBackStack(null).commit();

                break;

            case R.id.btn_viewuser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new ReadUserFragment()).addToBackStack(null).commit();

                break;


            case R.id.btn_deleteuser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new DeleteUserFragment()).addToBackStack(null).commit();

                break;

            case R.id.btn_updateuser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new UpdateUserFragment()).addToBackStack(null).commit();

                break;



        }


    }
}
