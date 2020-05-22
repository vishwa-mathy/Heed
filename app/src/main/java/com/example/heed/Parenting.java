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

public class Parenting extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;

    CardView readmore,creativeplay,feelings,hugs,food;

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
        setContentView(R.layout.activity_parenting);

        toolbar=findViewById(R.id.toolbargoodparenting);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        readmore = (CardView) findViewById(R.id.parentingreadcard);
        readmore.setOnClickListener((View.OnClickListener)this);

        cardanim= AnimationUtils.loadAnimation(this,R.anim.category_top);


        scrollanim= AnimationUtils.loadAnimation(this,R.anim.catogory_bottom);


        layout = findViewById(R.id.relmain);
        slayout= findViewById(R.id.scrollView);

        layout.setAnimation(cardanim);
        slayout.setAnimation(scrollanim);

        creativeplay = (CardView) findViewById(R.id.creativeplay);
        feelings = (CardView) findViewById(R.id.understandfeeling);
        hugs = (CardView) findViewById(R.id.hugs);
        food = (CardView) findViewById(R.id.deliciousfood);



        creativeplay.setOnClickListener(this);
        feelings.setOnClickListener(this);
        hugs.setOnClickListener(this);
        food.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;
        if(v.getId()== R.id.parentingreadcard )
        {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.healthychildren.org/English/family-life/family-dynamics/communication-discipline/Pages/Positive-Parenting-and-COVID-19_10-Tips.aspx"));
            startActivity(i);
        }
        if(v.getId() == R.id.creativeplay)
        {
            new TTFancyGifDialog.Builder(Parenting.this)
                    .setTitle("Creative Play")
                    .setMessage("Keep your children engaged with games help them to overcome lockdowns.")
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
        if(v.getId() == R.id.understandfeeling)
        {
            new TTFancyGifDialog.Builder(Parenting.this)
                    .setTitle("Understand feelings")
                    .setMessage("Understand your child feelings and keep them motivated.")
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
        if(v.getId() == R.id.hugs)
        {
            new TTFancyGifDialog.Builder(Parenting.this)
                    .setTitle("Give hugs")
                    .setMessage("Hugging your children could increase the bond with you.")
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
        if(v.getId() == R.id.deliciousfood)
        {
            new TTFancyGifDialog.Builder(Parenting.this)
                    .setTitle("Make food")
                    .setMessage("Involve your entire family in making food for fun and health.")
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
