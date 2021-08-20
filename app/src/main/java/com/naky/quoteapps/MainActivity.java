    package com.naky.quoteapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;

import com.naky.quoteapps.databinding.ActivityMainBinding;

    public class MainActivity extends FragmentActivity implements Animation.AnimationListener, View.OnClickListener{

    ActivityMainBinding binding;
    private Toolbar toolbar;
    private Fragment fragment;
    SquareButton  bt1, bt2, bt3, bt4, bt5, bt6;
    Animation animation;
    int btIndex = 1;
    final Handler handler1 = new Handler();
    final Handler handler2 = new Handler();
    final Handler handler3 = new Handler();
    final Handler handler4 = new Handler();
    final Handler handler5 = new Handler();
    final Handler handler6 = new Handler();

    int btIndex1 = 1;
    int btIndex2 = 1;
    int btIndex3 = 1;
    int btIndex4 = 1;
    int btIndex5 = 1;
    int btIndex6 = 1;

    final String isBookMark = "isBookMark";
    final String categoryId = "category_id";
    final String pref_name = "preference";

    Bundle bundle = new Bundle();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {

        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }

        @Override
        public void onClick(View view) {

        }
    }