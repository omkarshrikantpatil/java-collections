import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(30);
        linkedList.add(20);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.addLast(29);
        linkedList.addLast(23);
        linkedList.removeIf(x -> x % 2 != 0);
        System.out.println(linkedList);

    }
}

