package com.example.com.caminfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class ProfileP extends AppCompatActivity {
    ImageView ivLokal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_p);
        ivLokal =  findViewById(R.id.fotoku);
        Glide.with(this)
                .load(R.drawable.mhs)
                .apply(RequestOptions.circleCropTransform())
                .into(ivLokal);
        Button LogoutButton = findViewById(R.id.LogoutButton);
        LogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SplashScreen.class));
                finish();
            }
        });
    }
}
