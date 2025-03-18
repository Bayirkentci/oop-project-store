package customers;

import payment.PaymentStrategy;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
        //ArrayList
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay();
    }

    public void showPaymentHistory() {
        //
    }


}
