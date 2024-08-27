package hus.oop.design_patterns.lab11.iterator.usinguml;

public class ProduceIterator implements Iterator {
    private final String[] produceCatalogData;
    private int count;

    public ProduceIterator(String[] produceCatalogData) {
        this.produceCatalogData = produceCatalogData;
    }

    @Override
    public boolean hastNext() {
        return count < produceCatalogData.length;
    }

    @Override
    public Object next() {
        if (hastNext()) {
            return produceCatalogData[count++];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
