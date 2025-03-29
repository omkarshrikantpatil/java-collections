import java.util.ArrayList;
import java.util.Vector;

public class CheckThreadSaftey {

    public static void main(String[] args){
        //ArrayList is not thread safe
        //eg.
        ArrayList<Integer> arrayList = new ArrayList<>();
        //Vector is thread safe comment above code line and comment out below one
        //Vector<Integer> arrayList = new Vector<>();
        Thread t1 = new Thread(()->{
            for(int i=0; i<1000; i++){
                arrayList.add(i);
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0; i<1000; i++){
                arrayList.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(arrayList.size());
        //Output will vary everytime if ArrayList and if Vector will get the same output
    }

}
