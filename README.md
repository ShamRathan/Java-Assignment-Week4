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
### 4.Write a Java program to remove all of the elements from a hash set.
```
import java.util.HashSet;
public class hashset
{
    public static void main(String[] args)
    {
        HashSet<String> arr=new HashSet<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        System.out.println("Original: "+arr);
        arr.clear();
        System.out.println("Removed all the elements from the list: "+arr);
    }
}
```
![image](https://user-images.githubusercontent.com/93587823/229416967-67f591a1-eb24-4eae-bbe1-9b3f610eeac9.png)
### 5.Write a Java program to compare two hash set.
```
import java.util.HashSet;
public class compare {
    public static void main(String[] args) {
        HashSet<String> arr=new HashSet<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        System.out.println("Set 1: "+arr);
        HashSet<String> arr1=new HashSet<>();
        arr1.add("A");
        arr1.add("L");
        arr1.add("C");
        arr1.add("J");
        arr1.add("E");
        System.out.println("Set 2: "+arr1);
        boolean isEquals = arr.equals(arr1);
        System.out.println("By comparing two set is set1 and set2 equal? : "+isEquals);
    }
}
```
![image](https://user-images.githubusercontent.com/93587823/229417272-3ccfedb0-d243-4e57-8aa6-2cd0321f2b32.png)
### 7.Write a Java program to retrieve and remove the last element of a tree set.
```
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
```
![image](https://user-images.githubusercontent.com/93587823/229417993-b599e353-6b77-4432-89ed-9ec3c8e8e38f.png)
### 8.Write a Java program to convert a Priority Queue elements to a string representation.
```
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

```
![image](https://user-images.githubusercontent.com/93587823/229419111-914a5fcc-c1f2-43bd-9540-bc91bca3b6ff.png)

```
### 9.Write a Java program to get a collection view of the values contained in this map.
```
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
```
![image](https://user-images.githubusercontent.com/93587823/229422214-d0354a38-ed5d-44d9-89e1-7975f5a4fa73.png)
### 10.Write a Java program to get a set view of the keys contained in this map
```
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
```
![image](https://user-images.githubusercontent.com/93587823/229422501-afdc7dea-bc02-471e-9351-74b72e0c6770.png)
### 11.Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
```
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
```
![image](https://user-images.githubusercontent.com/93587823/229423078-6b29ac65-31a5-4421-9fb8-43bf8a35547c.png)
### 12.Write a Java program to get the least key greater than or equal to the given key .Returns null if there is no such key.
```
import java.util.*;
public class leastkey {
    public static void main(String args[]) {
        TreeMap < Integer, String > arr = new TreeMap < Integer, String > ();
        arr.put(1,"A");
        arr.put(2,"B");
        arr.put(3,"C");
        arr.put(4,"D");
        arr.put(5,"E");
        System.out.println("Original: " + arr);
        System.out.println("Keys greater than or equal to 1: " + arr.ceilingKey(1));
        System.out.println("Keys greater than or equal to 3: " + arr.ceilingKey(3));
        System.out.println("Keys greater than or equal to 6: " + arr.ceilingKey(6));
    }}
```
![image](https://user-images.githubusercontent.com/93587823/229423455-2893c719-c7fc-4888-988e-1d775dc9c343.png)
