import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Omkar", 2);
        map.put("Vasu", 3);
        Map<String, Integer> map1 = Collections.unmodifiableMap(map);

        //map.put("Sam", 4); //I can do this coz it will change the original one
        //To avoid this we have below options

        //.of
        Map<String, Integer> map2 = Map.of("Omkar", 2, "Vasu", 3); //you are not able to modify it
        //but here also the limit you can add only 10 key value pairs

        //.ofEntries
        Map<String, Integer> map3 = Map.ofEntries(Map.entry("Om", 5), Map.entry("Sam", 6));
        //No limit to add key-value pairs

    }
}
