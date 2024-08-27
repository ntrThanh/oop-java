package hus.oop.design_patterns.lab10.decorator.pseudocode;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
        System.out.println(" with data decor compression decorator");
    }

    @Override
    public String readData() {
        return dataSource.readData() + " with data decor compression decorator";
    }
}
