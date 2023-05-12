package com.example.esake;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.esake.databinding.FragmentAdmin3Binding;

import java.util.ArrayList;

public class Admin3Fragment extends Fragment {

    private FragmentAdmin3Binding binding;
    private  ListView listView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentAdmin3Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView=binding.listview;

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("ΑΡΗΣ-ΛΑΥΡΙΟ MEGABOLT");
        arrayList.add("ΑΠΟΛΛΩΝ Π. OSCAR-ΠΡΟΜΗΘΕΑΣ");
        arrayList.add("ΙΩΝΙΚΟΣ BASKET-ΑΕΚ");
        arrayList.add("ΠΑΟΚ mateco-ΠΕΡΙΣΤΕΡΙ VITABIOTICS");
        arrayList.add("ΛΑΡΙΣΑ-ΗΡΑΚΛΗΣ");
        arrayList.add("ΠΑΝΑΘΗΝΑΪΚΟΣ ΟΠΑΠ-ΚΟΛΟΣΣΟΣ H HOTELS");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(),"clicked item:"+i+" "+arrayList.get(i).toString(),Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}