package com.example.tvshows.listeners;

import com.example.tvshows.models.TVShow;

public interface WatchlistListener {
    void onTVShowClicked(TVShow tvShow);
    void removeTvShowFromWatchlist(TVShow tvShow,int position);
}
