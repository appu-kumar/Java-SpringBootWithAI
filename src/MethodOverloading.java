class TestMethodOverloading {

    // method overloading---> same method name, but different list of the parameters
    // Note:: if number of parameters are different then well and good if same then data types must be different okay


    // valid example of method overloading
    int add(int a, int b){
        return a+b;
    }
    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }


    // not a valid method overloading example this can create ambiguity while calling sum(2,2)
    void sum(double a, int b){
        System.out.println(a+b);
    }
    double sum(int a, double b){
        return a+b;
    }
}
public class MethodOverloading {
    public static void main(String[] args){

        TestMethodOverloading ts = new TestMethodOverloading();
//        ts.sum(2,2);
    }
}
