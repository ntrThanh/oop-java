package hus.oop.design_patterns.lab10.strategy.pay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static final DataProduct dataProduct
            = DataProduct.getInstance();
    private static final BufferedReader reader
            = new BufferedReader(new InputStreamReader(System.in));
    private static PayStrategy payStrategy;
    private static final Order order = new Order(payStrategy);

    public static void main(String[] args) throws IOException {
        while (!order.isCosted()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("please, select a product: " + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = dataProduct.getProducts().get(choice);
                System.out.println("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.println("Do you wish to continue selecting product? Y/N:");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (payStrategy == null) {
                System.out.println("please, select a payment method: " + "\n" +
                        "1 - Paypal" + "\n" +
                        "2 - Credit Card");
                String paymentMethod = reader.readLine();
                if (paymentMethod.equals("1")) {
                    payStrategy = new PayByPaypal();
                    order.setPayStrategy(payStrategy);
                    order.processOder();
                } else {
                    payStrategy = new PayByCreditCard();
                    order.setPayStrategy(payStrategy);
                    order.processOder();
                }
            }
            System.out.println("Pay " + order.getTotalCost() +
                    " units or continue shopping? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                System.out.println("Payment has been successful.");
            } else {
                System.out.println("Fail! please, check your data.");
            }

            order.setCosted();
        }
    }
}
