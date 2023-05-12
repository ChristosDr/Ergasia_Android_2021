package com.example.esake;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;


import com.example.esake.databinding.FragmentAdmin1aBinding;
import com.example.esake.databinding.FragmentUser4Binding;

public class Admin1aFragment extends Fragment {

    private FragmentAdmin1aBinding binding;
    private Spinner h_team_spinner;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentAdmin1aBinding.inflate(inflater, container, false);
        return binding.getRoot();


    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Team.initTeam();
        h_team_spinner = binding.homeTeamSpinner;
        SpinnerAdapter customAdapter = new SpinnerAdapter(getActivity(), R.layout.custom_spinner_adapter, Team.getTeamArrayList());
        h_team_spinner.setAdapter(customAdapter);

        Spinner h_p1_spinner =  binding.hPlayer1;
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.players_aek, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        h_p1_spinner.setAdapter(adapter);
        Spinner h_p2_spinner =  binding.hPlayer2;
        h_p2_spinner.setAdapter(adapter);
        Spinner h_p3_spinner =  binding.hPlayer3;
        h_p3_spinner.setAdapter(adapter);
        Spinner h_p4_spinner =  binding.hPlayer4;
        h_p4_spinner.setAdapter(adapter);
        Spinner h_p5_spinner =  binding.hPlayer5;
        h_p5_spinner.setAdapter(adapter);
        Spinner h_p6_spinner =  binding.hPlayer6;
        h_p6_spinner.setAdapter(adapter);
        Spinner h_p7_spinner =  binding.hPlayer7;
        h_p7_spinner.setAdapter(adapter);
        Spinner h_p8_spinner =  binding.hPlayer8;
        h_p8_spinner.setAdapter(adapter);
        Spinner h_p9_spinner =  binding.hPlayer9;
        h_p9_spinner.setAdapter(adapter);
        Spinner h_p10_spinner =  binding.hPlayer10;
        h_p10_spinner.setAdapter(adapter);

        binding.nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Admin1aFragment.this)
                        .navigate(R.id.action_admin1aFragment4_to_admin1bFragment);
            }

        });

    }




    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;
    }

}