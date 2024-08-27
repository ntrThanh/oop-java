package hus.oop.design_patterns.lab10.singleton.bank;

public class BankManager {
    public static void main(String[] args) {
        Bank var1 = Bank.getInstance();
        var1.depositToBank(20321, "1-2-2024");
        var1.depositToBank(1200, "2-3-2022");
        var1.loanMoneyOfBank(1222, "1-1-2025");

        Bank var2 = Bank.getInstance();
        var2.loanMoneyOfBank(2000000000, "20-12-2026");
        var2.loanMoneyOfBank(2331, "2-4-2004");

        for (String history : var2.getTransactionHistory()) {
            System.out.println(history);
        }
    }
}
