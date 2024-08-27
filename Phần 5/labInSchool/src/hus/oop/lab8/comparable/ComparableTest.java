package hus.oop.lab8.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Movie> listMovie = new ArrayList<>();
        listMovie.add(new Movie("Force Awaken", 8.3, 2015));
        listMovie.add(new Movie("Star War", 8.7, 1977));
        listMovie.add(new Movie("Empire Strikes Back", 8.8, 1980));
        listMovie.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(listMovie);

        System.out.println("Movie after sorting: ");
        for (Movie movie : listMovie) {
            System.out.println(movie);
        }
    }
}
