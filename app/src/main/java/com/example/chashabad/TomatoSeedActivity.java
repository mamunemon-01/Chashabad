package com.example.chashabad;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

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

        /*toolbar.setOnTouchListener(new OnSwipeTouchListener(TomatoSeedActivity.this){
            public void onSwipeRight(){
                startActivity(new Intent(TomatoSeedActivity.this, TomatoActivity.class));
            }
            public void onSwipeLeft(){
                startActivity(new Intent(TomatoSeedActivity.this, TomatoSeedlingActivity.class));
            }
        });*/

        /*NestedScrollView nsv = findViewById(R.id.tomato_seed_scrolling);
        nsv.setOnTouchListener(new OnSwipeTouchListener(TomatoSeedActivity.this){
            public void onSwipeRight(){
                startActivity(new Intent(TomatoSeedActivity.this, TomatoActivity.class));
            }
            public void onSwipeLeft(){
                startActivity(new Intent(TomatoSeedActivity.this, TomatoSeedlingActivity.class));
            }
        });*/
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(TomatoSeedActivity.this, MainTomatoActivity.class));
    }
}