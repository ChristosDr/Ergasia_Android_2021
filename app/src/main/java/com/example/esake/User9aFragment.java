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


import com.example.esake.databinding.FragmentUser9aBinding;

public class User9aFragment extends Fragment {
    private FragmentUser9aBinding binding;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentUser9aBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(User9aFragment.this)
                        .navigate(R.id.action_user9aFragment_to_user9bFragment);
            }


        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(User9aFragment.this)
                        .navigate(R.id.action_user9aFragment_to_user9bFragment);
            }

        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    NavHostFragment.findNavController(User9aFragment.this)
                            .navigate(R.id.action_user9aFragment_to_user9bFragment);
                }

        });
        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(User9aFragment.this)
                        .navigate(R.id.action_user9aFragment_to_user9bFragment);
            }

        });
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(User9aFragment.this)
                        .navigate(R.id.action_user9aFragment_to_user9bFragment);
            }

        });
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(User9aFragment.this)
                        .navigate(R.id.action_user9aFragment_to_user9bFragment);
            }

        });
        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(User9aFragment.this)
                        .navigate(R.id.action_user9aFragment_to_user9bFragment);
            }

        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(User9aFragment.this)
                        .navigate(R.id.action_user9aFragment_to_user9bFragment);
            }
        });
        binding.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(User9aFragment.this)
                        .navigate(R.id.action_user9aFragment_to_user9bFragment);
            }
        });

        binding.button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(User9aFragment.this)
                        .navigate(R.id.action_user9aFragment_to_user9bFragment);
            }
        });






    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;
    }

}