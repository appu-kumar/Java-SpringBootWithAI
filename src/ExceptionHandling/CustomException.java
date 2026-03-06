package ExceptionHandling;

import java.util.Scanner;
// make any class as custom Exception class using Inbuilt exception classes.
class InvalidCredentials extends Exception {
    public InvalidCredentials(String msg){
        super(msg);
    }
}
class ATM {
     // These are coming from db
      String username ="appu";
      String password = "ak@123";

      String usrname;
      String passw;

     public void matchCred() throws InvalidCredentials{
        if(this.username.equals(this.usrname.toLowerCase()) && this.password.equals(this.passw)){
            System.out.println("pin generated");
        }
        else {
            throw new InvalidCredentials("Invalid credentials, Please try again!");
        }
    }

    public void input(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter username");
        this.usrname = scn.nextLine();
        System.out.println("Enter password");
        this.passw = scn.nextLine();
    }


}

class Bank {

    void start(){
        ATM atm = new ATM();

       try{
           atm.input();
           atm.matchCred();
       }
       catch(InvalidCredentials e){
           System.out.println(e.getMessage());
           try {
               atm.input();
               atm.matchCred();
           }
           catch(InvalidCredentials ee){
               System.out.println("You tried your all attempts, Please try after 24hrs");
               System.out.println(ee.getMessage());
           }
       }
    }
}

public class CustomException {

    public static void main(String[] args){
        Bank bank = new Bank();
        bank.start();
    }
}
