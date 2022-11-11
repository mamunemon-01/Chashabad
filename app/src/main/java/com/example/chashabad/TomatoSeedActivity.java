package com.example.chashabad;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chashabad.databinding.ActivitySeedTomatoBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class TomatoSeedActivity extends AppCompatActivity {

private ActivitySeedTomatoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivitySeedTomatoBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getResources().getString(R.string.title_activity_seed));// getTitle());
    }
}