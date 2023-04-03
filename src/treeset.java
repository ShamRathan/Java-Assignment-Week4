import java.util.TreeSet;
public class treeset {
    public static void main(String[] args) {
        TreeSet<String> arr = new TreeSet<>();
        arr.add("BMW");
        arr.add("Audi");
        arr.add("Benz");
        arr.add("Jagur");
        arr.add("Ducati");
        System.out.println("Original:" + arr);
        System.out.println("Removing the last element: "+arr.pollLast());
        System.out.println("Tree set after removing last element:"+arr);
    }
}
