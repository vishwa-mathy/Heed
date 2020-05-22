package com.example.heed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
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

import java.util.ArrayList;
import java.util.List;

public class GeneralActivity extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    CardView read,handwash,stayhome,wearmask,stayconnected;
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
        setContentView(R.layout.activity_general);

        toolbar=findViewById(R.id.toolbargeneral);

        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        read=(CardView) findViewById(R.id.generalreadcard);
        read.setOnClickListener((View.OnClickListener)this);

        cardanim= AnimationUtils.loadAnimation(this,R.anim.category_top);


        scrollanim= AnimationUtils.loadAnimation(this,R.anim.catogory_bottom);


        layout = findViewById(R.id.relmain);
        slayout= findViewById(R.id.scrollView);

        layout.setAnimation(cardanim);
        slayout.setAnimation(scrollanim);


        handwash = (CardView) findViewById(R.id.handwash);
        stayhome = (CardView) findViewById(R.id.stayhome);
        stayconnected = (CardView) findViewById(R.id.stayconnected);
        wearmask = (CardView) findViewById(R.id.wearmask);



        handwash.setOnClickListener(this);
        stayhome.setOnClickListener(this);
        stayconnected.setOnClickListener(this);
        wearmask.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        Intent i;
        if(v.getId()== R.id.generalreadcard )
        {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public"));
            startActivity(i);
        }
        if(v.getId() == R.id.handwash)
        {
            new TTFancyGifDialog.Builder(GeneralActivity.this)
                    .setTitle("Hand Wash")
                    .setMessage("Washing hand could reduce 95% of virus attack.")
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
        if(v.getId() == R.id.stayhome)
        {
            new TTFancyGifDialog.Builder(GeneralActivity.this)
                    .setTitle("Stay Home")
                    .setMessage("Keeping yourself home could help to break the spread chain.")
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
        if(v.getId() == R.id.wearmask)
        {
            new TTFancyGifDialog.Builder(GeneralActivity.this)
                    .setTitle("Wear masks")
                    .setMessage("Wearing masks could help yourself to prevent from air borne virus.")
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
        if(v.getId() == R.id.stayconnected)
        {
            new TTFancyGifDialog.Builder(GeneralActivity.this)
                    .setTitle("Stay Connected")
                    .setMessage("Enjoy with friends with digital mediums could enhance your bondings.")
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
