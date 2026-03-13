enum Week {
    SAT,SUN,MON,TUE,WED,THUR,FRI
}

// enum is used to collect const values that never change throughout the app
// constant value we always write in the capital letters it is standard that is used in the company.
public class EnumLearn {
    public static void main(String[] args){
          Week day = Week.SAT;
        System.out.println(day);
    }
}
