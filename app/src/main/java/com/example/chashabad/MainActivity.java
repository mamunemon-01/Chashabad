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
    TextView titleText;
    Button langBtn, cucumberBtn, tomatoBtn, carrotBtn;
    Context context;
    Resources resources;
    //static SharedPreferences sharedPref;
    //static boolean once_appeared = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //if(!once_appeared)
        SharedPreferences sharedPref = MainActivity.this.getPreferences(Context.MODE_PRIVATE);
        //once_appeared = true;
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
        langBtn = findViewById(R.id.lang_button);
        cucumberBtn = findViewById(R.id.cucumber_button);
        tomatoBtn = findViewById(R.id.tomato_button);
        carrotBtn = findViewById(R.id.carrot_button);

        resources = context.getResources();

        titleText.setText(resources.getString(R.string.title_text));
        langBtn.setText(resources.getString(R.string.lang_btn_text));
        //langBtn.setText(getResources().getString(R.string.lang_btn_text));
        cucumberBtn.setText(resources.getString(R.string.title_activity_cucumber));
        tomatoBtn.setText(resources.getString(R.string.title_activity_tomato));
        carrotBtn.setText(resources.getString(R.string.title_activity_carrot));

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
                langBtn.setText(resources.getString(R.string.lang_btn_text));
                //langBtn.setText(getResources().getString(R.string.lang_btn_text));
                cucumberBtn.setText(resources.getString(R.string.title_activity_cucumber));
                tomatoBtn.setText(resources.getString(R.string.title_activity_tomato));
                carrotBtn.setText(resources.getString(R.string.title_activity_carrot));

                toolbar.setTitle(getResources().getText(R.string.app_name));

            }
        });

        cucumberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainCucumberActivity.class));
            }
        });

        tomatoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainTomatoActivity.class));
            }
        });

        carrotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainCarrotActivity.class));
            }
        });
    }
}