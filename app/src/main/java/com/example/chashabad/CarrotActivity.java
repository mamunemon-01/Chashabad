package com.example.chashabad;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chashabad.databinding.ActivityCarrotBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class CarrotActivity extends AppCompatActivity {

    private ActivityCarrotBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCarrotBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getResources().getText(R.string.title_activity_carrot));
    }
}