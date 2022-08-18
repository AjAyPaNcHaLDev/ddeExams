package com.dde.exams.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.Toast;


import com.dde.exams.R;


public class Home extends Fragment {


RelativeLayout courseCard;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Home");

     View    view= inflater.inflate(R.layout.fragment_home, container, false);

     courseCard=view.findViewById(R.id.courseCard);
     courseCard.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             startActivity(new Intent(getActivity(), CourseDetails.class));
         }
     });
        return  view;

    }
}