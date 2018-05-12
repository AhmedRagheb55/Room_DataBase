package com.example.ahmedx64.room_database_pasheer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddUserFragment extends Fragment {

    EditText id,name,email;
    Button save;


    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view= inflater.inflate(R.layout.fragment_add_user, container, false);

        id = view.findViewById(R.id.txt_id_update);
        name = view.findViewById(R.id.txt_name_update);
        email = view.findViewById(R.id.txt_email);
        save=view.findViewById(R.id.btn_save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int userid = Integer.parseInt(id.getText().toString());
                String username = name.getText().toString();
                String useremail = email.getText().toString();

                User user = new User();
                user.setId(userid);
                user.setName(username);
                user.setEmail(useremail);

                MainActivity.myAppDataBase.myDao().adduser(user);

                Toast.makeText(getActivity(), "user added successfully", Toast.LENGTH_SHORT).show();

                id.setText("");
                name.setText("");
                email.setText("");
            }
        });


        return view;
    }

}
