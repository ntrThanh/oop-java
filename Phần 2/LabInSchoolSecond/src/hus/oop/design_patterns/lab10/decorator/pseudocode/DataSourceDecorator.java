package hus.oop.design_patterns.lab10.decorator.pseudocode;

public abstract class DataSourceDecorator implements DataSource {
    protected DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
