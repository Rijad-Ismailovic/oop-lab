package factory;

public class CreditCardPayment implements Payment {
    public void processPayment(){
        System.out.println("Processing Credit card payment.");
    }
}
