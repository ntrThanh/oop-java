package hus.oop.search;

public class SelectionSort implements Sorter {
    /**
     * Phương thức sắp xếp dữ liệu sử dụng thuật toán Selection sort.
     *
     * @param data
     * @param order: true sắp xếp theo thứ tự tăng dần, false sắp xếp theo thứ tự giảm dần.
     */
    @Override
    public void sort(double[] data, boolean order) {
        /* TODO */
        if (order) {
            sortAscending(data);
        } else {
            sortDescending(data);
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự tăng dần,
     * sử dụng thuật toán Selection sort.
     *
     * @param data
     */
    private void sortAscending(double[] data) {
        /* TODO */
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (data[j] < data[min_idx])
                    min_idx = j;

            double temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự giảm dần,
     * sử dụng thuật toán Selection sort.
     *
     * @param data
     */
    private void sortDescending(double[] data) {
        /* TODO */
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (data[j] > data[min_idx])
                    min_idx = j;

            double temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;
        }
    }
}
