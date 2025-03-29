import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //List<String> shoppingList = new ArrayList<>();
        //Here I am using arraylist and perform write operation while reading it will throw
        //ConcurrentModificationException to avoid this we are using CopyOnWriteArrayList below is the modified line

        List<String> shoppingList = new CopyOnWriteArrayList<>();
        //This line does not throw any exception

        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("Farsan");
        shoppingList.add("Oats");

        for(String item: shoppingList){
            if(item.equals("Bread")){
                shoppingList.add("Butter");
                System.out.println("Coz bread needs butter");
            }
            System.out.println(item);
        }
    }
}