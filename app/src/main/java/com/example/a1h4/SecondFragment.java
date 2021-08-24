package com.example.a1h4;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment{


    private RecyclerView recyclerView;
    private SecondAdapter adapter;
    private ArrayList<User> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        adapter = new SecondAdapter();
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_second);


        createList();
        adapter.addList(list);
        setClick();

    }

    private void setClick() {
        adapter.setListiner(model1 -> {
            Intent in = new Intent(requireActivity(),secondactivity.class);
            in.putExtra("text", model1);
            startActivity(in);
        });
    }
            private void createList() {
                list = new ArrayList<>();
                list.add(new User("1", "Venom", "Ghostmane", "3:00"));
                list.add(new User("2", "Mercury", "Ghostmane", "3:00"));
                list.add(new User("3", "Blood Oceans", "Ghostmane", "3:00"));
                list.add(new User("4", "Nihil", "Ghostmane", "3:00"));
                list.add(new User("5", "Venom", "Eminem", "3:00"));
                list.add(new User("6", "Faded", "Alan Walker", "3:00"));
                list.add(new User("7", "Спасательный круг", "FACE", "3:00"));
                list.add(new User("8", "Калашников", "FACE", "3:00"));
                list.add(new User("9", "Юморист", "FACE", "3:00"));
                list.add(new User("10", "Рэйман", "FACE", "3:00"));
                recyclerView.setAdapter(adapter);
            }
        }
