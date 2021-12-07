package com.yusuftalhaklc.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.yusuftalhaklc.landmarkbook.databinding.ActivityDetailsBinding;
import com.yusuftalhaklc.landmarkbook.databinding.ActivityMainBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        com.yusuftalhklc.landmarkbook.Singleton singleton = com.yusuftalhklc.landmarkbook.Singleton.getInstance();
        LandMark selectedLandmark = singleton.getSelectedLandmark();

        binding.landarkNameText.setText(selectedLandmark.name);
        binding.countryNameText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.imageId);

    }
}