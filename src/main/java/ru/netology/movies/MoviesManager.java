package ru.netology.movies;

public class MoviesManager {

    private String[] movieNames = new String[0];
    private int limit;

    public MoviesManager() {
        this.limit = 5;
    }

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    //Добавление нового фильма
    public void addMovie(String movieName) {
        String[] tmp = new String[movieNames.length + 1];
        for (int i = 0; i < movieNames.length; i++) {
            tmp[i] = movieNames[i];
        }
        tmp[tmp.length - 1] = movieName;
        movieNames = tmp;
    }

    //Вывод всех фильмов в порядке добавления (findAll)
    public String[] findAll() {
        return movieNames;
    }

    //Вывод максимально лимит* штук последних добавленных фильмов в обратном от добавления порядке (findLast)
    public String[] findLast() {
        int resultLength;
        if (movieNames.length < limit) {
            resultLength = movieNames.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movieNames[movieNames.length - 1 - i];
        }
        return tmp;
    }

}
