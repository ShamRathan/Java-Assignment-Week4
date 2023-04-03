import java.util.LinkedList;

public class linkedlist2 {
    public static void main(String[] args)
    {
        LinkedList<String> arr=new LinkedList<String>();
        arr.add("Apple");
        arr.add("Ball");
        arr.add("Cat");
        arr.add("Dog");
        arr.add("Ear");
        System.out.println("Original: "+arr);
        if(arr.contains("Ball")){
            System.out.println("Ball - The element exists");
        }
        else{
            System.out.println("Ball - The element does not exists");
        }
        if(arr.contains("Tiger")){
            System.out.println("Tiger - The element exists");
        }
        else{
            System.out.println("Tiger - The element does not exists");
        }
    }
}


