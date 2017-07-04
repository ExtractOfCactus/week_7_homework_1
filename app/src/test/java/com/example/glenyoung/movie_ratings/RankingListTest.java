package com.example.glenyoung.movie_ratings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by glenyoung on 03/07/2017.
 */

public class RankingListTest {
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;
    Movie movie7;
    Movie movie8;
    Movie movie9;
    Movie movie10;
    RankingList rankingList;
    Movie[] testRankings;

    @Before
    public void before() {
        movie1 = new Movie("The Shawshank Redemption", "Drama", 1);
        movie2 = new Movie("The Godfather", "Crime", 2);
        movie3 = new Movie("The Godfather: Part 2", "Crime", 3);
        movie4 = new Movie("The Dark Knight", "Action", 4);
        movie5 = new Movie("12 Angry Men", "Drama", 5);
        movie6 = new Movie("Schindler's List", "History", 6);
        movie7 = new Movie("Pulp Fiction", "Crime", 7);
        movie8 = new Movie("TLOTR: The Return Of The King", "Adventure", 8);
        movie9 = new Movie("The Good, the Bad and the Ugly", "Western", 9);
        movie10 = new Movie("Fight Club", "Drama", 10);
        testRankings = new Movie[] {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        rankingList = new RankingList(testRankings);

    }



    @Test
    public void canFindMovieByRank() {
        assertEquals(movie4, rankingList.findMovieByRank(4));
    }

    @Test
    public void canReplaceMovie() {
        Movie newMovie = new Movie("Forrest Gump", "Biography", 10);
        rankingList.replaceMovie(newMovie, 10);
        assertEquals(newMovie, rankingList.findMovieByRank(10));
    }

    @Test
    public void canFindMovieByTitle() {
        assertEquals(movie2, rankingList.findMovieByTitle("The Godfather"));
    }

    @Test
    public void canMoveAMovieInRankings() {
        rankingList.moveMovieInRankings("Pulp Fiction", 4);
        assertEquals(movie7, rankingList.findMovieByRank(4));
        assertEquals(5, movie5.getCurrentRanking());
    }
}
