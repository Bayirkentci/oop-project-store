package payment;

public abstract interface PaymentStrategy {
    public abstract void pay();
    public String getPaymentDetails();
}
