package com.example.tvshows.activities;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.example.tvshows.R;


@SuppressLint("CustomSplashScreen")
public class
SplashScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        LottieAnimationView animationView = findViewById(R.id.animation_view);

        // Set a Lottie listener to detect when the animation has completed.
        animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(@NonNull Animator animation) {
                // Animation has started.
            }

            @Override
            public void onAnimationEnd(@NonNull Animator animation) {
                // Animation has ended, navigate to the main activity.
                Intent intent = new Intent(SplashScreen.this, HomePage.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationCancel(@NonNull Animator animation) {
                // Animation was canceled.
            }

            @Override
            public void onAnimationRepeat(@NonNull Animator animation) {
                // Animation has repeated (if applicable).
            }
        });

        // Start playing the animation.
        animationView.playAnimation();
    }
}