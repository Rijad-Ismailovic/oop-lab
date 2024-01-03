package factory;

public class Main {
    public static void main(String[] args){
        PaymentFactory creditCardPaymentFactory = new CreditCardPaymentFactory();
        PaymentFactory payPalPaymentFactory = new PayPalPaymentFactory();

        Payment creditCardPayment = creditCardPaymentFactory.createPayment();
        Payment payPalPayment = payPalPaymentFactory.createPayment();

        creditCardPayment.processPayment();
        payPalPayment.processPayment();
    }
}
