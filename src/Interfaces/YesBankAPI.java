package Interfaces;

import java.util.List;

public class YesBankAPI implements BankApi{
    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public void transferMoney(String toAccount, String fromAccount, double amount) {

    }

    @Override
    public void depositMoney(String toAccount, double amount) {

    }

    @Override
    public List<String> showTransactionHistory() {
        return null;
    }
}
