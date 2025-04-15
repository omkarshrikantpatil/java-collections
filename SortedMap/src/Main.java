import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Sorted map is an interface that extends map and guarantees
        // that the entries are sorted based on the keys, either in their natural ordering or by specified comparator.
        //Treemap is a self balancing binary search tree
        //Treemap implemented SortedMap & NavigableMap extends SortedMap
        //NavigableMap providing more powerful options such as finding closest matching key or retrieving the map in reverse order
        SortedMap<Integer, String> sortedMap = new TreeMap<>((b, a)-> a - b);
        sortedMap.put(20, "Omkar");
        sortedMap.put(10,"Vasuu");
        sortedMap.put(40,"Sam");
        sortedMap.put(30, "Kittu");
        System.out.println(sortedMap);

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(30)); //exclude
        System.out.println(sortedMap.tailMap(30)); //include


        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(5, "five");
        navigableMap.put(2, "Two");
        navigableMap.put(7, "Seven");
        System.out.println(navigableMap);

        System.out.println(navigableMap.ceilingKey(6));
        System.out.println(navigableMap.floorKey(2));
    }
}