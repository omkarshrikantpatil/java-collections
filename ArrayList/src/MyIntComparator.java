import java.util.Comparator;

public class MyIntComparator implements Comparator<Integer> {

    //For ascending order
//    @Override
//    public int compare(Integer o1, Integer o2) {
//       return o1 - o2;
//    }

  //For descending order
  @Override
  public int compare(Integer o1, Integer o2) {
    return o2 - o1;
  }
}
