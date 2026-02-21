package LambdaExpressionAndFunctionalInterface;
// An interface having the single abstract method that is called functional interface
// byDefault properties are public static final
// byDefault methods are public abstract
// No need to mention manually.
interface Sports {
    int numberOfMatches = 0;
    void doMedicalTest();
}

// There are 3 ways to implement th above interface method(only for functional interface okay)
/*
1) With the help of the class
2) Anonymous class
3) lambda expression
 */


// These two are the class implementations of the interface
class ImplSports implements Sports {

    public void doMedicalTest(){
        System.out.println("do medical test in footbal");
    }
}

class ImplS implements Sports {
    public void doMedicalTest(){
        System.out.println("Do medical test in cricket");
    }
}


public class TheoryClassOfLambdaExpression {
    public static void main(String[] args){
        System.out.println("hello world");

        // anonymous class and lambda both are the on the spot implementation of the interface
        Sports cric = new Sports() {
           public void doMedicalTest(){
                System.out.println("cricket medical test");
            }
        };

        cric.doMedicalTest();

        System.out.println("lambda expressions");



    }
}
