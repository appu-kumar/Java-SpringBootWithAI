package LooselyCoupled;

public class OrderService {
    // Note::- OrderService is not dependent on the PaymentServices(any service u can pass) class still calling makePayment method because of loose couply.
    IPaymentService paymentService;
    // This is called Dependency Injection, Means injecting (Loosely coupled why? becasue any service can be injected okay)paymentServices(razor, paypal, stripe etc.) into OrderService  while creating the object of the orderService is called DI.
    public OrderService(IPaymentService paymentService){
        this.paymentService = paymentService;
    }

    void checkout(double amount){
        // first make payment then order okay
        this.paymentService.makePayment(amount);
        System.out.println("Ordered successfully!");
    }
}
