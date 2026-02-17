abstract class Car {
    int fuelCapacity;
     Car(){
        System.out.println("calling abstract constructor");
    }
    public abstract void startEngine();
    public abstract void stopEngine();
    void startCar(){
        System.out.println("start the car");
    }
    // it is inherited not overridden ok, static method is resolved at compile time and overridden is run time.
    // if you create the same method in child it will treat as specialized method okay. we call it method hiding.
    public static void printt(){
        System.out.println("static method");
    }
}

abstract class DBconnection {
    public abstract  void getDbConnection();
    public abstract void close();
}

/*
  1)Abstraction means hiding the method implementation not data hiding(data hiding is handled by encapsulation)  to the user.
  2)If is there any abstract method in the class then must make the class as an abstract class
  3)With the help of the abstract class we can achieve the abstraction 0 to 100%
  4)Object of the abstract class can not be created because abstract means incomplete.
 */

class MarutiSuzuki extends Car {

    public void startEngine(){
        System.out.println("start maruti");
    }

    public void stopEngine(){
        System.out.println("stop maruti");
    }
}

class BMWCar extends Car {

    private String name;

    // start() car is not visible by naked eye but that is here okay and we call it inherited method
    // Note::- There is small difference between inherited method and overridden, overridden is modified in the child
    // however inherited method is used as it is.

    BMWCar(){

    }
    // Both are overridden methods
    public void startEngine(){
        System.out.println("Start bmw car.");
    }
    public void stopEngine() {
        System.out.println("Stop bmw car.");
    }

    // specialized method
    String getName(){
        return this.name;
    }

    // specialized method only, this can be accessed only by the child reference okay.
    public void getFuelCapacity(){
        System.out.println("fuelCapacity:"+this.fuelCapacity);
    }
}


public class InheritanceWithAbstractclass {

    public static void main(String[] args) {

        Car car = new BMWCar();

        System.out.println("BMW car...");
        car.startEngine();
        car.stopEngine();

        car = new MarutiSuzuki();
        car.startEngine();
        car.stopEngine();
    }
}

/*
✅ Real-Life Example of Abstraction in Java
🔹 What is Abstraction?
👉 Abstraction means hiding implementation details and showing only essential features.
In simple words:
User ko “what to do” dikhate hain,
but “how it works internally” hide kar dete hain.

In Java, abstraction is achieved using:
Abstract classes
Interfaces

| Concept       | Focus                        |
| ------------- | ---------------------------- |
| Abstraction   | Hides implementation details |
| Encapsulation | Hides data (variables)       |


The Real Reason
Because Java checks method accessibility at compile time using the reference type, not the object type.
👉 Very Important Rule:
🔹 Reference type decides what methods are accessible (compile-time)
🔹 Object type decides which overridden method runs (runtime)

| Feature                | Compile Time | Runtime |
| ---------------------- | ------------ | ------- |
| Syntax checking        | ✅            | ❌     |
| Type checking          | ✅            | ❌     |
| Method existence check | ✅            | ❌     |
| Overloading resolution | ✅            | ❌     |
| Overriding resolution  | ❌            | ✅     |
| Object creation        | ❌            | ✅     |
| Method execution       | ❌            | ✅     |


 */