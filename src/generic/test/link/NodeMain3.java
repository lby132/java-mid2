package generic.test.link;

public class NodeMain3 {

    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("연결된 노드 출력");
        printAll(first);

        Node lastNode = getLastNode(first);
        System.out.println(lastNode);

        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);

        add(first, "D");
        System.out.println("first = " + first);
        add(first, "E");
        System.out.println("first = " + first);
    }

    private static Node add(Node first, String d) {
        Node lastNode = getLastNode(first);
        lastNode.next = new Node(d);
        return lastNode;
    }

    private static Node getNode(Node first, int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
