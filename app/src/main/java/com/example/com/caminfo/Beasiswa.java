package com.example.com.caminfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Beasiswa extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beasiswa);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        CardView btn1 = (CardView) findViewById(R.id.beasiswabidikmisi);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Profile personal
                startActivity(new Intent(getApplicationContext(), RincianBidikmisi.class));
            }
        });
        CardView btn2 = (CardView) findViewById(R.id.beasiswappa);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RincianBidikmisi.class));
            }
        });
        CardView btn3 = (CardView) findViewById(R.id.beasiswadjarum);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RincianBidikmisi.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.beasiswa, menu);
        ImageView PP = findViewById(R.id.profileku_beranda);
        PP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Profile personal
                startActivity(new Intent(getApplicationContext(), ProfileP.class));
            }
        });
        Glide.with(this)
                .load(R.drawable.mhs)
                .apply(RequestOptions.circleCropTransform())
                .into(PP);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_beranda) {
            startActivity(new Intent(getApplicationContext(), Beranda.class));
            finish();
        } else if (id == R.id.nav_profile) {
            startActivity(new Intent(getApplicationContext(), Profile.class));
            finish();
        } else if (id == R.id.nav_khs) {
            startActivity(new Intent(getApplicationContext(), KHS.class));
            finish();
        } else if (id == R.id.nav_jadwal) {
            startActivity(new Intent(getApplicationContext(), Jadwal.class));
            finish();
        } else if (id == R.id.nav_tugas) {
            startActivity(new Intent(getApplicationContext(), Tugas.class));
            finish();
        } else if (id == R.id.nav_beasiswa) {
            startActivity(new Intent(getApplicationContext(), Beasiswa.class));
            finish();
        } else if (id == R.id.nav_presensi) {
            startActivity(new Intent(getApplicationContext(), Presensi.class));
            finish();
        } else if (id == R.id.nav_logout) {
            startActivity(new Intent(getApplicationContext(), SplashScreen.class));
            finish();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
