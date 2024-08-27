package hus.oop.search;

public interface Search {
    /**
     * Tìm kiếm trong mảng có giá trị value không.
     * @param data: mảng tập hợp các giá trị.
     * @param value: giá trị cần tìm kiếm.
     * @return chỉ số của value trong mảng, -1 nếu không tìm thấy.
     */
    int search(double[] data, double value);
}
