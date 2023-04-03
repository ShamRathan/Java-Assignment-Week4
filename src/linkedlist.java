import java.util.LinkedList;
public class linkedlist
{
    public static void main(String[] args)
    {
        LinkedList <String> arr=new LinkedList<String>();
        arr.add("Apple");
        arr.add("Ball");
        arr.add("Cat");
        arr.add("Dog");
        arr.add("Ear");
        String x= arr.peek();
        System.out.println("Original: "+arr);
        System.out.println("First element: "+x);
    }
}



