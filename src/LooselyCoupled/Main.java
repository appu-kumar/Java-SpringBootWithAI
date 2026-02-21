package LooselyCoupled;

public class Main {
    public static void main(String[] args){
        /*
           IPaymentServie--> implemented by  PayPal..., Razor..., Stripe... services okay
           OrderService where we are injecting the IPaymentService reference.(DI)

           For more theory checkout the readme file.
         */
        // injecting the paypal service we are doing with constructor we call it constructor injection
//       OrderService order = new OrderService(new PayPalPaymentService());
//        OrderService order = new OrderService(new StripePaymentService());
        OrderService order = new OrderService(new RazorPaymentService());
        order.checkout(5000);

        // Note:: Don't worry above things are done by the Spring creating object, injecting the object every thing okay just you have to focus on logic okay
    }
}
