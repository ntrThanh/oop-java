package hus.oop.lab10.library;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRents() {
        long maxDay = Long.MIN_VALUE;
        for (int i = 0; i < rents.length; i++) {
            if (maxDay < rents[i].getLongDate()) {
                maxDay = rents[i].getLongDate();
            }
        }

        for (int i = 0; i < rents.length; i++) {
            if (maxDay == rents[i].getLongDate()) {
                return rents[i];
            }
        }
        return null;
    }
}
