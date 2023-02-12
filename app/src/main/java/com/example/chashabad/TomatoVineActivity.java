package com.example.chashabad;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import com.example.chashabad.databinding.ActivityVineTomatoBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class TomatoVineActivity extends AppCompatActivity {

    private ActivityVineTomatoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityVineTomatoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getResources().getText(R.string.title_activity_vine));

        /*toolbar.setOnTouchListener(new OnSwipeTouchListener(TomatoVineActivity.this){
            public void onSwipeRight(){
                startActivity(new Intent(TomatoVineActivity.this, TomatoSeedlingActivity.class));
            }
            public void onSwipeLeft(){
                startActivity(new Intent(TomatoVineActivity.this, TomatoFlowerActivity.class));
            }
        });*/

        /*
        NestedScrollView nsv = findViewById(R.id.tomato_vine_scrolling);
        nsv.setOnTouchListener(new OnSwipeTouchListener(TomatoVineActivity.this){
            public void onSwipeRight(){
                startActivity(new Intent(TomatoVineActivity.this, TomatoSeedlingActivity.class));
            }
            public void onSwipeLeft(){
                startActivity(new Intent(TomatoVineActivity.this, TomatoFlowerActivity.class));
            }
        });*/
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(TomatoVineActivity.this, MainTomatoActivity.class));
    }
}