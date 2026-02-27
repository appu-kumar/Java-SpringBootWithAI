package ExceptionHandling;
import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

// Exception is handled in the current method
class HelperThrows {

    public void divide(int a, int b){

          try{
              int res = a/b;  // if exception occurred here then below lines of code not executed.
              System.out.println(res);
          }
          catch(Exception e){

              System.out.println("Error occurred handle it carefully");
          }
        System.out.println("end of the divide method");
    }
}

// ducking the exception in current method and passing exception to the caller method please handle there
class HelperThrows1 {

    public void divide(int a, int b) throws ArithmeticException{
            int res = a/b;  // if exception occurred here then below lines of code not executed.
            System.out.println(res);
            System.out.println("end of the divide method");
    }
}
public class ThrowsKeyword {
       public static void main(String[] args){
           Scanner scn = new Scanner(System.in);
           System.out.println("Enter first");
           int x = scn.nextInt();
           System.out.println("Enter two");
           int y = scn.nextInt();

//         HelperThrows obj = new HelperThrows();
           HelperThrows1 obj1 = new HelperThrows1();
           try{
               obj1.divide(x, y);
           }
           catch(Exception e){
               System.out.println("Exception occurred, please handle it");
           }
           System.out.println("end of the main method");
       }
}
