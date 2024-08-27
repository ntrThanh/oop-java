package hus.oop.designpatterns.strategy.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static DataForProduct data = DataForProduct.getInstance();
    private static BufferedReader reader =
                        new BufferedReader(new InputStreamReader(System.in));
    private static Order order = Order.getInstance();
    private static PayStrategy strategy;

    public static void main(String[] args) throws IOException {
        while (order.isCloset()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("please, select a product: " + "\n" +
                        "1 - Mother board" + " \n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = data.getPriceOnProducts().get(choice);
                System.out.print("count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(count * cost);
                System.out.print("do you wish to continue selecting product? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("please, select a payment method: " + "\n"
                + "1 - paypal " + "\n"
                + "2 - credit card");
                String paymentMethod = reader.readLine();
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                    order.setPayStrategy(strategy);
                    order.processOrder();
                } else {
                    strategy = new PayByCreditCard();
                    order.setPayStrategy(strategy);
                    order.processOrder();
                }
            }

            System.out.print("pay " + order.getTotalCost()
            + " units or continue shopping? P/C");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("payment successful");
                } else {
                    System.out.println("fail");
                }

                order.setCloset(false);
            }
        }
    }
}
