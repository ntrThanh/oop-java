package hus.oop.search;

public class TestBinarySearch {
    public static void main(String[] args) {
        /* Yêu cầu:
        - Sinh ra ngẫu nhiên một số tự nhiên có giá trị nằm trong khoảng [20 - 30].
        - Sinh ra ngẫu nhiên một mảng các số kiểu double, có kích thước bằng số tự nhiên đã sinh ngẫu nhiên ở trên.
        - Tạo đối tượng có kiểu dữ liệu BinarySearch. Dùng đối tượng này test thuật toán tìm kiếm nhị phân với
          mảng dữ liệu đã sinh ra, và sử dụng 3 thuật toán sắp xếp khác nhau như đã cho.

          Các kết quả test được in ra terminal theo định dạng: ví dụ
          Using Bubble Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 3.0: 2

          Using Insertion Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 6.0:-1

        - Kết quả chạy chương trình lưu vào file text được đặt tên <TenSinhVien_MaSinhVien_BinarySearch.txt.
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BinarySearch>.zip (Ví dụ, NguyenVanA_123456_BinarySearch.zip),
          nộp lên classroom
         */
        double[] data = new double[6];

        for (int i = 0; i < data.length; i++) {
            data[i] = Math.round(((Math.random() * 11) + 20) * 100) / 100;
        }

        BinarySearch binarySearch = BinarySearch.getInstance();
        BubbleSort bubbleSort = new BubbleSort();
        binarySearch.setSorter(bubbleSort);

        System.out.println("Using Bubble Sort Algorithm:");
        System.out.println("Before: " + print(data));
        bubbleSort.sort(data, true);
        System.out.println("After: " + print(data));
        System.out.println("Binary search giá trị x = " + 22.0 + " is " +
                binarySearch.search(data, 22.0));
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            data[i] = Math.round(((Math.random() * 11) + 20) * 100) / 100;
        }

        System.out.println("Using Selection Sort Algorithm:");
        SelectionSort selectionSort = new SelectionSort();
        binarySearch.setSorter(selectionSort);

        System.out.println("Before: " + print(data));
        selectionSort.sort(data, true);
        System.out.println("After: " + print(data));
        System.out.println("Binary search giá trị x = " + 22.0 + " is " +
                binarySearch.search(data, 22.0));
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            data[i] = Math.round(((Math.random() * 11) + 20) * 100) / 100;
        }

        System.out.println("Using Insertion Sort Algorithm:");
        InsertionSort insertionSort = new InsertionSort();
        binarySearch.setSorter(insertionSort);

        System.out.println("Before: " + print(data));
        insertionSort.sort(data, true);
        System.out.println("After: " + print(data));
        System.out.println("Binary search giá trị x = " + 22.0 + " is " +
                binarySearch.search(data, 22.0));
        System.out.println();
    }

    public static String print(double[] data) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < data.length; i++) {
            stringBuilder.append(data[i] + ((i == data.length - 1) ? "" : " "));
        }
         return stringBuilder.append("]").toString();
    }
}
