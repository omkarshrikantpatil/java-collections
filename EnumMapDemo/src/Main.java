import java.util.EnumMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Day, Integer> enumMap = new EnumMap(Day.class);
        enumMap.put(Day.TUESDAY, 2);
        enumMap.put(Day.MONDAY, 1);
        System.out.println(enumMap);
    }
}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
}