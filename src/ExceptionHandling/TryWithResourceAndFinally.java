package ExceptionHandling;
import java.util.Scanner;
class CloseTheResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("close the resources");
    }
}
public class TryWithResourceAndFinally {
    public static void takeInput(){
        Scanner scn =new Scanner(System.in);

        // try- with resource is replacement of the try-finally okay , without catch we can write try-finally.
        try(CloseTheResource cr = new CloseTheResource()){
            int x = scn.nextInt();
            int y = scn.nextInt();
            int res = x/y;
        }
        catch(Exception e){
            System.out.println("exit");
        }
    }

    public static void main(String[] args){
          takeInput();
    }
}

/*
📌 What is a Custom Exception?
A Custom Exception is a user-defined exception created by a programmer to handle specific business logic errors.
👉 Java already gives built-in exceptions like:
ArithmeticException
NullPointerException
IOException
But sometimes, these are not enough for real-world business rules.
So we create our own.

🧠 Why Do We Need Custom Exceptions?
Built-in exceptions handle technical errors.
Custom exceptions handle business logic errors.
Example:

Bank account balance is low → ❌ Not a technical error
User entered wrong password → ❌ Not a system crash
Product out of stock → ❌ Not a compiler issue
These are business rule violations, so we create custom exceptions.

🏦 Real-Life Example 1: Bank Withdrawal
Problem
If a user tries to withdraw more money than available balance.
Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
Usage
void withdraw(double amount) throws InsufficientBalanceException {
    if(amount > balance) {
        throw new InsufficientBalanceException("Not enough balance!");
    }
}
💡 Real Life Meaning:

ATM machine says:
"Insufficient Balance"
That message is coming from a custom exception.

 */
