package com.example.esake;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.widget.RadioGroup;

import com.example.esake.databinding.FragmentUser6cBinding;

public class User6cFragment extends Fragment {

    private FragmentUser6cBinding binding;
    private RadioGroup rg;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentUser6cBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String matchtext_for_c =User6cFragmentArgs.fromBundle(getArguments()).getMyArg2();
        binding.textView2c.setText(matchtext_for_c);



    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;
    }

}