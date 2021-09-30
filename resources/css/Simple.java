import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simple{

     public static void main(String []args){
          Map<Integer, Integer> mp=new HashMap<>();
          mp.put(1,1);
           mp.put(2,2);
            mp.put(3,3);
             mp.put(4,4);
          for(Map.Entry e:mp.entrySet()){
               System.out.println(e.getKey()+","+e.getValue());
          }
       List<Integer> lst = Arrays.asList(1,3,4,7,8,9,4,2,5,7);

for(int elt:lst){
if(lst.contains(elt)){
System.out.println(elt);
break;
}
}
     }
}