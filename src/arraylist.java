import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("sai");
        arr.add("som");
        arr.add("bala");
        System.out.println("String 1: "+arr);
        ArrayList<String> arr1=new ArrayList<String>();
        arr1.add("Java");
        arr1.add("Python");
        arr1.add("HTML");
        System.out.println("String 2: "+arr1);
        ArrayList<String> arr2=new ArrayList<String>();
        arr2.addAll(arr);
        arr2.addAll(arr1);
        System.out.println("Joined string: "+arr2);
    }
}


