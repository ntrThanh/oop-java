package hus.oop.review.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        /* TODO */
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        /* TODO */
        Double temp = (Double) data.get(0);
        for(int i = 0; i < data.size(); i++) {
            if (temp < (Double) data.get(i)) {
                temp = (Double) data.get(i);
            }
        }
        return temp;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        Double temp = (Double) data.get(0);
        for(int i = 0; i < data.size(); i++) {
            if (temp > (Double) data.get(i)) {
                temp = (Double) data.get(i);
            }
        }
        return temp;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        Double average = (Double) data.get(0);
        for(int i = 1; i < data.size(); i++) {
            average += (Double) data.get(i);
        }
        return average / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        /* TODO */
        double variance = 0;
        for(int i = 0; i < data.size(); i++) {
            variance += Math.pow((Double) data.get(i) - mean(), 2);
        }
        return variance / data.size();
    }
}
