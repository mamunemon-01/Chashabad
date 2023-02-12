package com.example.chashabad;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import com.example.chashabad.databinding.ActivityFlowerTomatoBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class TomatoFlowerActivity extends AppCompatActivity {

    private ActivityFlowerTomatoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFlowerTomatoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getResources().getString(R.string.title_activity_flower));

        /*toolbar.setOnTouchListener(new OnSwipeTouchListener(TomatoFlowerActivity.this){
            public void onSwipeRight(){
                startActivity(new Intent(TomatoFlowerActivity.this, TomatoVineActivity.class));
            }
            public void onSwipeLeft(){
                startActivity(new Intent(TomatoFlowerActivity.this, TomatoFruitActivity.class));
            }
        });*/

        /*NestedScrollView nsv = findViewById(R.id.tomato_flower_scrolling);
        nsv.setOnTouchListener(new OnSwipeTouchListener(TomatoFlowerActivity.this){
            public void onSwipeRight(){
                startActivity(new Intent(TomatoFlowerActivity.this, TomatoVineActivity.class));
            }
            public void onSwipeLeft(){
                startActivity(new Intent(TomatoFlowerActivity.this, TomatoFruitActivity.class));
            }
        });*/
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(TomatoFlowerActivity.this, MainTomatoActivity.class));
    }
}