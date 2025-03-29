import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek()); //Get the last element added
        System.out.println(stack.pop()); //remove the last element added
        System.out.println(stack.search(2));//search the index of the object, index start from one
        System.out.println(stack.isEmpty());//check is empty or not
        System.out.println(stack.size());//check the size

        //We can implement stack using LinkList as well
        //But these are not build for stack implementation
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(linkedList.getLast()); //peek
        System.out.println(linkedList.removeLast()); //pop
        System.out.println(linkedList.contains(2)); //search
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());

        //We can do that using ArrayList as well
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4 ,5, 6));
        System.out.println(arrayList.size() - 1);//Peek
        System.out.println(arrayList.remove(arrayList.size() - 1));//Pop
        System.out.println(arrayList.indexOf(2));//search
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());


    }
}