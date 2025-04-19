import java.util.concurrent.ConcurrentSkipListMap;

public class Main {
    public static void main(String[] args) {
        //MAP --> SORTED --> Thread Safe
        //Probabilistic data structure that allows for efficient search, insertion, deletion operations

        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        //You can see the demo in multithreaded enviroment
    }
}