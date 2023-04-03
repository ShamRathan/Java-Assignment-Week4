import java.util.HashMap;
public class collection {
    public static void main(String args[]){
        HashMap<Integer,String> arr= new HashMap<Integer,String>();
        arr.put(1,"Breakfast");
        arr.put(3,"Lunch");
        arr.put(4,"Snacks");
        arr.put(5,"Dinner");
        arr.put(2,"Break");
        System.out.println("Collection view: "+ arr.values());
    }
}

