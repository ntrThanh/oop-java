package hus.oop.lab8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Movie> listMovie = new ArrayList<>();
        listMovie.add(new Movie("Force Awaken", 8.3, 2015));
        listMovie.add(new Movie("Star War", 8.7, 1977));
        listMovie.add(new Movie("Empire Strikes Back", 8.8, 1980));
        listMovie.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(listMovie, ratingCompare);

        for (Movie movie : listMovie) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
        System.out.println();

        System.out.println("Sorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(listMovie, nameCompare);
        for (Movie movie : listMovie) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
        System.out.println();

        System.out.println("Sorted by year");
        Collections.sort(listMovie);
        for (Movie movie : listMovie) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
