import java.util.HashMap;
import java.util.Set;
public class setview {
    public static void main(String args[]){
        HashMap<Integer,String> arr= new HashMap<Integer,String>();
        arr.put(1,"A");
        arr.put(2,"B");
        arr.put(3,"C");
        arr.put(4,"D");
        arr.put(5,"E");
        Set x = arr.keySet();
        System.out.println("set view of the keys contained in this map: "+x);
    }
}