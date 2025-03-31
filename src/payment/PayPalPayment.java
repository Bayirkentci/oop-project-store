package payment;

public class PayPalPayment implements PaymentStrategy{
    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + "Amount : " + amount);
    }

    @Override
    public String getPaymentDetails() {
        return String.format("Paid by this paypal account : "+ email);
    }
}
