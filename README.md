# Java-Assignment-Week4
## Name  : S.Sham Rathan
## Reg.no: 21221230093
### 1.Write a Java program to join two array lists.
```
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
```
![image](https://user-images.githubusercontent.com/93587823/229408135-60a26999-a7da-4a97-818a-ebd9ad69111e.png)
### 2.Write a Java program to retrieve but does not remove, the first element of a linked list.
```
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
```
![image](https://user-images.githubusercontent.com/93587823/229408592-a48fbc94-b3e7-4bed-aa45-636bb6623532.png)
### 3.Write a Java program to check if a particular element exists in a linked list.
````
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
```
![image](https://user-images.githubusercontent.com/93587823/229409001-3892baca-9e9e-4b92-8f62-0db47d5bfe5d.png)
