package com.example.glenyoung.movie_ratings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by glenyoung on 03/07/2017.
 */

public class MovieTest {
    Movie movie1;
    Movie movie2;

    @Before
    public void before() {
        movie1 = new Movie("The Shawshank Redemption", "Drama", 1);
        movie2 = new Movie("Pulp Fiction", "Crime", 7);
    }

    @Test
    public void canGetTitle() {
        assertEquals("Pulp Fiction", movie2.getTitle());
    }

    @Test
    public void canGetGenre() {
        assertEquals("Drama", movie1.getGenre());
    }

    @Test
    public void canGetCurrentRating() {
        assertEquals(7, movie2.getCurrentRanking());
    }
}
