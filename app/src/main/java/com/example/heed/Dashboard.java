package com.example.heed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.drm.DrmStore;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import com.google.android.material.navigation.NavigationView;

public class Dashboard extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {


    private CardView general, food, parenting, students, teachers, workers, saving,qry;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem menuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        //defining cards
        general = (CardView) findViewById(R.id.generalcard);
        food = (CardView) findViewById(R.id.foodHabitsCard);
        parenting = (CardView) findViewById(R.id.goodParentingCard);
        students = (CardView) findViewById(R.id.studentsCard);
        teachers = (CardView) findViewById(R.id.teachersCard);
        workers = (CardView) findViewById(R.id.workersCard);
        saving = (CardView) findViewById(R.id.savingsCard);
        qry = (CardView) findViewById(R.id.qrycard);


        //click listener
        general.setOnClickListener(this);
        food.setOnClickListener(this);
        parenting.setOnClickListener(this);
        students.setOnClickListener(this);
        teachers.setOnClickListener(this);
        workers.setOnClickListener(this);
        saving.setOnClickListener(this);
        qry.setOnClickListener(this);


        //hooks
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        //toolbar

        setSupportActionBar(toolbar);

        //navigation drawer
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.generalcard:
                i = new Intent(this, GeneralActivity.class);
                startActivity(i);
                break;
            case R.id.foodHabitsCard:
                i = new Intent(this, FoodHabitsActivity.class);
                startActivity(i);
                break;
            case R.id.goodParentingCard:
                i = new Intent(this, Parenting.class);
                startActivity(i);
                break;
            case R.id.studentsCard:
                i = new Intent(this, Students.class);
                startActivity(i);
                break;
            case R.id.teachersCard:
                i = new Intent(this, Teachers.class);
                startActivity(i);
                break;
            case R.id.workersCard:
                i = new Intent(this, Workers.class);
                startActivity(i);
                break;
            case R.id.savingsCard:
                i = new Intent(this, Savings.class);
                startActivity(i);
                break;
            case R.id.qrycard:
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSewh4UNvHcafwJgRq-36432d8ALJAkG1rcwgK0CF_qUMNGHlg/viewform?usp=sf_link"));
                startActivity(i);
            default:
                break;


        }


    }

    @SuppressLint("WrongConstant")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Intent i;
        switch (menuItem.getItemId()) {

            case R.id.generalmenu:
                i = new Intent(Dashboard.this, GeneralActivity.class);
                startActivity(i);
                break;
            case R.id.FoodHabitsmenu:
                i = new Intent(this, FoodHabitsActivity.class);
                startActivity(i);
                break;
            case R.id.parentingmenu:
                i = new Intent(this, Parenting.class);
                startActivity(i);
                break;
            case R.id.Studentsmenu:
                i = new Intent(this, Students.class);
                startActivity(i);
                break;
            case R.id.teachersmenu:
                i = new Intent(this, Teachers.class);
                startActivity(i);
                break;
            case R.id.workersmenu:
                i = new Intent(this, Workers.class);
                startActivity(i);
                break;
            case R.id.savingmenu:
                i = new Intent(this, Savings.class);
                startActivity(i);
                break;
            case R.id.exit:
                this.finish();

                System.exit(0);
                break;
            case R.id.about:
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://drive.google.com/open?id=1Afhv9TSX55MXeA-kAvFovq0FCDMqYI_Y"));
                startActivity(i);

            default:
                break;


        }
        drawerLayout.closeDrawer(Gravity.START, true);

        return true;
    }
}
