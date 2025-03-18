package payment;

public abstract class CreditCardPayment implements PaymentStrategy{
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public void pay(double amount) {
        //
    }
    public String getPaymentDetails() {
        return null;
    }
}
