package com.example.glenyoung.movie_ratings;

/**
 * Created by glenyoung on 03/07/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private int currentRanking;

    public Movie(String title, String genre, int currentRanking) {
        this.title = title;
        this.genre = genre;
        this.currentRanking = currentRanking;
    }

    public String getTitle() {
        return title;
    }
}
