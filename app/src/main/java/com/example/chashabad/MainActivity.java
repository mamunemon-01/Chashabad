package com.example.chashabad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import java.util.Locale;
import java.util.Objects;

import kotlinx.coroutines.flow.Flow;

public class MainActivity extends AppCompatActivity {
    TextView titleText, seed_fig_name, seedling_fig_name, vine_fig_name, flower_fig_name, fruit_fig_name, cucumber_fig_name, guideText;
    Button langBtn;
    ImageButton btn1, btn2, btn3, btn4, btn5, btn6;
    Context context;
    Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences sharedPref = MainActivity.this.getPreferences(Context.MODE_PRIVATE);
        String locale = sharedPref.getString("language", "bn");

        context = LocaleHelper.setLocale(MainActivity.this, locale);
        //System.out.println("\n\n");
        //System.out.println(getResources().getConfiguration().locale);
        //System.out.println("\n\n");

        setTheme(R.style.Theme_Chashabad);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        if(Objects.isNull(getSupportActionBar())){
            setSupportActionBar(toolbar);
        }else{
            getSupportActionBar().hide();
            toolbar.setTitle(getResources().getText(R.string.app_name));
        }

        // text and button view reference
        titleText = (TextView) findViewById(R.id.title_textView);
        seed_fig_name = (TextView) findViewById(R.id.seed_fig_name);
        seedling_fig_name = (TextView) findViewById(R.id.seedling_fig_name);
        vine_fig_name = (TextView) findViewById(R.id.vine_fig_name);
        flower_fig_name = (TextView) findViewById(R.id.flower_fig_name);
        fruit_fig_name = (TextView) findViewById(R.id.fruit_fig_name);
        cucumber_fig_name = (TextView) findViewById(R.id.cucumber_fig_name);
        guideText = (TextView) findViewById(R.id.guide_textView);
        langBtn = findViewById(R.id.lang_button);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);

        resources = context.getResources();

        titleText.setText(resources.getString(R.string.title_text));
        seed_fig_name.setText(resources.getString(R.string.title_activity_seed));
        seedling_fig_name.setText(resources.getString(R.string.title_activity_seedling));
        vine_fig_name.setText(resources.getString(R.string.title_activity_vine));
        flower_fig_name.setText(resources.getString(R.string.title_activity_flower));
        fruit_fig_name.setText(resources.getString(R.string.title_activity_fruit));
        cucumber_fig_name.setText(resources.getString(R.string.title_activity_cucumber));
        guideText.setText(resources.getString(R.string.guide_text));
        //guideText.setText(getResources().getString(R.string.guide_text));
        langBtn.setText(resources.getString(R.string.lang_btn_text));
        //langBtn.setText(getResources().getString(R.string.lang_btn_text));

        SharedPreferences.Editor editor = sharedPref.edit();

        langBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Locale current_locale = getResources().getConfiguration().locale;

                //System.out.println("\n\n");
                //System.out.println(current_locale);
                //System.out.println("\n\n");

                if(current_locale.getLanguage().toString().equals("en")){
                    context = LocaleHelper.setLocale(MainActivity.this, "bn");
                    //SharedPreferences bnSharedPref = MainActivity.this.getPreferences(Context.MODE_PRIVATE);
                    //SharedPreferences.Editor bnEditor = bnSharedPref.edit();
                    //bnEditor.putString("language", "bn");
                    editor.putString("language", "bn");
                    //bnEditor.commit();
                }else{
                    context = LocaleHelper.setLocale(MainActivity.this, "en");
                    //SharedPreferences enSharedPref = MainActivity.this.getPreferences(Context.MODE_PRIVATE);
                    //SharedPreferences.Editor enEditor = enSharedPref.edit();
                    //enEditor.putString("language", "en");
                    editor.putString("language", "en");
                    //enEditor.commit();
                }

                editor.apply();
                resources = context.getResources();

                titleText.setText(resources.getString(R.string.title_text));
                seed_fig_name.setText(resources.getString(R.string.title_activity_seed));
                seedling_fig_name.setText(resources.getString(R.string.title_activity_seedling));
                vine_fig_name.setText(resources.getString(R.string.title_activity_vine));
                flower_fig_name.setText(resources.getString(R.string.title_activity_flower));
                fruit_fig_name.setText(resources.getString(R.string.title_activity_fruit));
                cucumber_fig_name.setText(resources.getString(R.string.title_activity_cucumber));
                guideText.setText(resources.getString(R.string.guide_text));
                //guideText.setText(getResources().getString(R.string.guide_text));
                langBtn.setText(resources.getString(R.string.lang_btn_text));
                //langBtn.setText(getResources().getString(R.string.lang_btn_text));


                toolbar.setTitle(getResources().getText(R.string.app_name));

                /*
                Toolbar thetoolbar = (Toolbar) findViewById(R.id.toolbar);
                thetoolbar.setTitle(getResources().getText(R.string.app_name));

                btn1.setText(resources.getString(R.string.b1_text));
                btn2.setText(resources.getString(R.string.b2_text));
                btn3.setText(resources.getString(R.string.b3_text));
                btn4.setText(resources.getString(R.string.b4_text));
                btn5.setText(resources.getString(R.string.b5_text));
                btn6.setText(resources.getString(R.string.b6_text));
                */
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SeedActivity.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SeedlingActivity.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, VineActivity.class));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FlowerActivity.class));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FruitActivity.class));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CucumberActivity.class));
            }
        });

    }
}