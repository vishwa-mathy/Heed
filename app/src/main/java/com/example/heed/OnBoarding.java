package com.example.heed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OnBoarding extends AppCompatActivity {


    ViewPager viewPager;
    LinearLayout dotsLayout;



    private PrefManager sharedPreferenceObj;

    SliderAdapter sliderAdapter;
    TextView []dots;

    Button letsGetStarted;
    Animation animation;
    int currentPosition;
    SharedPreferences onBoardingScreen;
    private PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        sharedPreferenceObj=new PrefManager(OnBoarding.this);

        prefManager = new PrefManager(this);

        if(sharedPreferenceObj.getApp_runFirst().equals("FIRST"))
        {
            sharedPreferenceObj.setApp_runFirst("NO");
        }
        else
        {
            Intent intent = new Intent(OnBoarding.this, Dashboard.class);
            startActivity(intent);
            finish();
        }



        setContentView(R.layout.activity_on_boarding);

        //hooks

        viewPager=findViewById(R.id.slider);
        dotsLayout = findViewById(R.id.dots);
        letsGetStarted=findViewById(R.id.get_started_btn);

        //call adapter

        sliderAdapter=new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);

        addDots(0);
        viewPager.addOnPageChangeListener(changeListener);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                onBoardingScreen = getSharedPreferences("onBoardingScreen",MODE_PRIVATE);
//                boolean isFirstTime=onBoardingScreen.getBoolean("firstTime",true);
//                if(isFirstTime) {
//
//                    SharedPreferences.Editor editor=onBoardingScreen.edit();
//                    editor.putBoolean("firstname",false);
//                    editor.commit();
//
//                    Intent intent = new Intent(OnBoarding.this, OnBoarding.class);
//                    startActivity(intent);
//                    finish();
//                }
//                else
//                {
//                    Intent intent = new Intent(OnBoarding.this, Dashboard.class);
//                    startActivity(intent);
//                    finish();
//                }
//            }
//        },SPLASH_SCREEN);


    }
    public void skip(View view)
    {
        startActivity(new Intent(this,Dashboard.class));
        finish();
    }

    public void next(View view)
    {
        viewPager.setCurrentItem(currentPosition+1);
    }
    private void addDots(int position)
    {
        dots=new TextView[4];
        dotsLayout.removeAllViews();

        for(int i=0;i<4;i++)
        {
            dots[i]=new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);

            dotsLayout.addView(dots[i]);

        }

        if(dots.length>=0)
        {
            dots[position].setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }

    ViewPager.OnPageChangeListener changeListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }



        @Override
        public void onPageSelected(int position) {

            addDots(position);
            currentPosition=position;
            int flag = 0;
            if(position ==0)
            {
                letsGetStarted.setVisibility(View.INVISIBLE);
            }else if(position==1)
            {
                letsGetStarted.setVisibility(View.INVISIBLE);
            }
            else if(position==2)
            {
                if(flag==1) {
                    flag=0;
                    animation = AnimationUtils.loadAnimation(OnBoarding.this, R.anim.side_opp);
                    letsGetStarted.setAnimation(animation);
                }
                letsGetStarted.setVisibility(View.INVISIBLE);
            }else if(position==3)
            {   flag=1;
                animation= AnimationUtils.loadAnimation(OnBoarding.this,R.anim.side_animation);
                letsGetStarted.setAnimation(animation);
                letsGetStarted.setVisibility(View.VISIBLE);
            }


        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    public void dashboard(View view) {

        finish();
        startActivity(new Intent(this,Dashboard.class));

    }


}
