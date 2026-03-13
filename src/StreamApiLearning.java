import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiLearning {
    public static void test(List<Integer> list, int x){
        list.set(0,100);
        x=10;
    }
    public static void main(String[] args){
        // source   intermediate   terminal
        // bucket filled with water, pipe  , collecting
        int x = 5;
        List<Integer> list = Arrays.asList(1,2,3,4,5,5);  // bucket with numbers(source)
        test(list,x);  // call by ref
        Stream<Integer> stream = list.stream();   // created pipe

        Stream<Integer> evenStream = stream.filter((e)-> e%2 == 0);

        evenStream.forEach((e)-> System.out.println(e));

        //
        list.stream()
                .filter((e)->e%2==0)
                .forEach((e)-> System.out.println(e));
        ArrayList<Integer> even = new ArrayList<>();
           for(Integer i : list){
               if(i%2 == 0){
                   even.add(i);
               }
           }
           for(Integer e : even){
               System.out.println(e);
           }





    }
}
