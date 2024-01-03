package factory;

public class CreditCardPaymentFactory implements PaymentFactory {
    public Payment createPayment(){
        return new CreditCardPayment();
    }
}
