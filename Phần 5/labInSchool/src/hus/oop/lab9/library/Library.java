package hus.oop.lab9.library;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRents() {
        long longestRent = Long.MIN_VALUE;
        for (int i = 0; i < rents.length; i++) {
            if (longestRent < rents[i].getLongDay()) {
                longestRent = rents[i].getLongDay();
            }
        }

        for (int i = 0; i < rents.length; i++) {
            if (longestRent == rents[i].getLongDay()) {
                return rents[i];
            }
        }

        return null;
    }
}
