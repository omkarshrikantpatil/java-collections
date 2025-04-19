import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        //Java 7 - segement based locking - 16 segments - smaller hashmaps
        //Only the segment being written to or read from is locked
        //read: do not require locking unless there is a write operation happening on the same segment
        //write : lock

        //java 8 - No segmentation
        //       - compare and swap approach - no locking except resizing or collision
        //Thread A last saw - X = 45
        //Thread A work - X to 50
        //If X is still 45, then change it to 50 else don't change and retry


    }
}