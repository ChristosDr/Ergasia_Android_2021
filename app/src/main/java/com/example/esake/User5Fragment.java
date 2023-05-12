package com.example.esake;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.widget.RadioGroup;
import android.widget.TextView;


import com.example.esake.databinding.FragmentUser5Binding;

public class User5Fragment extends Fragment {

    private FragmentUser5Binding binding;
    private RadioGroup rg;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentUser5Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        // dokimastika gia ta textviews



        //String om1="aek";
        // om2="paok";



        // omada1.setText(TeamList.class.getName());
        //TextView omada2 = (TextView) findViewById(R.id.textView2);
        //omada1.setText(om1);
        //omada2.setText(om2);

        //Stoixeia gia kathe mia kathgoria apo Database kai set ta statistika tous panw sthn othonh
        //String om1="aek";
        //String om2="paok";//edw 8a paei pinakas [id(omada),sthlh]



        TextView omada1freethrow = binding.editTextNumber;
        TextView omada2freethrow = binding.editTextNumber2;
        omada1freethrow.setText("free1");
        omada2freethrow.setText("free2");

        TextView omada1point2 = binding.editTextNumber3;
        TextView omada2point2 = binding.editTextNumber4;
        omada1point2.setText("2point 1");
        omada2point2.setText("2point 2");

        TextView omada1point3 = binding.editTextNumber5;
        TextView omada2point3 = binding.editTextNumber6;
        omada1point3.setText("3point 1");
        omada2point3.setText("3point 2");


        TextView omada1rebounds = binding.editTextNumber7;
        TextView omada2rebounds =binding.editTextNumber8;
        omada1rebounds.setText("reb1");
        omada2rebounds.setText("reb2");

        TextView omada1blocks = binding.editTextNumber9;
        TextView omada2blocks = binding.editTextNumber14;
        omada1blocks.setText("block1");
        omada2blocks.setText("block2");

        TextView omada1turnovers = binding.editTextNumber10;
        TextView omada2turnovers = binding.editTextNumber15;
        omada1turnovers.setText("turn1");
        omada2turnovers.setText("turn2");

        TextView omada1fouls =binding.editTextNumber11;
        TextView omada2fouls = binding.editTextNumber12;
        omada1fouls.setText("foul1");
        omada2fouls.setText("foul2");

        TextView omada1steals = binding.editTextNumber13;
        TextView omada2steals = binding.editTextNumber16;
        omada1steals.setText("steal1");
        omada2steals.setText("steal2");

    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;
    }

}