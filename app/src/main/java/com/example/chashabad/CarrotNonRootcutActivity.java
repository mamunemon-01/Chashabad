package com.example.chashabad;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chashabad.databinding.ActivityRootcutNonCarrotBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;


public class CarrotNonRootcutActivity extends AppCompatActivity {

    private ActivityRootcutNonCarrotBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRootcutNonCarrotBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getResources().getString(R.string.title_activity_non_rootcutting));
    }
}