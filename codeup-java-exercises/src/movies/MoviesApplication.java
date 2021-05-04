package movies;

import util.Input;

import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] allMovies = MoviesArray.findAll();
        String[] genres = genreList(allMovies);
        options(genreList(allMovies));
        Display(userChoice(genreList(allMovies)),allMovies, genres);
    }

    public static String[] genreList(Movie[] allMovies) {
        String[] genresOnly = new String[allMovies.length];
        int i = 0;
        for (Movie allMovie : allMovies) {
            genresOnly[i] = allMovie.getMovie()[1];
            i += 1;
        }
        String[] uniqueGenres = Arrays.stream(genresOnly).distinct().toArray(String[]::new);
        return uniqueGenres;
    }

    public static String[] options(String[] uniqueGenres) {
        System.out.println("What would you like to do with all the movies");
        System.out.println("0 - exit");
        System.out.println("1 - View all movies");
        int i = 2;
        for (String uniqueGenre : uniqueGenres) {
            System.out.printf("%s - View %s movies\n", i, uniqueGenre);
            i += 1;
        }
        return uniqueGenres;
    }

    public static int userChoice(String[] uniqueGenres) {
        int userInput = Input.getInt(0, uniqueGenres.length + 1);
        return userInput;
    }

    public static boolean Display(int UserInput, Movie[] allMovies, String[] uniqueGenres) {
        switch (UserInput) {
            case 0:
                System.out.println("Goodbye, Thanks for stopping by!");
                break;
            case 1:
                for (Movie allmovie : allMovies) {
                    System.out.printf("%s -- %s\n", allmovie.getMovie()[0], allmovie.getMovie()[1]);
                }
                break;
            default:
                for (int i = 0; i < uniqueGenres.length; i++) {
                    if ((UserInput - 2) == i) {
                        for (Movie allmovie : allMovies) {
                            if (allmovie.getMovie()[1].equals(uniqueGenres[1])) {
                                System.out.printf("%s -- %s\n", allmovie.getMovie()[0], allmovie.getMovie()[1]);
                            }
                        }
                    }
                }
        }
        return Input.yesNo();
    }


}
