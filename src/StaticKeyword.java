class TestStaticKeyword {
    // initialized when jvm load this class
    static int x;
    static int age;

    // WAP to count how many objects are created using this class.
    static int count;

    int m;

    // runs when jvm load this class
    static {
        System.out.println("static block::: "+x+age);
    }

    // non static block always runs when object is created but make sure just before object creation it is called
    {
        count++;
        System.out.println("inside non static block:: "+count);
    }

    TestStaticKeyword() {
        System.out.println("constructor called");
    }

    void setM(int m){
        this.m = m;
    }

    void print(){
        System.out.println("hello method");
    }

}

public class StaticKeyword {
     public static void main(String[] args) {
         TestStaticKeyword test = new TestStaticKeyword();
         TestStaticKeyword test2 = new TestStaticKeyword();
     }
}
