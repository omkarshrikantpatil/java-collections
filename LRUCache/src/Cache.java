import java.util.LinkedHashMap;
import java.util.Map;

//In this LRUChache the one which is in the least use that will be removed after capacity is full
public class Cache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public Cache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        Cache<String, Integer> studentMap = new Cache<>(3);
        studentMap.put("Bon", 99);
        studentMap.put("Gibu", 20);
        studentMap.put("simu", 10);
        studentMap.get("Bon");
        studentMap.put("vasu", 31);

        System.out.println(studentMap);

    }
}