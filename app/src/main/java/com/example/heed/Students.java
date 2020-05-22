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

public class Students extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;

    CardView readmore,arts,skills,engage,friends;

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
        setContentView(R.layout.activity_students);

        toolbar = findViewById(R.id.toolbarstudent);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        readmore = (CardView) findViewById(R.id.studentsreadcard);
        readmore.setOnClickListener((View.OnClickListener) this);

        cardanim = AnimationUtils.loadAnimation(this, R.anim.category_top);


        scrollanim = AnimationUtils.loadAnimation(this, R.anim.catogory_bottom);


        layout = findViewById(R.id.relmain);
        slayout = findViewById(R.id.scrollView);

        layout.setAnimation(cardanim);
        slayout.setAnimation(scrollanim);

        arts = (CardView) findViewById(R.id.arts);
        skills = (CardView) findViewById(R.id.skills);
        engage = (CardView) findViewById(R.id.family);
        friends = (CardView) findViewById(R.id.connectwithfriendscard);



        arts.setOnClickListener(this);
        skills.setOnClickListener(this);
        engage.setOnClickListener(this);
        friends.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        if (v.getId() == R.id.studentsreadcard) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.indiatoday.in/education-today/tips-and-tricks/story/coronavirus-outbreak-tips-for-students-to-brush-up-on-academics-online-during-covid-19-lockdown-1664722-2020-04-08"));
            startActivity(i);
        }
        if (v.getId() == R.id.arts) {
            new TTFancyGifDialog.Builder(Students.this)
                    .setTitle("Practise Art")
                    .setMessage("Practising arts could help your concentration.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#EE8BAC")
                    .setGifResource(R.drawable.idea1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if (v.getId() == R.id.skills) {
            new TTFancyGifDialog.Builder(Students.this)
                    .setTitle("Learn new skills")
                    .setMessage("Try to learn new skill to compete with the world.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#EE8BAC")
                    .setGifResource(R.drawable.idea1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if (v.getId() == R.id.family) {
            new TTFancyGifDialog.Builder(Students.this)
                    .setTitle("Engage with Family")
                    .setMessage("This is the best time to spend time with your family.Enjoy!")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#EE8BAC")
                    .setGifResource(R.drawable.idea1)     //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if (v.getId() == R.id.connectwithfriendscard) {
            new TTFancyGifDialog.Builder(Students.this)
                    .setTitle("Connect with friends")
                    .setMessage("Dont forget to spend time with your friends too.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#EE8BAC")
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
