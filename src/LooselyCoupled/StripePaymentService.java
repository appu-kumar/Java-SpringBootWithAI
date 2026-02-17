package LooselyCoupled;

public class StripePaymentService implements IPaymentService {

    public boolean makePayment(double amount){
        System.out.println("make payment using the stripe service: "+amount);
        return true;
    }
}
