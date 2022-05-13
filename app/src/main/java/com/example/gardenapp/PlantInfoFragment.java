package com.example.gardenapp;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class PlantInfoFragment extends Fragment {

    ImageView plantImage;
    TextView plantText;
    String url = "https://en.wikipedia.org/wiki/";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        plantImage = (ImageView) plantImage.findViewById(R.id.apple_img);
        plantText = (TextView) plantText.findViewById(R.id.apple_text);
        url += "apples";

        return inflater.inflate(R.layout.fragment_plant_info, container, false);

    }
}
