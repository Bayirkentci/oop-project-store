package payment;

public class CreditCardPayment implements PaymentStrategy{
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + "Amount : " + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Card Number : " + cardNumber + "\nCardholder: " + cardHolderName;
    }
}
