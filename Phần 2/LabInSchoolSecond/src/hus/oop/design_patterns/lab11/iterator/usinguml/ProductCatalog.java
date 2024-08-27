package hus.oop.design_patterns.lab11.iterator.usinguml;

public class ProductCatalog implements Iterable {
    private final String[] productCatalog;

    public ProductCatalog(String[] productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public Iterator getIterator() {
        return new ProduceIterator(productCatalog);
    }
}
