import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
    public static void main(String[] args){
         HashMap<Integer,Integer> mp = new HashMap<>();
         mp.put(1,1);
         mp.put(2,2);
         mp.put(3,3);
         mp.put(3,4);


          Set<Integer> st = mp.keySet();
          Iterator it = st.iterator();
          while(it.hasNext()){
              Integer key = (Integer)it.next();
              System.out.println(key+mp.get(key));
              if(key.equals(1))
                    it.remove();
          }

          mp.forEach((key,val)-> System.out.println(key+":"+val));

    }
}
