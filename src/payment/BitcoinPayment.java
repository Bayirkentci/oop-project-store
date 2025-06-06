package payment;

public class BitcoinPayment implements PaymentStrategy {
    String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + "Amount : " + amount);
    }

    @Override
    public String getPaymentDetails() {
        return String.format("Paid by bitcoin from this wallet : " + walletAddress);
    }
}

