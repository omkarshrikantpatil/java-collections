import java.util.Comparator;

public class MyStringComparator implements Comparator<String> {

  //For ascending order
  @Override
  public int compare(String s1, String s2){
    return s1.length() - s2.length();
  }
}
