package multithreading;

import java.sql.SQLOutput;

// first task and extends thread
class TeaMaker extends Thread {

    public void makeTea(){
        System.out.println("make tea");
    }

    // whatever you want to execute the logic by thread put inside the run method
    // execution flow--> make class as thread class--> create object of hte class--> call start() method
    // ---> eventually run method will be called inside the start() method
    @Override
    public void run() {
        this.makeTea();
    }

}

// second task
class RiceMaker extends Thread {

    public void makeRice(){
        System.out.println("Make rice");
    }

    @Override
    public void run(){
        this.makeRice();
    }
}

// third task
class RotiMaker extends Thread {
    public void makeRoti() {
        System.out.println("make roti");
    }

    @Override
    public void run(){
       this.makeRoti();
    }
}

// There is a task schedular and jvm run task once cpu is available, we do not know which thread will be excuted


public class BasicMultiThreading {

      public static void main(String[] args){

           TeaMaker teaMaker = new TeaMaker();
           RiceMaker riceMaker = new RiceMaker();
           RotiMaker rotiMaker = new RotiMaker();
           teaMaker.start(); // gives thread to thread schedular
           /*
           public synchronized void start() {
            // create a new native thread
            // register it with JVM scheduler
            // then JVM calls run()
           }
            */
           riceMaker.start();
           rotiMaker.start();
      }
}

/*
  Doing multiple tasks concurrently/ simultaneously is called multi tasking, but make sure, all the task must be independent

  In Java, multitasking refers to executing multiple tasks concurrently using multiple threads, where each task runs independently within a process.
    ✅ Key points to remember for interviews:
    Multiple tasks run concurrently
    Tasks should be independent
    Achieved using threads in Java
    Improves CPU utilization and performance
 */
