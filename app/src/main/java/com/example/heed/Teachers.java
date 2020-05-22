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

public class Teachers extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    CardView readmore,skills,webinar,motivate,love;

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
        setContentView(R.layout.activity_teachers);

        toolbar = findViewById(R.id.toolbarteachers);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        readmore = (CardView) findViewById(R.id.teachersreadcard);
        readmore.setOnClickListener((View.OnClickListener) this);

        cardanim = AnimationUtils.loadAnimation(this, R.anim.category_top);
        scrollanim = AnimationUtils.loadAnimation(this, R.anim.catogory_bottom);


        layout = findViewById(R.id.relmain);
        slayout = findViewById(R.id.scrollView);

        layout.setAnimation(cardanim);
        slayout.setAnimation(scrollanim);

        skills = (CardView) findViewById(R.id.improveskillscard);
        webinar = (CardView) findViewById(R.id.webinarcard);
        motivate = (CardView) findViewById(R.id.motivatecard);
        love = (CardView) findViewById(R.id.lovecard);



        skills.setOnClickListener(this);
        webinar.setOnClickListener(this);
        motivate.setOnClickListener(this);
        love.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        if (v.getId() == R.id.teachersreadcard) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.understood.org/en/school-learning/for-educators/universal-design-for-learning/practicing-self-care-during-coronavirus-5-tips-for-teachers"));
            startActivity(i);
        }
        if (v.getId() == R.id.improveskillscard) {
            new TTFancyGifDialog.Builder(Teachers.this)
                    .setTitle("Improve Skills")
                    .setMessage("Teacher should also learn the emerging skills in industry.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#63ACE9")
                    .setGifResource(R.drawable.idea1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if (v.getId() == R.id.webinarcard) {
            new TTFancyGifDialog.Builder(Teachers.this)
                    .setTitle("Conduct webinars")
                    .setMessage("Conducting webinars could help students to stay on track.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#63ACE9")
                    .setGifResource(R.drawable.idea1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if (v.getId() == R.id.motivatecard) {
            new TTFancyGifDialog.Builder(Teachers.this)
                    .setTitle("Motivate students")
                    .setMessage("Motivate students by giving them carrier tips and activities.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#63ACE9")
                    .setGifResource(R.drawable.idea1)     //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {

                        }
                    })
                    .build();
        }
        if (v.getId() == R.id.lovecard) {
            new TTFancyGifDialog.Builder(Teachers.this)
                    .setTitle("Love them more")
                    .setMessage("Always try to love your family and close circles.")
                    .setPositiveBtnText("Close")
                    .setPositiveBtnBackground("#63ACE9")
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
