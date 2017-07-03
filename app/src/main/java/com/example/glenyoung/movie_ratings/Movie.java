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

    public String getGenre() {
        return genre;
    }

    public int getCurrentRanking() {
        return currentRanking;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCurrentRanking(int currentRanking) {
        this.currentRanking = currentRanking;
    }

    public String toString() {
        return "Title: " + this.title +", Genre: " + this.genre + ", Ranking: " + this.currentRanking;
    }
}
