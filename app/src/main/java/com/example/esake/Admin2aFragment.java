package com.example.esake;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.navigation.fragment.NavHostFragment;
import com.example.esake.databinding.FragmentAdmin2aBinding;

import java.util.ArrayList;

public class Admin2aFragment extends Fragment {

private FragmentAdmin2aBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
      binding = FragmentAdmin2aBinding.inflate(inflater, container, false);
      return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String team1txt =Admin2aFragmentArgs.fromBundle(getArguments()).getTeam1();
        String team2txt =Admin2aFragmentArgs.fromBundle(getArguments()).getTeam2();

        binding.textView1team.setText("Players of:"+team1txt);
        binding.textView2Team.setText("Players of:"+team2txt);

        ArrayList<String> Aristeam=new ArrayList<>();
        ArrayList<String> Olyteam=new ArrayList<>();
        ArrayList<String> AEKteam=new ArrayList<>();
        ArrayList<String> Panateam=new ArrayList<>();
        ArrayList<String> Paokteam=new ArrayList<>();

        Aristeam.add("COWAN JR");
        Aristeam.add("HANLAN");
        Aristeam.add("JUISTON");
        Aristeam.add("LOCKETT");
        Aristeam.add("SIDIROLIAS");

        Olyteam.add("DORSEY");
        Olyteam.add("SLOUKAS");
        Olyteam.add("PRINTEZIS");
        Olyteam.add("VEZENKOV");
        Olyteam.add("PAPANIKOLAOY");

        AEKteam.add("PAPPAS");
        AEKteam.add("ANGOLA");
        AEKteam.add("PETROPOULOS");
        AEKteam.add("KARLIS");
        AEKteam.add("MAVROIDIS");

        Paokteam.add("RIVERS");
        Paokteam.add("LEE");
        Paokteam.add("GREENE");
        Paokteam.add("DILEO");
        Paokteam.add("MANTZARIS");

        Panateam.add("PAPAPETROY");
        Panateam.add("PAPAGIANNIS");
        Panateam.add("NEDOVIC");
        Panateam.add("MEICON");
        Panateam.add("WHITE");


        switch (team1txt){
            case "PAOK" :
                ArrayAdapter<String> arrayAdapter
                        = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, Paokteam);
                binding.team1list.setAdapter(arrayAdapter);
                binding.team1list.setOnItemClickListener((adapterView, view1, i, l) -> Toast.makeText(getActivity(),"Player: " + Paokteam.get(i),Toast.LENGTH_SHORT).show());
                break;
            case "ARHS" :
                ArrayAdapter<String> arrayAdapter2
                        = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,Aristeam);
                binding.team1list.setAdapter(arrayAdapter2);
                binding.team1list.setOnItemClickListener((adapterView, view12, i, l) -> Toast.makeText(getActivity(),"Player: " + Aristeam.get(i),Toast.LENGTH_SHORT).show());
                break;
            case "OSFP" :
                ArrayAdapter<String> arrayAdapter3
                        = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,Olyteam);
                binding.team1list.setAdapter(arrayAdapter3);
                binding.team1list.setOnItemClickListener((adapterView, view13, i, l) -> Toast.makeText(getActivity(),"Player: " + Olyteam.get(i),Toast.LENGTH_SHORT).show());
                break;
            case "PAO" :
                ArrayAdapter<String> arrayAdapter4
                        = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,Panateam);
                binding.team1list.setAdapter(arrayAdapter4);
                binding.team1list.setOnItemClickListener((adapterView, view14, i, l) -> Toast.makeText(getActivity(),"Player: " + Panateam.get(i),Toast.LENGTH_SHORT).show());
                break;
            case "AEK" :
                ArrayAdapter<String> arrayAdapter5
                        = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,AEKteam);
                binding.team1list.setAdapter(arrayAdapter5);
                binding.team1list.setOnItemClickListener((adapterView, view15, i, l) -> Toast.makeText(getActivity(),"Player: " + AEKteam.get(i),Toast.LENGTH_SHORT).show());
                break;
        }
        switch (team2txt){
            case "PAOK" :
                ArrayAdapter<String> arrayAdapter
                        = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,Paokteam);
                binding.team2list.setAdapter(arrayAdapter);
                binding.team2list.setOnItemClickListener((adapterView, view16, i, l) -> Toast.makeText(getActivity(),"Player: " + Paokteam.get(i),Toast.LENGTH_SHORT).show());
                break;
            case "ARHS" :
                ArrayAdapter<String> arrayAdapter2
                        = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,Aristeam);
                binding.team2list.setAdapter(arrayAdapter2);
                binding.team2list.setOnItemClickListener((adapterView, view17, i, l) -> Toast.makeText(getActivity(),"Player: " + Aristeam.get(i),Toast.LENGTH_SHORT).show());
                break;
            case "OSFP" :
                ArrayAdapter<String> arrayAdapter3
                        = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,Olyteam);
                binding.team2list.setAdapter(arrayAdapter3);
                binding.team2list.setOnItemClickListener((adapterView, view18, i, l) -> Toast.makeText(getActivity(),"Player: " + Olyteam.get(i),Toast.LENGTH_SHORT).show());
                break;
            case "PAO" :
                ArrayAdapter<String> arrayAdapter4
                        = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,Panateam);
                binding.team2list.setAdapter(arrayAdapter4);
                binding.team2list.setOnItemClickListener((adapterView, view19, i, l) -> Toast.makeText(getActivity(),"Player: " + Panateam.get(i),Toast.LENGTH_SHORT).show());
                break;
            case "AEK" :
                ArrayAdapter<String> arrayAdapter5
                        = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,AEKteam);
                binding.team2list.setAdapter(arrayAdapter5);
                binding.team2list.setOnItemClickListener((adapterView, view110, i, l) -> Toast.makeText(getActivity(),"Player: " + AEKteam.get(i),Toast.LENGTH_SHORT).show());
                break;
        }



        binding.INbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //stelno ta onomata ton omadon sthn allh othoni fragment2b
                Admin2aFragmentDirections.ActionFirstFragmentToSecondFragment action =Admin2aFragmentDirections.actionFirstFragmentToSecondFragment(team1txt,team2txt);
                NavHostFragment.findNavController(Admin2aFragment.this).navigate(action);
            }

        });
        binding.OUTbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Admin2aFragmentDirections.ActionFirstFragmentToSecondFragment action =Admin2aFragmentDirections.actionFirstFragmentToSecondFragment(team1txt,team2txt);
                NavHostFragment.findNavController(Admin2aFragment.this).navigate(action);
            }

        });
    }

@Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;
    }

}