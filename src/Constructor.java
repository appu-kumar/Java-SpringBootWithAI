class Bird {
    private String name;
    private boolean isCanFly;

    /*
       1) class name and constructor name must be same
       2) constructor is special kind of the methods that does not have the return type.
       3) At the time of the object creation we call the constructor.
    */

    public Bird() {}
    // if developer creates the constructor then java compiler will not add the default constructor so create manually
    public Bird(String name, boolean isCanFly) {
        this.name = name;
        this.isCanFly = isCanFly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsCanFly() {
        return this.isCanFly;
    }

    public void setCanFly(boolean isCanFly) {
        this.isCanFly = isCanFly;
    }
}

public class Constructor {
    public static void main(String[] args){

         // Initialize the values of the b1 object of class Bird with setters.
         Bird b1 = new Bird();
         b1.setName("Parrot");
         b1.setCanFly(true);
         System.out.println(b1.getName());

         // Initialize the values of the b2 object of class Bird with constructor
         Bird b2 = new Bird("Peacock",true);
         System.out.println(b2.getName());




    }
}
