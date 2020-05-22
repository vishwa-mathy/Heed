package com.example.heed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.bestsoft32.tt_fancy_gif_dialog_lib.TTFancyGifDialog;
import com.bestsoft32.tt_fancy_gif_dialog_lib.TTFancyGifDialogListener;

public class Savings extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    CardView readmore,invest,onlinebus,unwantedsubs,trim;

    Animation cardanim,scrollanim;
    RelativeLayout layout;
    ScrollView slayout;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }


        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savings);

        toolbar=findViewById(R.id.toolbarsavings);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        readmore = (CardView) findViewById(R.id.savingreadcard);
        readmore.setOnClickListener((View.OnClickListener)this);

        cardanim= AnimationUtils.loadAnimation(this,R.anim.category_top);


        scrollanim= AnimationUtils.loadAnimation(this,R.anim.catogory_bottom);


        layout = findViewById(R.id.relmain);
        slayout= findViewById(R.id.scrollView);

        layout.setAnimation(cardanim);
        slayout.setAnimation(scrollanim);

        invest = (CardView) findViewById(R.id.investcard);
        onlinebus = (CardView) findViewById(R.id.onlinebuscard);
        unwantedsubs= (CardView) findViewById(R.id.unwantedsubscard);
        trim = (CardView) findViewById(R.id.trimcard);



        invest.setOnClickListener(this);
        onlinebus.setOnClickListener(this);
        unwantedsubs.setOnClickListener(this);
        trim.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        if (v.getId() == R.id.savingreadcard) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.cnbc.com/2020/04/11/simple-ways-to-save-money-during-the-coronavirus-pandemic.html"));
            startActivity(i);
        }
        if(v.getId() == R.id.investcard)
        {
            new TTFancyGifDialog.Builder(Savings.this)
                    .setTitle("Invest in Stocks")
                    .setMessage("Investing your money in good stocks could help your money grow in lockdown.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#AF89F0")
                    .setGifResource(R.drawable.idea1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if(v.getId() == R.id.onlinebuscard)
        {
            new TTFancyGifDialog.Builder(Savings.this)
                    .setTitle("Online Business")
                    .setMessage("Start a online business so that you could have steady income.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#AF89F0")
                    .setGifResource(R.drawable.idea1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if(v.getId() == R.id.unwantedsubscard)
        {
            new TTFancyGifDialog.Builder(Savings.this)
                    .setTitle("Cancel Subscriptions")
                    .setMessage("Cancelling your unwanted subscriptions could help in saving money.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#AF89F0")
                    .setGifResource(R.drawable.idea1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if(v.getId() == R.id.trimcard)
        {
            new TTFancyGifDialog.Builder(Savings.this)
                    .setTitle("Trim expenses")
                    .setMessage("Trim or reduce all your unwanted spendings.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#AF89F0")
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
