package generic.test.map;

import java.util.*;

public class JavaMapMain {

    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());
//
//        HashMap<String, Integer> studentMap = new HashMap<>();
//
//        studentMap.put("studentA", 50);
//        System.out.println(studentMap);
//
//        // 학생이 없는 경우에만 추가
//        studentMap.putIfAbsent("studentA", 100);
//        studentMap.putIfAbsent("studentB", 100);
//        System.out.println(studentMap);
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map);
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "=" + map.get(key) + " ");
        }
        System.out.println();
    }
}
