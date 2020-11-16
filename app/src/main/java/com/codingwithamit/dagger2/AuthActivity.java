package com.codingwithamit.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;

import javax.inject.Inject;

public class AuthActivity extends AppCompatActivity {

    @Inject
    Drawable logo;

    @Inject
    RequestManager requestManagerl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        setLogo();
    }



    private void setLogo(){
        requestManagerl
                .load(logo)
                .into((ImageView) findViewById(R.id.login_logo));
    }
}