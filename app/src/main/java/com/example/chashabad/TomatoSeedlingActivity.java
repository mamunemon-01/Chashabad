package com.example.chashabad;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import com.example.chashabad.databinding.ActivitySeedlingTomatoBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class TomatoSeedlingActivity extends AppCompatActivity {

    private ActivitySeedlingTomatoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySeedlingTomatoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getResources().getString(R.string.title_activity_seedling));

        /*toolbar.setOnTouchListener(new OnSwipeTouchListener(TomatoSeedlingActivity.this){
            public void onSwipeRight(){
                startActivity(new Intent(TomatoSeedlingActivity.this, TomatoSeedActivity.class));
            }
            public void onSwipeLeft(){
                startActivity(new Intent(TomatoSeedlingActivity.this, TomatoVineActivity.class));
            }
        });*/

        /*NestedScrollView nsv = findViewById(R.id.tomato_seedling_scrolling);
        nsv.setOnTouchListener(new OnSwipeTouchListener(TomatoSeedlingActivity.this){
            public void onSwipeRight(){
                startActivity(new Intent(TomatoSeedlingActivity.this, TomatoSeedActivity.class));
            }
            public void onSwipeLeft(){
                startActivity(new Intent(TomatoSeedlingActivity.this, TomatoVineActivity.class));
            }
        });*/
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(TomatoSeedlingActivity.this, MainTomatoActivity.class));
    }
}