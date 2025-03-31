import customers.*;
import payment.*;

public class Main {
    public static void main(String[] args) {
        Customer aslan = new RegularCustomer("Aslan");
        Customer ataman = new PremiumCustomer("Ataman");
        Customer sona = new RegularCustomer("Sona");

        aslan.displayCustomerInfo();

        PaymentStrategy creditCard = new CreditCardPayment("6016 4216 8912 7633", "Ataman");
        PaymentStrategy bitCoin = new BitcoinPayment("H4895Jld734f3265");
        PaymentStrategy PayPal = new PayPalPayment("sona@gmail.com");

        ataman.makePayment(creditCard, 600);
        ataman.makePayment(PayPal, 5000);

        aslan.makePayment(creditCard, 230000);
        aslan.makePayment(bitCoin, 68000000);
        aslan.makePayment(PayPal, 45000);

        sona.makePayment(PayPal, 690000);
        sona.makePayment(bitCoin, 1000000000);

    }
}
