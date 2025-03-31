package payment;

public abstract interface PaymentStrategy {
    void pay(double amount);
    String getPaymentDetails();
}
