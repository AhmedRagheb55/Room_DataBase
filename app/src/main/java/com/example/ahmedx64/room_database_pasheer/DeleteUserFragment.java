package com.example.ahmedx64.room_database_pasheer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteUserFragment extends Fragment {

    private EditText deleteid;

    private Button deletebtn;


    public DeleteUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_user, container, false);

        deleteid = view.findViewById(R.id.txt_deleteuser);
        deletebtn = view.findViewById(R.id.btn_delete);

        deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = Integer.parseInt(deleteid.getText().toString());

                User user = new User();
                user.setId(id);
                MainActivity.myAppDataBase.myDao().deletuser(user);

                Toast.makeText(getActivity(), "user successfully removed", Toast.LENGTH_SHORT).show();

                deleteid.setText("");
            }
        });


        return view;
    }

}
