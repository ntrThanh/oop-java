package hus.oop.design_patterns.lab11.iterator.usinguml;

public class IteratorPatternExample {
    public static void main(String[] args) {
        String[] dataProduceCatalog = new String[]{"phone", "television", "car", "computer", "motorbike"};

        ProductCatalog productCatalog = new ProductCatalog(dataProduceCatalog);
        Iterator iterator = productCatalog.getIterator();

        while (iterator.hastNext()) {
            System.out.println(iterator.next());
        }
    }
}
