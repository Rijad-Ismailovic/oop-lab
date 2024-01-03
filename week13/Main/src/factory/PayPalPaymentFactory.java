package factory;

public class PayPalPaymentFactory implements PaymentFactory {
    public Payment createPayment(){
        return new PayPalPayment();
    }
}
