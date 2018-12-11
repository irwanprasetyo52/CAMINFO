package com.example.com.caminfo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PersonalFragment extends Fragment {

    private String title;
    private static final String ARG_TITLE = "title";
    public static PersonalFragment newInstance(String title) {

        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);

        PersonalFragment fragment = new PersonalFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public PersonalFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getArguments();
        if (extras != null) {
            title = extras.getString(ARG_TITLE);
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragV = inflater.inflate(R.layout.personal_fragment, container, false);
        return fragV;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ImageView btn1 = (ImageView) view.findViewById(R.id.imgbutton1);
        ImageView btn2 = (ImageView) view.findViewById(R.id.imgbutton2);
        ImageView btn3 = (ImageView) view.findViewById(R.id.imgbutton3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Profile personal
                Toast.makeText(getContext(),"Tidak tersedia untuk prototype", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Profile personal
                Toast.makeText(getContext(),"Tidak tersedia untuk prototype", Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Profile personal
                Toast.makeText(getContext(),"Tidak tersedia untuk prototype", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
