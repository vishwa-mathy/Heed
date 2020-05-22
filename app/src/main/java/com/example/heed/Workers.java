package com.example.heed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.bestsoft32.tt_fancy_gif_dialog_lib.TTFancyGifDialog;
import com.bestsoft32.tt_fancy_gif_dialog_lib.TTFancyGifDialogListener;

public class Workers extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    CardView readmore,wfh,online,caution,rest;

    Animation cardanim, scrollanim;
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
        setContentView(R.layout.activity_workers);

        toolbar = findViewById(R.id.toolbarworkers);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        readmore = (CardView) findViewById(R.id.workersreadcard);
        readmore.setOnClickListener((View.OnClickListener) this);

        cardanim = AnimationUtils.loadAnimation(this, R.anim.category_top);
        scrollanim = AnimationUtils.loadAnimation(this, R.anim.catogory_bottom);


        layout = findViewById(R.id.relmain);
        slayout = findViewById(R.id.scrollView);

        layout.setAnimation(cardanim);
        slayout.setAnimation(scrollanim);

        wfh = (CardView) findViewById(R.id.wfhcard);
        online= (CardView) findViewById(R.id.onlinejobscard);
        caution = (CardView) findViewById(R.id.cautioncard);
        rest = (CardView) findViewById(R.id.restcard);



        wfh.setOnClickListener(this);
        online.setOnClickListener(this);
        caution.setOnClickListener(this);
        rest.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent i;
        if (v.getId() == R.id.workersreadcard) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.scmagazine.com/home/opinion/executive-insight/five-tips-for-managing-remote-workers-during-a-pandemic/"));
            startActivity(i);
        }
        if (v.getId() == R.id.wfhcard) {
            new TTFancyGifDialog.Builder(Workers.this)
                    .setTitle("Work from home")
                    .setMessage("Try to keep on your work by working from home.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#787B7E")
                    .setGifResource(R.drawable.idea1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if (v.getId() == R.id.onlinejobscard) {
            new TTFancyGifDialog.Builder(Workers.this)
                    .setTitle("Online jobs")
                    .setMessage("Try to search for online jobs and interns.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#787B7E")
                    .setGifResource(R.drawable.idea1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if (v.getId() == R.id.cautioncard) {
            new TTFancyGifDialog.Builder(Workers.this)
                    .setTitle("Work with caution")
                    .setMessage("If your work is somewhere, try to work with caution.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#787B7E")
                    .setGifResource(R.drawable.idea1)     //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if (v.getId() == R.id.restcard) {
            new TTFancyGifDialog.Builder(Workers.this)
                    .setTitle("Take Rest")
                    .setMessage("This is the precious time for getting rest. You will never get this back!")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#787B7E")
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
