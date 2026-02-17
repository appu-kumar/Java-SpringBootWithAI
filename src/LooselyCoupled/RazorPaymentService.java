package LooselyCoupled;

public class RazorPaymentService implements IPaymentService {

    public boolean makePayment(double amount){
        System.out.println("Make the payment using the razor pay: "+amount);
        return true;
    }
}
