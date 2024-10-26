package generic.test.ex4;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        String[] s = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : s) {
//            Integer count = map.get(word);
//            if (count == null) {
//                count = 0;
//            }
//            count++;
            Integer count = map.getOrDefault(word, 0); // null이면 0을 넣는다.
            count++;
            map.put(word, count);
        }
        System.out.println("map = " + map);
    }
}
