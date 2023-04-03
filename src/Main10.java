import java.util.*;
public class Main10 {
    public static void main(String args[]) {
        TreeMap < Integer, String > arr = new TreeMap < Integer, String > ();
        arr.put(1,"A");
        arr.put(2,"B");
        arr.put(3,"C");
        arr.put(4,"D");
        arr.put(5,"E");
        System.out.println("Original: " + arr);
        System.out.println("Keys greater than or equal to 1: " + arr.ceilingEntry(1));
        System.out.println("Keys greater than or equal to 3: " + arr.ceilingEntry(3));
        System.out.println("Keys greater than or equal to 6: " + arr.ceilingEntry(6));
    }
}
