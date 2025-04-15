import java.util.IdentityHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String key1 = new String("Key");
        String key2 = new String("Key");
        Map<String, Integer> map = new IdentityHashMap<>();
        //IdentityHashMap bascially checks the memory addres of the object not the content so it will print the both it will not replace key1 value with key2
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);
    }
}