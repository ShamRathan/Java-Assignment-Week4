import java.util.PriorityQueue;
public class priority {
    public static void main(String[] args) {
        PriorityQueue<String> arr = new PriorityQueue<String>();
        arr.add("100");
        arr.add("200");
        arr.add("500");
        arr.add("300");
        arr.add("700");
        arr.add("400");
        System.out.println("Original:"+arr);
        String x = arr.toString();
        System.out.println("String representation: "+x);
    }
}
