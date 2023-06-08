package Interfaces;

public interface UpiInterface {
    void addPayee(String payeeName, String payeeAccountNumber);
    void sendMoney(String payeeAccountNumber, double amount);
    void requestMoney(String payeeAccountNumber, double amount);
}
