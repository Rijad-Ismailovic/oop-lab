package factory;

public class PayPalPayment implements Payment {
    public void processPayment(){
        System.out.println("Processing PayPal payment.");
    }
}
