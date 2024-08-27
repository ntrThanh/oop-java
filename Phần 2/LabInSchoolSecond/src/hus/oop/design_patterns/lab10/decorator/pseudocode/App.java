package hus.oop.design_patterns.lab10.decorator.pseudocode;

public class App {
    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource("/text.txt");
        DataSource dataSource1 = new EncryptionDecorator(dataSource);

        dataSource1.writeData("hello i am nguyen trong thanh");
        System.out.println(dataSource1.readData());

        DataSource dataSource2 = new CompressionDecorator(dataSource1);
        dataSource2.writeData("xin chao");
        System.out.println(dataSource2.readData());
    }
}
