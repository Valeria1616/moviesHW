package ru.netology.movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void shouldAddNullMovies() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("");

        String[] expected = {""};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeMovies() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddSixMovies() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithoutLimitFirst() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");

        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithoutLimitSecond() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");

        String[] expected = {"Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithoutLimitThird() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");

        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithLimitFirst() {
        MoviesManager manager = new MoviesManager(6);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");

        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithLimitSecond() {
        MoviesManager manager = new MoviesManager(6);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithLimitThird() {
        MoviesManager manager = new MoviesManager(6);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        manager.addMovie("Film VII");

        String[] expected = {"Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}