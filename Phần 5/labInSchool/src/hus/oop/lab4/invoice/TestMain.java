package hus.oop.lab4.invoice;

public class TestMain {
    public static void main(String[] args) {
        InvoiceItem invoiceItem1 = new InvoiceItem("A101", "Pen Red",
                                                888, 0.08);
        System.out.println(invoiceItem1);

        invoiceItem1.setQty(999);
        invoiceItem1.setUnitPrice(0.99);
        System.out.println(invoiceItem1);
        System.out.println("id is: " + invoiceItem1.getId());
        System.out.println("desc is: " + invoiceItem1.getDesc());
        System.out.println("qty is: " + invoiceItem1.getQty());
        System.out.println("unitPrice is: " + invoiceItem1.getUnitPrice());

        System.out.println("The total is: " + invoiceItem1.getTotal());
    }
}
