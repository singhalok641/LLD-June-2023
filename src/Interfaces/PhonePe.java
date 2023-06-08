package Interfaces;

public class PhonePe {
    public static void main(String[] args) {
        BankApi bankApi = new IciciBankApi();

        bankApi.checkBalance();
        bankApi.depositMoney("123", 1000);
        bankApi.transferMoney("123", "456", 1000);
        bankApi.showTransactionHistory();
    }
}
