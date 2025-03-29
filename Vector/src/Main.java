import java.util.LinkedList;
import java.util.Vector;

public class Main {

  public static void main(String[] args) {

    System.out.println("Hello world!");
    Vector<Integer> vector = new Vector<>(5, 3);
    vector.add(7);
    vector.add(6);
    vector.add(5);
    vector.add(3);
    vector.add(1);
    System.out.println(vector.capacity());
    vector.add(2);
    System.out.println(vector.capacity());
    vector.remove(2);
    System.out.println(vector);

    //you can add collection in a vector
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    Vector<Integer> vector1 = new Vector<>(linkedList);

    System.out.println(vector1);
    vector1.remove(linkedList);
    System.out.println(vector1);

  }
}