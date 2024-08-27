package decorator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BreadStore {
    private List<Bread> breads;

    public BreadStore() {
        breads = new LinkedList<>();
    }

    /**
     * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
     * Bắt đầu, tạo ra và cho vào cửa hàng:
     * 5 bánh mỳ ThickcrustBread chỉ có cheese,
     * 5 bánh mỳ ThickcrustBread chỉ có olives,
     * 5 bánh mỳ ThickcrustBread có cả cheese và olives,
     * 5 bánh mỳ ThincrustBread chỉ có cheese,
     * 5 bánh mỳ ThincrustBread chỉ có olives,
     * 5 bánh mỳ ThincrustBread có cả cheese và olives.
     */
    public void init() {
        /* TODO */
        breads.add(new Cheese(new ThickcrustBread()));
        breads.add(new Cheese(new ThickcrustBread()));
        breads.add(new Cheese(new ThickcrustBread()));
        breads.add(new Cheese(new ThickcrustBread()));
        breads.add(new Cheese(new ThickcrustBread()));

        breads.add(new Olives(new ThickcrustBread()));
        breads.add(new Olives(new ThickcrustBread()));
        breads.add(new Olives(new ThickcrustBread()));
        breads.add(new Olives(new ThickcrustBread()));
        breads.add(new Olives(new ThickcrustBread()));

        breads.add(new Olives(new Cheese(new ThickcrustBread())));

        breads.add(new Cheese(new ThincrustBread()));
        breads.add(new Cheese(new ThincrustBread()));
        breads.add(new Cheese(new ThincrustBread()));
        breads.add(new Cheese(new ThincrustBread()));
        breads.add(new Cheese(new ThincrustBread()));

        breads.add(new Olives(new ThincrustBread()));
        breads.add(new Olives(new ThincrustBread()));
        breads.add(new Olives(new ThincrustBread()));
        breads.add(new Olives(new ThincrustBread()));
        breads.add(new Olives(new ThincrustBread()));

        breads.add(new Olives(new Cheese(new ThincrustBread())));
    }

    /**
     * Thêm bánh mỳ vào cửa hàng.
     */
    public void add(Bread bread) {
        /* TODO */
        breads.add(bread);
    }

    /**
     * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
     * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
     * bánh mỳ yêu cầu.
     * Nếu còn bánh mỳ để bán thì trả về giá trị true,
     * nếu không còn trả về giá trị false.
     */
    public boolean sell(String nameBread) {
        /* TODO */
        for (int i = 0; i < breads.size(); i++) {
            if (breads.get(i).getDescription().equals(nameBread)) {
                breads.remove(i);
                return true;
            }
        }

        return false;
    }

    /**
     * In ra những bánh mỳ còn trong cửa hàng.
     */
    public void print() {
        /* TODO */
        for (Bread bread : breads) {
            System.out.println(bread.getDescription());
        }
    }

    /**
     * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
     * nếu order là true, sắp xếp theo thứ tự tăng dần,
     * nếu order là false, sắp xếp theo thứ tự giảm dần.
     * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
     */
    public List<Bread> sort(boolean order) {
        /* TODO */
        List<Bread> listBreads = new ArrayList<>();
        listBreads.addAll(breads);

        if (order) {
            for (int i = 0; i < listBreads.size() - 1; i++) {
                for (int j = i + 1; j < listBreads.size(); j++) {
                    if (listBreads.get(i).cost() > listBreads.get(j).cost()) {
                        Bread temp = listBreads.get(i);
                        listBreads.set(i, listBreads.get(j));
                        listBreads.set(j, temp);
                    }
                }
            }
        } else {
            for (int i = 0; i < listBreads.size() - 1; i++) {
                for (int j = i + 1; j < listBreads.size(); j++) {
                    if (listBreads.get(i).cost() < listBreads.get(j).cost()) {
                        Bread temp = listBreads.get(i);
                        listBreads.set(i, listBreads.get(j));
                        listBreads.set(j, temp);
                    }
                }
            }
        }

        return listBreads;
    }

    /**
     * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
     * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
     * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
     */
    public List<Bread> filter(int howMany, boolean order) {
        /* TODO */
        List<Bread> listBreads = new ArrayList<>();

        if (order) {
            List<Bread> listAfterSort = sort(!order);

            for (int i = 0; i < howMany; i++) {
                listBreads.add(listAfterSort.get(i));
            }
        } else {
            List<Bread> listAfterSort = sort(order);

            for (int i = 0; i < howMany; i++) {
                listBreads.add(listAfterSort.get(i));
            }
        }

        return listBreads;
    }

    public static void printBread(List<Bread> listBreads) {
        for (Bread bread : listBreads) {
            System.out.println(bread.getDescription());
        }
    }

    public static void main(String args[]) {
        BreadStore breadStore = new BreadStore();
        breadStore.init();

        /*
         * Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
         * - Thêm một số bánh mỳ vào cửa hàng
         * - Bán một số bánh mỳ từ cửa hàng
         * - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
         * - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
         */
        /* TODO */

        breadStore.print();

        System.out.println();
        System.out.println("sell");
        breadStore.sell("Thick crust bread, with tomato sauce, Olives");
        breadStore.sell("Thick crust bread, with tomato sauce, Olives");
        breadStore.sell("Thick crust bread, with tomato sauce, Olives");
        breadStore.sell("Thick crust bread, with tomato sauce, Olives");

        System.out.println("After sell");
        breadStore.print();

        System.out.println("");
        System.out.println("sort");
        printBread(breadStore.sort(true));

        System.out.println();
        System.out.println("filter");
        printBread(breadStore.filter(10, true));
    }
}
