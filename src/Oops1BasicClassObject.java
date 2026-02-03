// local vs instance variable---> local directly declared within block(method, loop, if etc. ) and instance within class okay
// user defined datatype
class Teacher {
    // data member
    String name; // null
    char grade;  // ''
//    int age;
//    String type;

    void setName(String name1){
        name = name1;
    }

    String getName(){
        return name;
    }

    void setGrade(char grade1){
        grade = grade1;
    }

    char getGrade(){
        return grade;
    }

    // action
    void teach() {
        int x =6 ;   // local variables does not hold default value
        System.out.println(x);
        System.out.println("He can teach");
    }
}

public class Oops1BasicClassObject {

    public static void main(String[] args){

        //
        // Topics Class, Object, instance vs local variable
        //

        int x = 5;
        char c = 'A';
        char b = 'M';
        boolean isLoggedIn = true;
        String name = "Akash Prasad";


        // class is blueprint/ template/ user defined datatype


           Teacher t1 = new Teacher();

           /*
             new Teacher()  ---> it will create an object
             t1---> reference variable that is storing the ref of the object
             Teacher ---> Teacher user defined data types


            */
           t1.setName("rahul");
           t1.setGrade('A');

           t1.teach();


    }
}
