package com.example.chashabad;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import com.example.chashabad.databinding.ActivityTomatoBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class TomatoActivity extends AppCompatActivity {

    private ActivityTomatoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTomatoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getResources().getText(R.string.title_activity_tomato));

        /*toolbar.setOnTouchListener(new OnSwipeTouchListener(TomatoActivity.this){
            public void onSwipeRight(){
                startActivity(new Intent(TomatoActivity.this, TomatoFruitActivity.class));
            }
            public void onSwipeLeft(){
                startActivity(new Intent(TomatoActivity.this, TomatoSeedActivity.class));
            }
        });*/

        /*NestedScrollView nsv = findViewById(R.id.tomato_scrolling);
        nsv.setOnTouchListener(new OnSwipeTouchListener(TomatoActivity.this){
            public void onSwipeRight(){
                startActivity(new Intent(TomatoActivity.this, TomatoFruitActivity.class));
            }
            public void onSwipeLeft(){
                startActivity(new Intent(TomatoActivity.this, TomatoSeedActivity.class));
            }
        });*/
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(TomatoActivity.this, MainTomatoActivity.class));
    }
}