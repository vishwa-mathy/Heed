package com.example.heed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.bestsoft32.tt_fancy_gif_dialog_lib.TTFancyGifDialog;
import com.bestsoft32.tt_fancy_gif_dialog_lib.TTFancyGifDialogListener;

public class FoodHabitsActivity extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    private CardView readmore,healthy,green,water,avoidjunk;
    Animation cardanim,scrollanim;
    RelativeLayout layout;
    ScrollView slayout;





    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }


        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_habits);

        toolbar = findViewById(R.id.toolbarfoodhabit);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        readmore = (CardView) findViewById(R.id.foodhabitreadcard);
        readmore.setOnClickListener((View.OnClickListener) this);

        cardanim= AnimationUtils.loadAnimation(this,R.anim.category_top);
        scrollanim= AnimationUtils.loadAnimation(this,R.anim.catogory_bottom);

        layout = findViewById(R.id.relmain);
        slayout= findViewById(R.id.scrollView);

        layout.setAnimation(cardanim);
        slayout.setAnimation(scrollanim);


        healthy = (CardView) findViewById(R.id.healthyeating);
        green = (CardView) findViewById(R.id.eatgreen);
        water = (CardView) findViewById(R.id.drinkwater);
        avoidjunk = (CardView) findViewById(R.id.avoidjunk);



        healthy.setOnClickListener(this);
        green.setOnClickListener(this);
        water.setOnClickListener(this);
        avoidjunk.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {

        Intent i;
        if (v.getId() == R.id.foodhabitreadcard) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.unicef.org/coronavirus/easy-affordable-and-healthy-eating-tips-during-coronavirus-disease-covid-19-outbreak"));
            startActivity(i);
        }
        if(v.getId() == R.id.healthyeating)
        {
            new TTFancyGifDialog.Builder(FoodHabitsActivity.this)
                    .setTitle("Healthier Eating")
                    .setMessage("Emphasizes fruits, vegetables, whole grains, and fat-free or low-fat milk and milk products.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#22b573")
                    .setGifResource(R.drawable.idea1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if(v.getId() == R.id.eatgreen)
        {
            new TTFancyGifDialog.Builder(FoodHabitsActivity.this)
                    .setTitle("Fresh greens")
                    .setMessage("Eating raw vegetables gives you the most enzymes, vitamins and minerals needed for good health. Eg. Spinach ,Broccoli.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#22b573")
                    .setGifResource(R.drawable.idea1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if(v.getId() == R.id.drinkwater)
        {
            new TTFancyGifDialog.Builder(FoodHabitsActivity.this)
                    .setTitle("Drink Water")
                    .setMessage("Mild dehydrationcan impair energy levels and mood, and lead to major reductions in health performance.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#22b573")
                    .setGifResource(R.drawable.idea1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if(v.getId() == R.id.avoidjunk)
        {
            new TTFancyGifDialog.Builder(FoodHabitsActivity.this)
                    .setTitle("Avoid junks")
                    .setMessage("Eating junk food on a regular basis can lead to an increased risk of obesity and chronic diseases.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#22b573")
                    .setGifResource(R.drawable.idea1)     //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }

    }

}