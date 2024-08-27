package hus.oop.lab4.account1;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1234, "Trong Thanh", 'm');
        System.out.println(customer1);

        Account account1 = new Account(1245, customer1, 999.9899);
        System.out.println(account1);

        account1.deposit(100);
        System.out.println(account1);

        account1.withdraw(1200);
        System.out.println(account1);

        System.out.println("name is: " + account1.getCustomer().getName());
        System.out.println("id is: " + account1.getCustomer().getId());
        System.out.println("balance is: " + account1.getBalance());
    }
}
