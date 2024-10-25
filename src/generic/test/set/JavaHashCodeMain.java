package generic.test.set;

import generic.test.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        //hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
