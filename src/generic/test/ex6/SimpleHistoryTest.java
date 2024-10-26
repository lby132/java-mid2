package generic.test.ex6;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");

        System.out.println("stack.poll() = " + stack.pop());
        System.out.println("stack.poll() = " + stack.pop());
        System.out.println("stack.poll() = " + stack.pop());
        System.out.println(stack);
    }
}