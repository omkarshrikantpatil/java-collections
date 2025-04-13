import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Map<Integer, String> myMap = new HashMap<>();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Omkar");
        map.put(2, "Vasu");
        map.put(3, "Sam");
        //In below line you are replacing Sam with Pro
        map.put(3, "Pro");

        System.out.println(map.get(2));
        System.out.println(map.containsKey(3));

        for(int i : map.keySet()){
            System.out.print(map.get(i) + " ");
        }

        Set<Map.Entry<Integer, String>> entries =  map.entrySet();
        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getValue().toUpperCase());
        }


    }
}