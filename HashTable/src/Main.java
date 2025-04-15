import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        //HashTable is synchronized (Thread Safe)
        //HashTable does not allow null values
        //Legacy class now replaced with concurrent hashmap
        //Slower than hashMap
        //ALl methods are synchronized
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(5, "five");
        hashtable.put(7, "Seven");


        Hashtable<Integer, String> map = new Hashtable<>();
        Thread thread1 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                map.put(i, "Thread1");
            }
        });
        Thread thread2 = new Thread(()->{
            for(int i=1000; i<2000; i++){
                map.put(i, "Thread2");
            }
        });
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(map.size());
    }
}