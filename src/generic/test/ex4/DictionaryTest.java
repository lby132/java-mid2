package generic.test.ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    private static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");

            String word = sc.next();
            if (word.equals("q")) {
                search(sc);
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String ko = sc.next();
            map.put(word, ko);
        }

    }

    private static void search(Scanner sc) {
        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q') : ");

            String word = sc.next();
            if (word.equals("q")) {
                break;
            }
            DictionaryTest dt = new DictionaryTest();
            dt.disSearch(word);
        }
    }

    private void disSearch(String word) {
        String s1 = map.get(word);
        if (s1 == null) {
            System.out.println(word + "은(는) 사전에 없는 단어입니다.");
        } else {
            String s = word + "의 뜻: " + map.get(word);
            System.out.println(s);
        }

    }
}
