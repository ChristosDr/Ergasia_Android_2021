package com.example.esake;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.esake.databinding.FragmentAdmin2cBinding;

public class Admin2cFragment extends Fragment {

    private FragmentAdmin2cBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentAdmin2cBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnadmin2cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //STELNO TIS OMADES STHN DEYTERH OTHONI (FRAGMENT2a)
                String team1text = binding.team1spinner.getSelectedItem().toString();
                String team2text = binding.team2spinner.getSelectedItem().toString();
                if(team1text!=team2text) {
                    Admin2cFragmentDirections.ActionAdmin2cFragmentToAdmin2a action =
                            Admin2cFragmentDirections.actionAdmin2cFragmentToAdmin2a(team1text, team2text);
                    NavHostFragment.findNavController(Admin2cFragment.this).navigate(action);
                    Toast.makeText(getActivity(), team1text + " vs " + team2text, Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getActivity(),"IDIES OMADES",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}