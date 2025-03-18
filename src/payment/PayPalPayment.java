package payment;

public abstract class PayPalPayment implements PaymentStrategy{
    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        //
    }
    public String getPaymentDetails() {
        return null;
    }
}
