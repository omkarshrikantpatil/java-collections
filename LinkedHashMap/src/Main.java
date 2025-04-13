import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //LinkedHash map maintain the insertion order
        //LinkedHashMap is a subclass of HashMap
        //access order is by default false here I make it true to check how insertion order change after get the element
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true);
        linkedHashMap.put("Guvaa", 1);
        linkedHashMap.put("Mango", 2);
        linkedHashMap.put("Grapes", 3);

        linkedHashMap.get("Mango"); //after writing this line and running the code the Mango is at the end
        linkedHashMap.get("Guvaa"); //after writing this line and running the code the Guvaa is at the end
        //we can use this functionality in some business use cases
        //suppose you are doing caching so if you want to remove least used key, value pair, you can remove top one

        for(Map.Entry<String, Integer> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Convert hashMap into linkedHashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap1 = new LinkedHashMap<>(hashMap);
    }
}