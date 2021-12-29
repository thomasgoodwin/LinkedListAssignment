public class Node {
    public Node(String newData, Node nextNode) {
        next = nextNode;
        data = newData;
    }

    String data;
    Node next;
}