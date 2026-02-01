class Student {
   // has part
    private String name;
    private String id;
    private int rollNumber;

    String getName(){
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getId(){
        return this.id;
    }

    void setId(String id) {
        this.id = id;
    }

    int getRoleNumber(){
        return this.rollNumber;
    }

    void setRoleNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    boolean isValidStudent(int rollNumber) {
        return this.rollNumber == rollNumber;
    }

    void printStudentDetails(){
        System.out.println("name"+this.name);
    }


}

public class TestObjectCreation1 {
       public static void main(String[] teja){
              Student st1 = new Student();
              st1.setName("Teja Golla");
              st1.setId("2k18/coe/035");
              st1.setRoleNumber(35);

              st1.printStudentDetails();

       }
}
