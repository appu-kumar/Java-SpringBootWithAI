package multithreading;

/*
 1️⃣ What happens when you extends Thread
When a class extends Thread, that class becomes a thread class.
Meaning:
    Objects of this class can run in a separate thread.
    But the thread logic must be inside the run() method.
 */
class CommonResource extends Thread {

    public void commonResource(String t){
        System.out.println("common resources"+t);
    }

    // Jvm run this method with the help of the thread schedular, it is called by start() methods
    @Override
     synchronized public void run() {
        String currT = Thread.currentThread().getName();
        if(currT.equals("bheem")){
            System.out.println("bheem thread");
            try{
            Thread.sleep(5000);
            }
            catch(Exception e){
               e.printStackTrace();
            }
        }
        else if(currT.equals("kalia")){
            System.out.println("kalia thread");
            try{
                Thread.sleep(5000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else {
            System.out.println("raju thread");
            try{
                Thread.sleep(5000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        this.commonResource(currT);
    }
}

// common resource can be created using Runnable Interface okay
class CommonResource1 implements Runnable {

    public void commonResource(String t){
        System.out.println("common resources"+t);
    }

    // Jvm run this method with the help of the thread schedular, it is called by start() methods
    @Override
    synchronized public void run() {
        String currT = Thread.currentThread().getName();
        if(currT.equals("bheem")){
            System.out.println("bheem thread");
            try{
                Thread.sleep(5000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(currT.equals("kalia")){
            System.out.println("kalia thread");
            try{
                Thread.sleep(5000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else {
            System.out.println("raju thread");
            try{
                Thread.sleep(5000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        this.commonResource(currT);
    }
}

public class ThreadsUsesCommonResource {
    public static void main(String[] args){
//       CommonResource commonResource = new CommonResource();
        CommonResource1 commonResource1 = new CommonResource1();

       Thread t1 = new Thread(commonResource1);
       t1.setName("kalia");
       Thread t2 = new Thread(commonResource1);
       t2.setName("bheem");
       Thread t3 = new Thread(commonResource1);
       t3.setName("raju");
       t1.start();
       t2.start();
       t3.start();
       // start() → JVM creates new thread → run() method executes
    }
}
