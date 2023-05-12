package com.example.esake;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;


import com.example.esake.databinding.FragmentAdmin1bBinding;


public class Admin1bFragment extends Fragment {

    private @NonNull FragmentAdmin1bBinding binding;
    private Spinner v_team_spinner;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentAdmin1bBinding.inflate(inflater, container, false);
        return binding.getRoot();


    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Team.initTeam();
        v_team_spinner = binding.visitingTeamSpinner;
        SpinnerAdapter customAdapter = new SpinnerAdapter(getActivity(), R.layout.custom_spinner_adapter, Team.getTeamArrayList());
        v_team_spinner.setAdapter(customAdapter);

        Spinner v_p1_spinner =  binding.vPlayer1;
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getActivity(), R.array.players_paok, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        v_p1_spinner.setAdapter(adapter2);
        Spinner v_p2_spinner =  binding.vPlayer2;
        v_p2_spinner.setAdapter(adapter2);
        Spinner v_p3_spinner =  binding.vPlayer3;
        v_p3_spinner.setAdapter(adapter2);
        Spinner v_p4_spinner =  binding.vPlayer4;
        v_p4_spinner.setAdapter(adapter2);
        Spinner v_p5_spinner =  binding.vPlayer5;
        v_p5_spinner.setAdapter(adapter2);
        Spinner v_p6_spinner =  binding.vPlayer6;
        v_p6_spinner.setAdapter(adapter2);
        Spinner v_p7_spinner =  binding.vPlayer7;
        v_p7_spinner.setAdapter(adapter2);
        Spinner v_p8_spinner =  binding.vPlayer8;
        v_p8_spinner.setAdapter(adapter2);
        Spinner v_p9_spinner =  binding.vPlayer9;
        v_p9_spinner.setAdapter(adapter2);
        Spinner v_p10_spinner =  binding.vPlayer10;
        v_p10_spinner.setAdapter(adapter2);
    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;
    }

}