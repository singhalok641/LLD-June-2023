package Interfaces;

import java.util.List;

public interface BankApi extends UpiInterface {
    double checkBalance();
    void transferMoney(String toAccount, String fromAccount, double amount);
    void depositMoney(String toAccount, double amount);
    List<String> showTransactionHistory();
}
