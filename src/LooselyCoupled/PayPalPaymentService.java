package LooselyCoupled;

public class PayPalPaymentService implements IPaymentService {

    public boolean makePayment(double amount){
        System.out.println("Make the payment using the paypal:"+amount);
        return true;
    }
}
