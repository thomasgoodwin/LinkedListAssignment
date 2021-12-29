public class LinkedList {
    public Node front() {
        return null;
    }

    public Node back() {
        return null;
    }

    public void push_front(Node newNode) {
    }

    public void push_back(Node newNode) {
    }

    public void pop_front() {
    }

    public void pop_back() {
    }

    public int size() {
        return 0;
    }

    public void print() {
        if (head == null) {
            System.out.println("");
            return;
        }
        Node current = head;
        System.out.print(current.data);
        while (current.next != null) {
            current = current.next;
            System.out.print(", " + current.data);
        }
        System.out.println("");
    }

    public Node head = null;
}
