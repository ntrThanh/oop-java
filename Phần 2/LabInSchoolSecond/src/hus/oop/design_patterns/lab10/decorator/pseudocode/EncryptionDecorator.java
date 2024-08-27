package hus.oop.design_patterns.lab10.decorator.pseudocode;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
        System.out.println(" with data decor encryption decorator");
    }

    @Override
    public String readData() {
        return dataSource.readData() + " with data decor encryption decorator";
    }
}
