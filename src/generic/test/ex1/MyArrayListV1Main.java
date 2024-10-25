package generic.test.ex1;

public class MyArrayListV1Main {

    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("데이터추가");
        System.out.println("list = " + list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
    }
}
