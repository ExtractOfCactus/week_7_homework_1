package com.example.glenyoung.movie_ratings;

/**
 * Created by glenyoung on 03/07/2017.
 */

public class RankingList {

    private Movie[] rankings;


    public RankingList(Movie[] newRankings) {
        this.rankings = newRankings;
    }

    public Movie findMovieByRank(int rank) {
        for (Movie movie : this.rankings) {
            if (movie.getCurrentRanking() == rank) {
                return movie;
            }
        }
        return null;
    }

    public void replaceMovie(Movie newMovie, int rank) {
        for (Movie movie : this.rankings) {
            if (movie.getCurrentRanking() == rank) {
                rankings[(rank-1)] = newMovie;
            }
        }
    }

    public Movie findMovieByTitle(String title) {
        for (Movie movie : this.rankings) {
            if (movie.getTitle() == title) {
                return movie;
            }
        }
        return null;
    }

//    public void moveMovieInRankings(String title, int newRanking) {
//        Movie targetMovie = findMovieByTitle(title);
//        int oldRanking = targetMovie.getCurrentRanking();
//        for (Movie movie : rankings) {
//            if (movie != targetMovie) {
//                if (movie.getCurrentRanking() >= newRanking && movie.getCurrentRanking() < oldRanking) {
//                    rankings[(movie.getCurrentRanking() + 1)] = movie;
//                }
//            }
//        }
//        targetMovie.setCurrentRanking(newRanking);
//
//        rankings[newRanking - 1] = targetMovie;
//    }

    public void moveMovieInRankings(String title, int newRanking) {
        Movie targetMovie =findMovieByTitle(title);
        targetMovie.setCurrentRanking(newRanking);
        rankings[newRanking - 1] = targetMovie;
    }

}
