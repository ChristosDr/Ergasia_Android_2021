package com.example.esake;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.navigation.fragment.NavHostFragment;

import com.example.esake.databinding.FragmentUser6bBinding;

public class User6bFragment extends Fragment {

    private FragmentUser6bBinding binding;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentUser6bBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String matchtext2 =User6bFragmentArgs.fromBundle(getArguments()).getMyArg();
        binding.textView2.setText(matchtext2);

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textfrom_B= (String) binding.textView2.getText();
                User6bFragmentDirections.ActionUser6bFragmentToUser6cFragment action = User6bFragmentDirections.actionUser6bFragmentToUser6cFragment(textfrom_B);
                NavHostFragment.findNavController(User6bFragment.this).navigate(action);
            }

        });



    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;
    }

}