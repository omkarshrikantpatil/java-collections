import java.util.*;

public class Main {
    public static void main(String[] args) {

      System.out.println("Welcome to Java with Omkar!");

      //ArrayList
      ArrayList<Integer> list = new ArrayList<>();
      list.add(30);
      list.add(20);
      list.add(10);
      System.out.println(list.indexOf(20));
      System.out.println(list.get(2));
      System.out.println(list.size());

      System.out.println("Using for loop");
      for (int i = 0; i < list.size(); i++) {
        if (i == list.size() - 1) {
          System.out.println(list.get(i) + " ");
          break;
        }
        System.out.print(list.get(i) + " ");
      }

      //For each
      System.out.println("Using for each");
      for (int i : list) {
        System.out.print(i + " ");
      }

      //You can directly print as well because internally it is using toString() method
      System.out.println(list);

      //asList
      //In asList you are not able to add or remove the elements
      List<String> list2 = Arrays.asList("Omkar", "Prasad", "Arti", "Samruddhi");
      //but you can set the elements
      list2.set(3, "Sam");
      System.out.println(list2);
      //we can pass the array as well
      String[] myArray = {"Virat", "Anushka", "Kohli", "Sharma"};
      List<String> myList = Arrays.asList(myArray);
      //For ascending order
      myList.sort(Comparator.comparingInt(String::length));
      System.out.println(myList);

      //List.of
      //Here you are not able to modify as well, It's immutable
      List<Integer> list3 = List.of(1, 2, 3, 4);
      try {
        list3.set(2, 3);
      } catch (Exception e) {
        System.out.println("List.of is immutable");
      }

      System.out.println(list3);

      //Arraylist with intial capacity 20
      ArrayList<Integer> intialCapacityTwenty = new ArrayList<>(20);

      //Creating an arraylist from another collection
      ArrayList<Integer> list4 = new ArrayList<>(list3);
      list4.add(90);
      System.out.println(list4); //Output: 1,2,3,4,90

      ArrayList<Integer> list5 = new ArrayList<>();
      list5.add(23);
      list5.add(2);
      list5.add(43);
      list5.add(4);

      //removing by index
      //list5.remove(1);

      //removing by value
      //list5.remove(Integer.valueOf(3));
      //System.out.println(list5);

      //Converting list to array
      Object[] aray = list5.toArray();
      list5.toArray(new Integer[0]);

      Collections.sort(list5);
      System.out.println(list5);

      MyIntComparator myIntComparator = new MyIntComparator();
      list5.sort(myIntComparator);
      System.out.println(list5);

      ArrayList<String> compareList = new ArrayList<>();
      compareList.add("Omkar");
      compareList.add("Arti");
      compareList.add("Sam");
      compareList.add("Prasad");

      MyStringComparator myStringComparator = new MyStringComparator();
      compareList.sort(myStringComparator);
      System.out.println(compareList);

      ArrayList<MyClass> students = new ArrayList<>();
//      students.add(new MyClass("Akshit", 5));
//      students.add(new MyClass("Bob", 7));
//      students.add(new MyClass("Alice", 6));
//      students.add(new MyClass("Charlie", 6));

      //For sorting
      students.sort((o1, o2) -> o2.getStudentGpa() - o1.getStudentGpa());
      //Above code man ki aakho se dekho aisa dikhega - >
      //if(o2 - o1 > 0){ return 1 } else if(o2 - o1 < 0){return -1} else return 0
      //Arti, Omkar, Sam, Pro, Kittu
//      for(MyClass s: students){
//        System.out.println(s.getStudentName() + " " + s.getStudentGpa());
//      }

      //Descending Sorting using Comparator
      Comparator<MyClass> comparator = Comparator.comparing(MyClass::getStudentGpa);
      //Ascending sorting using comparator
      Comparator<MyClass> comparator1 = Comparator.comparing(MyClass::getStudentGpa).reversed();
      //Collections.sort(students, comparator);

      //Manual sorting descending order
//      students.sort((o1, o2)->{
//        if(o2.getStudentGpa() - o1.getStudentGpa() > 0){
//          return 1;
//        }else if(o2.getStudentGpa() - o1.getStudentGpa() < 0){
//          return -1;
//        }else{
//          return o2.getStudentName().compareTo(o1.getStudentName());
//        }
//      });

      //Manual sorting ascending order
      students.sort((o1, o2)->{
        if(o1.getStudentGpa() - o2.getStudentGpa() > 0){
          return -1;
        }else if(o1.getStudentGpa() - o2.getStudentGpa() < 0){
          return 1;
        }else{
          return 0;
        }
      });


      for(MyClass s: students){
        System.out.println(s.getStudentName() + " " + s.getStudentGpa());
      }
    }
}