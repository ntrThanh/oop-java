package hus.oop.search;

public class BinarySearch implements Search {
    private static BinarySearch instance;
    private Sorter sorter;

    private BinarySearch() {
        /* TODO */
    }

    /**
     * Tạo đối tượng BinarySearch.
     *
     * @return
     */
    public static BinarySearch getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new BinarySearch();
        }

        return instance;
    }

    public void setSorter(Sorter sorter) {
        /* TODO */
        this.sorter = sorter;
    }

    @Override
    public int search(double[] data, double value) {
        sort(data);
        return binarySearch(data, value);
    }

    private int binarySearch(double[] data, double value) {
        /* TODO */
        int low = 0, high = data.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (data[mid] == value)
                return mid;

            if (data[mid] < value)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    private void sort(double[] data) {
        /* TODO */
        sorter.sort(data, true);
    }
}
