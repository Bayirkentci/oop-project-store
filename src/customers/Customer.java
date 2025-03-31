package customers;

import payment.PaymentStrategy;
import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        String paymentInfo = "Method of payment : " + paymentStrategy.getPaymentDetails() + "\nAmount : " + amount;
        paymentHistory.add(paymentInfo);
    }

    public void showPaymentHistory() {
        System.out.println(name + "'s payment history: ");
        for (String payment : paymentHistory)
            System.out.println(payment);
    }


}
