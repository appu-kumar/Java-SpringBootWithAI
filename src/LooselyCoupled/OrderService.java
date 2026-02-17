package LooselyCoupled;

public class OrderService {

    IPaymentService paymentService;
    // This is called Dependency Injection, Means injecting (Loosely coupled why? becasue any service can be injected okay)paymentServices(razor, paypal, stripe etc.) into OrderService  while creating the object of the orderService
    public OrderService(IPaymentService paymentService){
        this.paymentService = paymentService;
    }

    void checkout(double amount){
        // first make payment then order okay
        this.paymentService.makePayment(amount);
        System.out.println("Ordered successfully!");
    }
}
