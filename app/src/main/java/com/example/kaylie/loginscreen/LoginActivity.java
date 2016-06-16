package com.example.kaylie.loginscreen;

import android.app.ActionBar;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView tx = (TextView)findViewById(R.id.tvTitle);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/ufonts.com_bello-script.ttf");

        tx.setTypeface(custom_font);

        Button btEmail = (Button)findViewById(R.id.btEmail);

        Typeface custom_font2 = Typeface.createFromAsset(getAssets(),  "fonts/Roboto-Regular.ttf");

        btEmail.setTypeface(custom_font2);

        //ActionBar actionBar = getActionBar();

        //actionBar.setIcon(R.drawable.airbnb_icon);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.airbnb_icon);


    }


}
