package hus.oop.lab8.comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        if (o1.getRating() - o2.getRating() < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
