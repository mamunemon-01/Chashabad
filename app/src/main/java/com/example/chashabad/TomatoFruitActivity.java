package com.example.chashabad;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import com.example.chashabad.databinding.ActivityFruitTomatoBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class TomatoFruitActivity extends AppCompatActivity {

    private ActivityFruitTomatoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFruitTomatoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getResources().getString(R.string.title_activity_fruit));

        /*toolbar.setOnTouchListener(new OnSwipeTouchListener(TomatoFruitActivity.this){
            public void onSwipeRight(){
                startActivity(new Intent(TomatoFruitActivity.this, TomatoFlowerActivity.class));
            }
            public void onSwipeLeft(){
                startActivity(new Intent(TomatoFruitActivity.this, TomatoActivity.class));
            }
        });*/

        /*NestedScrollView nsv = findViewById(R.id.tomato_fruit_scrolling);
        nsv.setOnTouchListener(new OnSwipeTouchListener(TomatoFruitActivity.this){
            public void onSwipeRight(){
                startActivity(new Intent(TomatoFruitActivity.this, TomatoFlowerActivity.class));
            }
            public void onSwipeLeft(){
                startActivity(new Intent(TomatoFruitActivity.this, TomatoActivity.class));
            }
        });*/
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(TomatoFruitActivity.this, MainTomatoActivity.class));
    }
}