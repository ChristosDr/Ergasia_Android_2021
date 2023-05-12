package com.example.esake;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.app.*;


import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;


import com.example.esake.databinding.FragmentUser6aBinding;

public class User6aFragment extends Fragment {

    private com.example.esake.databinding.FragmentUser6aBinding binding;
    private RadioGroup rg;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentUser6aBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //button1 = binding.button1;

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btntext= (String) binding.button1.getText();
                User6aFragmentDirections.ActionUser6FragmentToUser6bFragment action = User6aFragmentDirections.actionUser6FragmentToUser6bFragment(btntext);
                NavHostFragment.findNavController(User6aFragment.this).navigate(action);
            }




        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btntext= (String) binding.button2.getText();
                User6aFragmentDirections.ActionUser6FragmentToUser6bFragment action = User6aFragmentDirections.actionUser6FragmentToUser6bFragment(btntext);
                NavHostFragment.findNavController(User6aFragment.this).navigate(action);
            }

        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btntext= (String) binding.button3.getText();
                User6aFragmentDirections.ActionUser6FragmentToUser6bFragment action = User6aFragmentDirections.actionUser6FragmentToUser6bFragment(btntext);
                NavHostFragment.findNavController(User6aFragment.this).navigate(action);
            }

        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btntext = (String) binding.button4.getText();
                User6aFragmentDirections.ActionUser6FragmentToUser6bFragment action = User6aFragmentDirections.actionUser6FragmentToUser6bFragment(btntext);
                NavHostFragment.findNavController(User6aFragment.this).navigate(action);
            }

        });
        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btntext= (String) binding.button5.getText();
                User6aFragmentDirections.ActionUser6FragmentToUser6bFragment action = User6aFragmentDirections.actionUser6FragmentToUser6bFragment(btntext);
                NavHostFragment.findNavController(User6aFragment.this).navigate(action);
            }

        });
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btntext= (String) binding.button6.getText();
                User6aFragmentDirections.ActionUser6FragmentToUser6bFragment action = User6aFragmentDirections.actionUser6FragmentToUser6bFragment(btntext);
                NavHostFragment.findNavController(User6aFragment.this).navigate(action);
            }

        });
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btntext= (String) binding.button7.getText();
                User6aFragmentDirections.ActionUser6FragmentToUser6bFragment action = User6aFragmentDirections.actionUser6FragmentToUser6bFragment(btntext);
                NavHostFragment.findNavController(User6aFragment.this).navigate(action);
            }

        });
        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btntext= (String) binding.button8.getText();
                User6aFragmentDirections.ActionUser6FragmentToUser6bFragment action = User6aFragmentDirections.actionUser6FragmentToUser6bFragment(btntext);
                NavHostFragment.findNavController(User6aFragment.this).navigate(action);
            }

        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btntext= (String) binding.button9.getText();
                User6aFragmentDirections.ActionUser6FragmentToUser6bFragment action = User6aFragmentDirections.actionUser6FragmentToUser6bFragment(btntext);
                NavHostFragment.findNavController(User6aFragment.this).navigate(action);
            }

        });


    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;
    }

}