package ExceptionHandling;

import java.util.Scanner;

// if you are throwing an Exception using throw then your moral duty being the java developer that please use throws to specify with throws it is but it optional
class HelperThrow {

    public void divide(int a, int b) throws ArithmeticException {

        try{
            int res = a/b;  // if exception occurred here then below lines of code not executed.
            System.out.println(res);
        }
        catch(Exception e){

            throw e;
        }
        System.out.println("end of the divide method");
    }
}
public class ThrowKeyword {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first");
        int x = scn.nextInt();
        System.out.println("Enter two");
        int y = scn.nextInt();
        HelperThrow obj = new HelperThrow();
        try{
            obj.divide(x, y);
        }
        catch(Exception e){
            System.out.println("Exception occurred, please handle it");
        }
        System.out.println("end of the main method");
    }
}
