package generic.test.link;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("첫 번째 항목에 추가");
        list.add(0, "d");
        System.out.println(list);

        System.out.println("첫 번째 항목에 삭제");
        list.remove(0);

        // 중간 항목에 추가, 삭제
        list.add(1, "e");
    }
}
