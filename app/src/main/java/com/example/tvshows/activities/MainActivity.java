package com.example.tvshows.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.tvshows.adapters.TVShowAdapter;
import com.example.tvshows.R;
import com.example.tvshows.models.TVShow;
import com.example.tvshows.viewmodels.MostPopularTVShowsViewModel;
import com.example.tvshows.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private MostPopularTVShowsViewModel viewModel;
    private List<TVShow> tvShows = new ArrayList<>();
    private TVShowAdapter tvShowAdapter;
   



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        doInitialization();

    }

    private void doInitialization() {
        activityMainBinding.rvTvShows.setHasFixedSize(true);
        viewModel = new ViewModelProvider(this).get(MostPopularTVShowsViewModel.class);
        tvShowAdapter = new TVShowAdapter(tvShows);
        activityMainBinding.rvTvShows.setAdapter(tvShowAdapter);


        getMostPopularTVShows();
    }


    @SuppressLint("NotifyDataSetChanged")
    private void getMostPopularTVShows() {
        activityMainBinding.setIsLoading(true);
        viewModel.getMostPopularTVShows(0).observe(this, mostPopularTVShowsResponse -> {

            activityMainBinding.setIsLoading(false);
            if (mostPopularTVShowsResponse!=null){
                if (mostPopularTVShowsResponse.getTvShows()!=null){
                    tvShows.addAll(mostPopularTVShowsResponse.getTvShows());
                    tvShowAdapter.notifyDataSetChanged();
                }
            }

        });
    }

}