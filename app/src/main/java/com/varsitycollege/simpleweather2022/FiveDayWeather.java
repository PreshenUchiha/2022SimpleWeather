package com.varsitycollege.simpleweather2022;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FiveDayWeather extends Fragment {


    public FiveDayWeather() {


    }







    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_five_day_weather, container, false);
        return  view;
    }
}